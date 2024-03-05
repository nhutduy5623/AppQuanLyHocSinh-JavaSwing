/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Lop;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.type.NullType;
/**
 *
 * @author LNhutDuy
 */
public class LopDAL {
    public Connection conn = ConnMysql.ConnectDB();
    public ArrayList<Lop> showDSLop() {
        ArrayList<Lop> ListLop = new ArrayList<Lop>();
        
        String sql = "SELECT * FROM lop";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Lop lop = new Lop();
                lop.addLop(rs.getInt("MaLop"), rs.getString("TenLop"), rs.getInt("Khoi"), rs.getInt("MaGVCN"));
                String sqlGV = "SELECT * FROM giaovien where MaGV = "+rs.getInt("MaGVCN")+"";
                PreparedStatement psGV = conn.prepareStatement(sqlGV);
                ResultSet rsGV = psGV.executeQuery();
                if(rsGV.next())
                    lop.setTenGVCN(rsGV.getString("TenGV"));
                ListLop.add(lop);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListLop;        
    }
    public boolean addLop(Lop L) {
        String sql = "INSERT INTO lop(MaLop, TenLop, Khoi, MaGVCN) VALUES(?,?,?,?)";
        if(L.getMaGVCN()==-1)
            sql = "INSERT INTO lop(MaLop, TenLop, Khoi, MaGVCN) VALUES(?,?,?,?)";
        String sqlUdGV = "UPDATE `giaovien` SET`ChuNhiem`= 1 WHERE MaGV="+L.getMaGVCN()+"";
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            PreparedStatement psUPGV = conn.prepareStatement(sqlUdGV);
            ps.setInt(1, L.getMaLop());
            ps.setString(2, L.getTenLop());
            ps.setInt(3, L.getTenKhoi());
            if(L.getMaGVCN()!=-1)
            {
                ps.setInt(4, L.getMaGVCN());
                return ps.executeUpdate()>0 && psUPGV.executeUpdate()>0;
            }
            else
            ps.setNull(4, Types.INTEGER);  
            return ps.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean updateLop(Lop L) {
        String sqlLop = "SELECT *FROM lop where MaLop="+L.getMaLop()+"";
        try {
            PreparedStatement psLop = conn.prepareStatement(sqlLop);
            ResultSet rsLop = psLop.executeQuery();
            if(rsLop.next())
            {
                //Thay đổi giáo viên chủ nhiệm
                int MaGVCN_Old = rsLop.getInt("MaGVCN");
                if(L.getMaGVCN()==-2)
                    L.setMaGVCN(MaGVCN_Old);
                if(!rsLop.wasNull())
                {
                    String sqlUPGV = "UPDATE `giaovien` SET `ChuNhiem`=0 WHERE `MaGV`="+MaGVCN_Old+"";
                    conn.prepareStatement(sqlUPGV).executeUpdate();                    
                }     
                
                
                    String sqlUDLop = "UPDATE `lop` SET `TenLop`=? ,`Khoi`=? ,`MaGVCN`=? WHERE `MaLop`=?";
                    PreparedStatement psUPLop = conn.prepareStatement(sqlUDLop);
                    psUPLop.setString(1, L.getTenLop());
                    psUPLop.setInt(2, L.getTenKhoi());         
                    psUPLop.setInt(4, L.getMaLop());
                if(L.getMaGVCN()==-1) {
                    psUPLop.setNull(3, Types.INTEGER);
                } else 
                    psUPLop.setInt(3, L.getMaGVCN());
                String sqlUPGV = "UPDATE `giaovien` SET `ChuNhiem`=1 WHERE `MaGV`="+L.getMaGVCN()+"";
                    conn.prepareStatement(sqlUPGV).executeUpdate();  
                    return psUPLop.executeUpdate()>0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;        
    }
    
    public boolean DelLop(int MaLop, int MaGVCN) {
        //Bỏ GVCN
        String sqlUPGV = "UPDATE `giaovien` SET `ChuNhiem`=0 WHERE `MaGV`="+MaGVCN+"";
        String sqlDelLop = "DELETE FROM `lop` WHERE MaLop="+MaLop+"";
        try {  
            conn.prepareStatement(sqlUPGV).executeUpdate();
            return conn.prepareStatement(sqlDelLop).executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int creaMaLop() {
        String sql = "SELECT MAX(MaLop) as Ma FROM `lop`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                return rs.getInt("Ma")+1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LopDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
}

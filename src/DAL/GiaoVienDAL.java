/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.GiaoVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LNhutDuy
 */
public class GiaoVienDAL {
    public Connection conn = ConnMysql.ConnectDB();
    public ArrayList<GiaoVien> ShowDSGV() {
        ArrayList<GiaoVien> listGV = new ArrayList<>();
        String sql = "SELECT * FROM giaovien";
            PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                String sqlMH = "SELECT * FROM monhoc where MaMH="+rs.getInt("MaMH")+"";
                PreparedStatement ps_MH = conn.prepareStatement(sqlMH);
                ResultSet rs_MH = ps_MH.executeQuery();
                String sqlTTGV = "SELECT * FROM thongtingv where MaGV="+rs.getInt("MaGV")+"";
                PreparedStatement ps_TT = conn.prepareStatement(sqlTTGV);
                ResultSet rs_TT = ps_TT.executeQuery();                
                GiaoVien GV = new GiaoVien();
                GV.addGV(rs.getInt("MaGV"), rs.getString("TenGV"), rs.getInt("MaMH"));
                GV.setTinhTrang(rs.getInt("TinhTrang"));
                if(rs_TT.next())
                    GV.addGV(rs.getInt("MaGV"), rs.getString("TenGV"), rs.getInt("MaMH"), rs_TT.getInt("NamSinh"), rs_TT.getString("Email"), rs_TT.getString("SDT"), rs_TT.getString("DiaChi"));
                if(rs_MH.next())
                {
                    String TenMH = rs_MH.getString("TenMH");
                    GV.setTenMH(TenMH);
                }
                listGV.add(GV); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }         
        return listGV;
    }
    
    
    public boolean AddGV(GiaoVien GV) {
        try {
            String sqlMH = "SELECT * FROM monhoc where TenMH='"+GV.getTenMH()+"'";
                PreparedStatement ps_MH = conn.prepareStatement(sqlMH);
                ResultSet rs_MH = ps_MH.executeQuery();
                if(rs_MH.next())
                {
                    int MaMH = rs_MH.getInt("MaMH");
                    GV.setMaMH(MaMH);
                }
                //INSERT GiaoVien
            String sql = "INSERT INTO giaovien(MaGV, TenGV, MaMH, TinhTrang) Values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, GV.getMaGV());
            ps.setString(2, GV.getTenGV());
            ps.setInt(3, GV.getMaMH());
            ps.setInt(4, GV.getTinhTrang());
            System.out.println(GV.getMaMH());
            
                //INSERT TTGV
            String sqlTT = "INSERT INTO `thongtingv`(`MaGV`, `SDT`, `DiaChi`, `NamSinh`, `Email`) VALUES (?,?,?,?,?)";
            PreparedStatement psTT = conn.prepareStatement(sqlTT);
            psTT.setInt(1, GV.getMaGV());
            psTT.setString(2, GV.getSDT());
            psTT.setString(3, GV.getDiaChi());
            psTT.setInt(4, GV.getNamSinh());
            psTT.setString(5, GV.getEmail());
            System.out.println(GV.getMaMH());
            
                //INSERT TK
            String sqlTK = "INSERT INTO `taikhoan`(`MaND`, `TenTK`, `MatKhau`, `MaLoai`) VALUES (?,?,?,?)";
            PreparedStatement psTK = conn.prepareStatement(sqlTK);
            psTK.setString(1, "GV_"+GV.getMaGV());
            psTK.setString(2, GV.getSDT());
            psTK.setString(3, GV.getNamSinh()+"");
            psTK.setInt(4, 2);
                
            return ps.executeUpdate()>0 && psTT.executeUpdate()>0 && psTK.executeUpdate()>0;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean UpdateGV(GiaoVien GV) {
        String sql = "UPDATE `giaovien` SET `TenGV`=?, MaMH=?, TinhTrang=? WHERE MaGV=?";
        String sqlTT = "UPDATE `thongtingv` SET `SDT`=?,`DiaChi`=?,`NamSinh`=?,`Email`=? WHERE MaGV=?";
        PreparedStatement ps;
        PreparedStatement psTT;
        try {
            String sqlMH = "SELECT * FROM monhoc where TenMH='"+GV.getTenMH()+"'";
                PreparedStatement ps_MH = conn.prepareStatement(sqlMH);
                ResultSet rs_MH = ps_MH.executeQuery();
                if(rs_MH.next())
                {
                    int MaMH = rs_MH.getInt("MaMH");
                    GV.setMaMH(MaMH);
                }
            ps = conn.prepareStatement(sql);
            ps.setString(1, GV.getTenGV());
            ps.setInt(2, GV.getMaMH());
            ps.setInt(3, GV.getTinhTrang());
            ps.setInt(4, GV.getMaGV());
            
            psTT = conn.prepareStatement(sqlTT);
            psTT.setString(1, GV.getSDT());
            psTT.setString(2, GV.getDiaChi());
            psTT.setInt(3, GV.getNamSinh());
            psTT.setString(4, GV.getEmail());
            psTT.setInt(5, GV.getMaGV());
            return ps.executeUpdate()>0 && psTT.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }         
        System.out.println("False");
        return false;
    }
    public boolean DelGV(int MaGV) {
        String sql = "UPDATE `giaovien` SET `TinhTrang`=? WHERE MaGV=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,MaGV);
            ps.setInt(2,MaGV);
            return ps.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }         
        return false;
    }
    public boolean hasGV(int MaGV) {
    int numRow = 0;
    ArrayList<GiaoVien> listGV = new ArrayList<>();
    String sql = "SELECT * FROM giaovien where MaGV=?";
        PreparedStatement ps;
    try {
        ps = conn.prepareStatement(sql);
        ps.setInt(1, MaGV);
        ResultSet rs = ps.executeQuery();            
        while(rs.next())
            numRow ++;
        if(numRow==1)
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
    }         
    return false;
}
    
    public ArrayList<GiaoVien> ShowDSGV_CCN() {
        ArrayList<GiaoVien> listGV = new ArrayList<>();
        String sql = "SELECT * FROM giaovien where ChuNhiem=0 and TinhTrang=1";
            PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {              
                GiaoVien GV = new GiaoVien();
                GV.setMaGV(rs.getInt("MaGV"));
                GV.setTenGV(rs.getString("TenGV"));
                listGV.add(GV); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }         
        return listGV;
    }
    
}

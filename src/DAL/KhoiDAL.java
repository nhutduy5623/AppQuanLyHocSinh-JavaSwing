/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Khoi;
import GUI.QL_GV_L_MH;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LNhutDuy
 */
public class KhoiDAL {
    public Connection conn = ConnMysql.ConnectDB();
    public ArrayList<Khoi> showDSKhoi() {
        ArrayList<Khoi> ListKhoi = new ArrayList<>();
        String sql = "SELECT * FROM khoi";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Khoi K = new Khoi();
                K.setTenKhoi(rs.getInt("Khoi"));
                ListKhoi.add(K);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QL_GV_L_MH.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ListKhoi;        
    }
    
    public boolean addKhoi(int K) {
        String sql = "INSERT INTO `khoi`(`Khoi`) VALUES (?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, K);
            return ps.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(KhoiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;        
    }
    
    public boolean delKhoi(int K) {
        String sql = "DELETE FROM `khoi` WHERE khoi=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, K);
            return ps.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(KhoiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

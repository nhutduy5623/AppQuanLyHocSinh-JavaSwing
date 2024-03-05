/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import DTO.MonHoc;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LNhutDuy
 */
public class MonHocDAL {
    public Connection conn = ConnMysql.ConnectDB();
    //Hiển Thị Tất Cả
    
    public ArrayList<MonHoc> ShowDSMH() {         
        ArrayList<MonHoc> listMh = new ArrayList<>();
        String sql = "SELECT * FROM monhoc";
            PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                MonHoc mh = new MonHoc();
                mh.AddMH(rs.getInt("MaMH"), rs.getString("TenMH"));  
                listMh.add(mh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }         
        return listMh;
    }
    
    //Thêm
    public boolean AddMH(MonHoc MH) {
        String sql = "INSERT INTO `monhoc`(`MaMH`, `TenMH`) VALUES(?,?)";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,MH.getMaMH());
            ps.setString(2, MH.getTenMH());
            return ps.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }         
        System.out.println("False");
        return false;
    }
    
    //Xoá
    public boolean DelMH(int MaMH) {
        String sql = "DELETE FROM `monhoc` WHERE MaMH=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,MaMH);
            return ps.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }         
        System.out.println("False");
        return false;
    }
    
    //Sửa
    public boolean UpdateMH(MonHoc MH) {
        String sql = "UPDATE `monhoc` SET `TenMH`=? WHERE MaMH=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, MH.getTenMH());
            ps.setInt(2, MH.getMaMH());
            return ps.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(ConnMysql.class.getName()).log(Level.SEVERE, null, ex);
        }         
        System.out.println("False");
        return false;
    }
    
    public boolean hasMH(int MaMH) {
        int numRow = 0;
        ArrayList<MonHoc> listMh = new ArrayList<>();
        String sql = "SELECT * FROM monhoc where MaMH=?";
            PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, MaMH);
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
    
    public static void main(String[] args) {
        System.out.println(new MonHocDAL().conn);
    }
}

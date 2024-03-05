/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.GiaoVien;
import DTO.MonHoc;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LNhutDuy
 */
public class ConnMysql {

    private Connection conn;
    public ConnMysql() {
//        String url = "jdbc:mysql://localhost:3306/qlhs_doan";
//            var user="root";
//            var password="";
//            try{
//                conn = DriverManager.getConnection(url, user, password);
//                System.out.println("Connect Success!");
//            } catch (SQLException e) {
//                System.out.println("Connect Fail!");                
//            }
    }
    public static Connection ConnectDB() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/qlhs_doan";
            var user="root";
            var password="";
            try{
                conn = DriverManager.getConnection(url, user, password);
//                System.out.println("Connect Success!");
            } catch (SQLException e) {
                System.out.println("Connect Fail!");                
            }
        return conn;
    }
    public static void DisConnectDB(Connection con) throws SQLException {
        con.close();
    }
    
    //Môn Học
    
    
    
    
    
    //Giáo Viên
    
    
    
    public static void main(String[] args) {
        ConnMysql con = new ConnMysql();
        ArrayList<MonHoc> monhoc = new ArrayList<>();
        
        for(MonHoc mh:monhoc)
        {
            System.out.println(mh.getMaMH()+"-"+mh.getTenMH());
        }
    }   

      
}



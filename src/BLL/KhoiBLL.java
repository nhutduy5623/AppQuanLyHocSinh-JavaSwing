/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.KhoiDAL;
import DTO.Khoi;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LNhutDuy
 */
public class KhoiBLL {
    ArrayList<Khoi> ListKhoi = new ArrayList<>();
    KhoiDAL KhoiDAL = new KhoiDAL();
    public ArrayList<Khoi> showDSKhoi() {
        return KhoiDAL.showDSKhoi();
    }
    
    public String addKhoi(int K) {
        if(KhoiDAL.addKhoi(K))
            return "";
        return "Khối Đã Tồn Tại";
    }
    
    public String delKhoi(int K) {
        if(KhoiDAL.delKhoi(K))
            return "";
        return "Chỉ có thể xoá những khối không có lớp hoạt động!";
    }
    
}

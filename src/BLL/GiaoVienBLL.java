/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.GiaoVienDAL;
import DTO.GiaoVien;
import java.util.ArrayList;

/**
 *
 * @author LNhutDuy
 */
public class GiaoVienBLL {
    private ArrayList<GiaoVien> GV = new ArrayList<>();
    private GiaoVienDAL DALGV = new GiaoVienDAL();
    public ArrayList<GiaoVien> ShowDSGV() {
        return DALGV.ShowDSGV();
    }   
    public ArrayList<GiaoVien> ShowDSGV_CCN() {
        return DALGV.ShowDSGV_CCN();
    }         
    
    public String AddGV(GiaoVien GV) {
        if(!DALGV.hasGV(GV.getMaGV())) {
            if(DALGV.AddGV(GV))
                return "";
            else
            return "Thêm Giáo Viên Thất Bại";
        }   
        else {
            return "Giáo Viên Đã Tồn Tại!";
        }        
    }
    
    public String UpdateGV(GiaoVien GV) {
        if(DALGV.UpdateGV(GV)) {
            return "";
        } else {
            return "Sửa Giáo Viên Thất Bại";
        }   
        
    }
    
    public String DelGV(int MaGV) {
        if(DALGV.DelGV(MaGV)) {
            return "Đã Xoá Giáo Viên";
        } else {
            return "Xoá Giáo Viên Thất Bại";
        }
    }
}

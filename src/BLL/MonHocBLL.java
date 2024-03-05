/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.MonHocDAL;
import DTO.MonHoc;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author LNhutDuy
 */
public class MonHocBLL {
    private ArrayList<MonHoc> MH = new ArrayList<>();
    private MonHocDAL DALMh = new MonHocDAL();
    public ArrayList<MonHoc> ShowDSMH() {
        return DALMh.ShowDSMH();
    }       
    
    public String AddMH(MonHoc MH) {
        if(!DALMh.hasMH(MH.getMaMH())) {
            if(DALMh.AddMH(MH))
                return "";
            else
            return "Thêm Môn Học Thất Bại";
        }   
        else {
            return "Môn Học Đã Tồn Tại!";
        }        
    }
    
    public String UpdateMH(MonHoc MH) {
        if(DALMh.UpdateMH(MH)) {
            return "Đã Sửa Môn Học";
        } else {
            return "Sửa Môn Học Thất Bại";
        }   
        
    }
    
    public String DelMH(int MaMH) {
        if(DALMh.DelMH(MaMH)) {
            return "Đã Xoá Môn Học";
        } else {
            return "Xoá Môn Học Thất Bại";
        }
    }
}

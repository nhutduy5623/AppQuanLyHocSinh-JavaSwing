/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.LopDAL;
import DTO.Lop;
import java.util.ArrayList;

/**
 *
 * @author LNhutDuy
 */
public class LopBLL {
    LopDAL LopDal = new LopDAL();
    public ArrayList<Lop> showDSLop() {
        return LopDal.showDSLop();
    }
    
    public String addLop(Lop L) {
        if(LopDal.addLop(L)) {
            return "";
        } else 
            return "Thêm lớp không thành công";
    }
    
    public String updateLop(Lop L) {
        if(LopDal.updateLop(L)) {
            return "";
        } else 
            return "Sửa lớp không thành công";
    }
    
    public String DelLop(int MaLop, int MaGVCN) {
        if(LopDal.DelLop(MaLop, MaGVCN)) {
            return "";
        } else 
            return "Xoá lớp không thành công";
    }
    
    public int creaMaLop() {
        return LopDal.creaMaLop();
    }
}

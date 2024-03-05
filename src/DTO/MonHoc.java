/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author LNhutDuy
 */
public class MonHoc {
    private int MaMH;
    private String TenMH;

    public MonHoc(int MaMH, String TenMH) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
    }

    public MonHoc() {
    }
    

    public int getMaMH() {
        return MaMH;
    }

    public void setMaMH(int MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }
    
    public void AddMH(int MaMH, String TenMH) {
        this.MaMH=MaMH;
        this.TenMH=TenMH;   
    }       
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author LNhutDuy
 */
public class Lop {
    private int MaLop;
    private String TenLop;
    private int TenKhoi;
    private int MaGVCN;
    private String TenGVCN;
    public Lop(int MaLop, String TenLop, int TenKhoi) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.TenKhoi = TenKhoi;
    }
    
    public Lop(int MaLop, String TenLop, int TenKhoi, int MaGVCN) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.TenKhoi = TenKhoi;
        this.MaGVCN = MaGVCN;
    }

    public Lop() {
    }
    
    public void addLop(int MaLop, String TenLop, int TenKhoi, int MaGVCN) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.TenKhoi = TenKhoi;
        this.MaGVCN = MaGVCN;
    }

    public String getTenGVCN() {
        return TenGVCN;
    }

    public void setTenGVCN(String TenGVCN) {
        this.TenGVCN = TenGVCN;
    }
    
    public int getMaLop() {
        return MaLop;
    }

    public void setMaLop(int MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public int getTenKhoi() {
        return TenKhoi;
    }

    public void setTenKhoi(int TenKhoi) {
        this.TenKhoi = TenKhoi;
    }

    public int getMaGVCN() {
        return MaGVCN;
    }

    public void setMaGVCN(int MaGVCN) {
        this.MaGVCN = MaGVCN;
    }    
}

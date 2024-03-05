/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author LNhutDuy
 */
public class GiaoVien {
    private int MaGV;
    private String TenGV;
    private int MaMH;
    private String TenMH="";
    private int NamSinh;
    private String Email;
    private String SDT;
    private String DiaChi;
    private int TinhTrang=1;

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public GiaoVien() {
    }
    public void addGV(int MaGV, String TenGV, int MaMH) {
        this.MaGV=MaGV;
        this.TenGV=TenGV;
        this.MaMH=MaMH;
    }
    public void addGV(int MaGV, String TenGV, int MaMH, int NamSinh, String Email, String SDT, String DiaChi) {
        this.MaGV=MaGV;
        this.TenGV=TenGV;
        this.MaMH=MaMH;
        this.NamSinh=NamSinh; 
        this.Email=Email; 
        this.SDT=SDT; 
        this.DiaChi=DiaChi;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    public int getMaGV() {
        return MaGV;
    }

    public void setMaGV(int MaGV) {
        this.MaGV = MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public int getMaMH() {
        return MaMH;
    }

    public void setMaMH(int MaMH) {
        this.MaMH = MaMH;
    }
    
}

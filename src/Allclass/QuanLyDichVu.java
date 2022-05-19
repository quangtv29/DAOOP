/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Allclass;

/**
 *
 * @author Uzumaki Naruto
 */
public class QuanLyDichVu {
    private String maDV ;
    private String tenDV ;
    private Double donGia ;
    private String maNVPhuTrach ;

    public QuanLyDichVu(){
	}

    public QuanLyDichVu(String maDV, String tenDV, Double donGia, String maNVPhuTrach) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.donGia = donGia;
        this.maNVPhuTrach = maNVPhuTrach;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public String getMaNVPhuTrach() {
        return maNVPhuTrach;
    }

    public void setMaNVPhuTrach(String maNVPhuTrach) {
        this.maNVPhuTrach = maNVPhuTrach;
    } 
}

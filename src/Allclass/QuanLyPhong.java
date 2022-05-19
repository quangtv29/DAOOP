/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Allclass;

/**
 *
 * @author MinhNgoc
 */
public class QuanLyPhong {
    private String maPhong;
    private String loaiPhong;
    private double mucGia;
    private String trangThai;

    public QuanLyPhong(String maPhong, String loaiPhong, double mucGia, String trangThai){
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.mucGia = mucGia;
        this.trangThai = trangThai;
    }
    
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }
    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getMucGia() {
        return mucGia;
    }
    public void setMucGia(double mucGia) {
        this.mucGia = mucGia;
    }

    public String getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    public String [] getValues(){           //tra ve 1 mang
        String [] values = new String[4];
        
        values[0] = this.maPhong;
        values[1] = this.loaiPhong;
        values[2] = Double.toString(mucGia);
        values[3] = this.trangThai;
        return values;
    }
}

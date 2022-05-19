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
public class QuanLyDatPhong {
       private String Madatphong;
       private String Makh;
       private String Maphong;
       private String Manv;
       private String Thoigiannhan;
       private String Thoigiantra;

    public QuanLyDatPhong() {
    }

    public QuanLyDatPhong(String Madatphong, String Makh, String Maphong, String Manv, String Thoigiannhan, String Thoigiantra) {
        this.Madatphong = Madatphong;
        this.Makh = Makh;
        this.Maphong = Maphong;
        this.Manv = Manv;
        this.Thoigiannhan = Thoigiannhan;
        this.Thoigiantra = Thoigiantra;
    }

    public String getMadatphong() {
        return Madatphong;
    }

    public void setMadatphong(String Madatphong) {
        this.Madatphong = Madatphong;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getMaphong() {
        return Maphong;
    }

    public void setMaphong(String Maphong) {
        this.Maphong = Maphong;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getThoigiannhan() {
        return Thoigiannhan;
    }

    public void setThoigiannhan(String Thoigiannhan) {
        this.Thoigiannhan = Thoigiannhan;
    }

    public String getThoigiantra() {
        return Thoigiantra;
    }

    public void setThoigiantra(String Thoigiantra) {
        this.Thoigiantra = Thoigiantra;
    }
   
}
//Hoàng : Hoá Đơn + Khách Hàng
// Ngọc : Nhân viên +  Phòng
// Hường : Dịch Vụ + Chi Tiết Dịch Vụ

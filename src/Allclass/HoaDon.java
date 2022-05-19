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
public class HoaDon {
     private String maHD;
     private String maDatPhong;
     private String thoiGianThanhToan;
     private double tienPhong;
     private double tienDichvu;

public HoaDon(String record){
String[] s = new String[5];
s = record.split("\t",5);

maHD = s[0];
maDatPhong = s[1];
thoiGianThanhToan = s[2];
tienPhong = Double.parseDouble(s[3]);
tienDichvu = Double.parseDouble(s[4]);
}

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getmaDatPhong() {
        return maDatPhong;
    }

    public void setmaDatPhong(String maDatPhong) {
        this.maDatPhong = maDatPhong;
    }

    public String getthoiGianThanhToan() {
        return thoiGianThanhToan;
    }
        public void setthoiGianThanhToan(String thoiGianThanhToan) {
        this.thoiGianThanhToan = thoiGianThanhToan;
    }

    public double gettienPhong() {
        return tienPhong;
    }

    public void settienPhong(double tienPhong) {
        this.tienPhong = tienPhong;
    }

    public double gettienDichvu() {
        return tienDichvu;
    }

    public void setTienDichvu(double tienDichvu) {
        this.tienDichvu = tienDichvu;
    }
    public String[] getValues(){
            String[] values = new String[5];
             values[0] = maHD;
             values[1] = maDatPhong;
             values[2] = thoiGianThanhToan;
             values[3] = Double.toString(tienPhong);
             values[4] = Double.toString(tienDichvu);
             return values;
    }

    
}
        

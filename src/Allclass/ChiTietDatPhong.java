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


public class ChiTietDatPhong {
   private String Madatphong;
   private String Maphong;

    public ChiTietDatPhong() {
    }

    public ChiTietDatPhong(String Madatphong, String Maphong) {
        this.Madatphong = Madatphong;
        this.Maphong = Maphong;
    }

    public String getMadatphong() {
        return Madatphong;
    }

    public void setMadatphong(String Madatphong) {
        this.Madatphong = Madatphong;
    }

    public String getMaphong() {
        return Maphong;
    }

    public void setMaphong(String Maphong) {
        this.Maphong = Maphong;
    }
    public String[] getvalues ()
    {
        String [] values = new String [2];
        values[0] = Madatphong;
        values[1] = Maphong;
        return values;
    }
    public void showctdp ()
    {
        System.out.print("Ma dat phong : " + this.Madatphong);
        System.out.println();
         System.out.print("Ma phong : " + this.Maphong);
          System.out.println();
    }
    public static void main(String[] args) {
        ChiTietDatPhong c = new ChiTietDatPhong ("123","123");
        c.showctdp();
    }
}

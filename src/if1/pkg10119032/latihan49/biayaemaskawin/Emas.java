/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan49.biayaemaskawin;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi class Emas
 */
public class Emas {
    private double harga, berat;
    
    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double getBerat() {
        return berat;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public double totalHarga() {
        return harga * berat;
    }
}
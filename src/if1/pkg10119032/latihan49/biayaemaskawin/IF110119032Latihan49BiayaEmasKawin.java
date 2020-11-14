/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan49.biayaemaskawin;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menghitung emas kawin
 * dengan pendekatan berorientasi objek
 */
public class IF110119032Latihan49BiayaEmasKawin {
    public static void main(String[] args) {
        Emas biaya1 = new Emas();
        biaya1.setBerat(15.7);
        biaya1.setHarga(570000);
        
        
        DecimalFormat kurs = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setCurrencySymbol("Rp. ");
        symbol.setGroupingSeparator('.');
        
        kurs.setDecimalFormatSymbols(symbol);
        System.out.println("===Perhitungan Biaya Emas Kawin===");
        System.out.println("Berat Emas : " + biaya1.getBerat() + " gram");
        System.out.println("Harga Emas : ".concat(kurs.format(biaya1.getHarga())).replaceAll(",00", "").concat(" / gram / bulan Oktober"));
        System.out.println("\nTotal biaya : ".concat(kurs.format(biaya1.totalHarga())).replaceAll(",00", ""));
    }
}
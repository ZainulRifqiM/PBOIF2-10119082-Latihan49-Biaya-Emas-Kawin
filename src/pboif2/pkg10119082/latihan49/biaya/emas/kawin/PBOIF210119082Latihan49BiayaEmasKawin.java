/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan49.biaya.emas.kawin;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Bayar Emas Kawin
 */
public class PBOIF210119082Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahar mahar = new Mahar();
        
        mahar.setHargaMahar(570000);
        mahar.setBeratMahar(15.7);
        
        System.out.println("Harga per 1 gram mahar : " + mahar.getHargaMahar());
        System.out.println("Total berat mahar nikah : " + mahar.getBeratMahar());
        System.out.println();
        System.out.println("Total mahar yang harus dibayar oleh hendi : " + mahar.hitungTotalMahar(mahar.getHargaMahar(),mahar.getBeratMahar()));
    }
    
}

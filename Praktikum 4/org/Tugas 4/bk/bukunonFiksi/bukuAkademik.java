/*
 * File : bukuAkademik.java 03/23/2024
 * Penulis :  Aryela Rachma Davina 24060122140174
 * Deskrispsi : representasi dasar dari objek buku Akademik, turunan kelas bukuNonFiksi 
 */

package bukunonFiksi;

public class bukuAkademik extends bukuNonFiksi{
    public bukuAkademik(String judul,String penulis,String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, subjek, jumlahHalaman, harga);
    }     
}


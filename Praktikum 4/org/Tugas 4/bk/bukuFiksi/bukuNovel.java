/*
 * File : bukuNovel.java 03/23/2024
 * Penulis :  Aryela Rachma Davina 24060122140174
 * Deskrispsi : representasi dasar dari objek buku Novel, turunan kelas bukuFiksi 
 */
package bukuFiksi;

public class bukuNovel extends bukuFiksi {
    public  bukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    } 
}

/*
 * File : bukuFiksi.java 03/23/2024
 * Penulis :  Aryela Rachma Davina 24060122140174
 * Deskrispsi : representasi dasar dari objek buku Fiksi, turunan kelas Buku 
 */

 package bukuFiksi;
 import buku.Buku;
 
 public class bukuFiksi  extends Buku{
     //Atribut
     private String genre;
     private int jumlahHalaman; 
     private double harga;
     
 
     public bukuFiksi(String judul,String penulis,String tahunTerbit, String genre, int jumlahHalaman, double harga){
         super(judul, penulis, tahunTerbit);
         this. genre = genre;
         this. jumlahHalaman = jumlahHalaman;
         this. harga = harga;
     }
 
     public String getGenre(){
         return this.genre;
     }
 
     public int getJumlahHalaman(){
         return this.jumlahHalaman;
     }
     public double getHarga(){
         return this.harga;
     }
     public void setGenre(String genre){
         this.genre = genre;
     }
     public void setJumlahHalaman(int jumlahHalaman){
         this.jumlahHalaman = jumlahHalaman;
     }
     public void view(){
         System.out.println("Judul : "+ getJudul());
         System.out.println("Penulis : "+ getPenulis());
         System.out.println("Tahun diterbitkan : "+ getTahunTerbit());
         System.out.println("Genre : "+ getGenre());
         System.out.println("Jumlah halaman : "+ getJumlahHalaman());
         System.out.println("Harga : "+ getHarga());
 
     }   
 }
 
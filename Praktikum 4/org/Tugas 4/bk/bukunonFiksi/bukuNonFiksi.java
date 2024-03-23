/*
 * File : bukuNonFiksi.java 03/23/2024
 * Penulis :  Aryela Rachma Davina 24060122140174
 * Deskrispsi : representasi dasar dari objek buku NonFiksi, turunan kelas Buku 
 */

 package bukunonFiksi;
 import buku.Buku;
 
 public class bukuNonFiksi extends Buku{

     //deklarasi atribut
     private String subjek;
     private int jumlahHalaman;
     private double harga;
     
    //deklarasi konstruktor
     public bukuNonFiksi(String judul,String penulis,String tahunTerbit, String subjek, int jumlahHalaman, double harga){
         super(judul, penulis, tahunTerbit);
         this.subjek = subjek;
         this.jumlahHalaman=jumlahHalaman;
         this.harga = harga;
     }
     
     //deklarasi method
     public String getSubjek(){
         return this.subjek;
     }
     public int getJumlahHalaman(){
         return this.jumlahHalaman;
     }
     public double getHarga(){
         return this.harga;
     }
     public void setSubjek(String subjek){
         this.subjek = subjek;
     }
     public void setJumlahHalaman(int jumlahHalaman){
         this.jumlahHalaman = jumlahHalaman;
     }
     public void view(){
        System.out.println("Judul : "+ getJudul());
        System.out.println("Penulis : "+ getPenulis());
        System.out.println("Tahun diterbitkan : "+ getTahunTerbit());
         System.out.println("Subject : "+ getSubjek());
         System.out.println("Jumlah halaman : "+ getJumlahHalaman());
         System.out.println("Harga : "+ getHarga());
     }
 }
 
 
 
         
         
    
    
 
 
 
 
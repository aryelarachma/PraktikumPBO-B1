/*
 * File : Lingkaran.java 14/07/2024
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 * Penulis :  Aryela Rachma Davina 24060122140174
 */


 public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
 }
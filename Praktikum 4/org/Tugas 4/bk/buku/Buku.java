/*
 * File : Buku.java 03/23/2024
 * Penulis :  Aryela Rachma Davina 24060122140174
 * Deskrispsi : representasi dasar dari objek buku 
 */

package buku;

public class Buku {

    //deklarasi atribut
    private String judul;
    private String penulis;
    private String tahunTerbit;

    //deklarasi konstruktor
    public Buku(String judul, String penulis, String tahunTerbit ){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit =  tahunTerbit;
    }

    //deklarasi method
    public String getJudul(){
        return this.judul;
    }
    public String getPenulis(){
        return this.penulis;
    }
    public String getTahunTerbit(){
        return this.tahunTerbit;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;

    }
    public void view(){
        System.out.println("Judul : "+ getJudul());
        System.out.println("Penulis : "+ getPenulis());
        System.out.println("Tahun diterbitkan : "+ getTahunTerbit());
    }
}
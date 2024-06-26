/*
 * File : BangunDatarGenericTest.java 14/07/2024 
 * Deskripsi : main class untuk generic bangun datar
 * Penulis :  Aryela Rachma Davina 24060122140174
 */


 public class BangunDatarGenericTest{
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic : "+bdg.get().getClass().getName());
    }
 }

 
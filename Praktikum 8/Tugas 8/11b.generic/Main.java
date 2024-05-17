/*
 * File : Main.java 16/07/2024 
 * Deskripsi : main class untuk generic Kupu
 * Penulis : Aryela Rachma Davina 24060122140174
 */


public class Main {
  public static void main(String[] args) {
      // Kamus //    
      Ulat K;                
      Data<Kupu> anu;        

    
      // Algoritma //
      K = new Ulat();        
      anu = new Data<>();    

      anu.setIsi(K);
      anu.getIsi().gerak();

      Kepompong K2 = new Kepompong();
      Data<Kepompong> anu2 = new Data<>();
      anu2.setIsi(K2);
      anu2.getIsi().gerak();

      
      KupuDewasa K3 = new KupuDewasa();
      Data<KupuDewasa> anu3 = new Data<>();
      anu3.setIsi(K3);
      anu3.getIsi().gerak();
  }
}

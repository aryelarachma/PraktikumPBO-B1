/*
 * File : Main.java 16/07/2024 
 * Deskripsi : main class untuk generic Kupu
 * Penulis : Aryela Rachma Davina 24060122140174
 */


public class Main {
  public static void main(String[] args) {
      Ulat K;          
      Data<Kupu> anu;  

      K = new Ulat();       
      anu = new Data<>(); 
      anu.setIsi(K);        
      anu.getIsi().gerak(); 
  }
}

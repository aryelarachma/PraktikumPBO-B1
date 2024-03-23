/*
 * File : Main.java 03/23/2024
 * Penulis :  Aryela Rachma Davina 24060122140174
 * Deskrispsi : driver class untuk buku, bukuFiksi, bukuNovel, bukuNonFiksi, bukuAkademik
 */

 package main;
 import buku.Buku;
 import bukuFiksi.*;
 import bukunonFiksi.*;
 
 public class Main {
     public static void main(String[] args) {
         Buku a = new Buku("DIARY Si Bocah Tengil 1", "Jeff Kinney", "2008");
 
         bukuNovel novel = new bukuNovel("The School For Good and Evil", "Soman Chainani", "2013", "Fantasy", 580, 138750);
         bukuFiksi komik = new bukuFiksi("Detective Conan", "Aoyama Gosho", "1996", "Mistery", 87, 30000);
         
         bukuAkademik akademik = new bukuAkademik("Profesi Kependidikan", "Sri Haryati", "2013", "Profesi", 240, 190000);
         bukuNonFiksi nonFiksi = new bukuNonFiksi("I Want To Die But I Want To Eat Tteokpokki", "Baek Se Hee", "2018", "Psychology", 236, 99000);
         
         System.out.print("==================== Detail Buku: ====================");
         System.out.println("\n1. Buku Novel");
         a.view();
         System.out.print("======================================================");
         System.out.println("\n2. Buku Novel");
         novel.view();
         System.out.print("======================================================");
         System.out.println("\n3. Buku Komik");
         komik.view();
         System.out.print("======================================================");
         System.out.println("\n4. Buku Akademik");
         akademik.view();
         System.out.print("======================================================");
         System.out.println("\n5. Buku Non Fiksi");
         nonFiksi.view();
         System.out.println("======================================================");
     }
     
 }
 
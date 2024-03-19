/**
File: MBujurSangkar.java 19/03/2014
* Penulis: Aryela Rachma Davina
* Deskripsi: kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " +bs.hitungLuas(sisi));
    }
}

/*
 * SOAL
 * apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi 
 * metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 
 * JAWAB
 * yang akan terjadi adalah kelas BujurSangkar tidak dapat diinstansiasi secara langsung karena tidak memenuhi persyaratan sehingga menjadi kelas abstrak yang tidak lengkap.
 */

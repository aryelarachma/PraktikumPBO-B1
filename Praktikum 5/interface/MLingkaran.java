/*File: MLingkaran.java 19/03/2014
* Penulis: Aryela Rachma Davina
* Deskripsi: kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import java.util.Scanner;
public class MLingkaran{
	public static void main(String[] args){
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Masukan jejari lingkaran 1: ");
		double jejari = scan1.nextDouble();

	
		Lingkaran luas = new Lingkaran(jejari);
		
		System.out.println("Luas lingkaran 1 adalah " +luas.hitungLuas());

		System.out.println("Masukan jejari lingkaran 2: ");
		double jejari2 = scan2.nextDouble();

		Lingkaran luas2 = new Lingkaran(jejari2);

		System.out.println("Luas lingkaran 2 adalah " +luas2.hitungLuas());
		scan1.close();
		scan2.close();
	}

}
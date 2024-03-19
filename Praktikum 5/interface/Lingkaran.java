/**
*File: Lingkaran.java 19/03/2014
* Penulis: Aryela Rachma Davina
* Deskripsi: kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        this.jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
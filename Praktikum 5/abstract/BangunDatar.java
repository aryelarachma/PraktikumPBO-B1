/**
*File: BangunDatar.java 19/03/2014
* Penulis: Aryela Rachma Davina
* Deskripsi: kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        this.luas = l;
    }

    public double getLuas() {
        return luas;
    }
}
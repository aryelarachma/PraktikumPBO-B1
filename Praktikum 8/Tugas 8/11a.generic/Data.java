/*
 * File : Data.java 16/07/2024 
 * Deskripsi : kelas konstruksi generic untuk Kupu
 * Penulis :  Aryela Rachma Davina 24060122140174
 */
public class Data <T extends Kupu>{
    private T isi;

    public T getIsi() {
        return this.isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}

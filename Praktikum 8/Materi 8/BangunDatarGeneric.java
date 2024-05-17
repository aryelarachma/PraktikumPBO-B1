/**
 * File : BangunDatarGeneric.java 14/07/2024
 * Deskripsi : kelas generik dengan batasan tipe
 * Penulis : Aryela Rachma Davina 24060122140174
 * */

/**
  * Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
  * dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !
  *  
  */

public class BangunDatarGeneric<T extends BangunDatar> {
// public class BangunDatarGeneric<T1 extends BangunDatar> {

    private T bangunDatar;
//  private T1 bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    /*  public void set(T1 tipeBangunDatar) {
          bangunDatar = tipeBangunDatar;
       }
    */

    public T get(){
        return bangunDatar;
    }
    /*  public T1 get() {
           return bangunDatar;
     }
     */

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
}
}



/*KESIMPULAN
mengganti karakter T dengan karakter lain tidak akan mengubah kelas generik secara fungsional. 
T hanya merupakan konvensi penamaan untuk tipe parameter generik, dan dapat diganti dengan karakter atau nama lain yang sesuai.
 Yang terpenting adalah mempertahankan konsistensi penggunaan nama tersebut di semua kelas yang ada.
 */
interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = harga ->{
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
        }
    }
/*
 * Soal
 * Compile dan jalankan kode tersebut ! Dapatkah anda membedakan antara bagamana diskonLebaran dan diskonBiasa diimplementasikan ?
 * Pembahasan:
 * Pada diskoLebaran menggunakan implementasi lambda sederhana, tidak menggunakan blok statement{}, 
 *                   Sintaks (harga) -> harga - (harga * 0.4);
 *                   Langsung mengembalikan hasil perhitungan dalam satu baris
 * Pada diskonBiasa Implementasi lambda menggunakan blok statement {}
 *                  menggunakan return untuk mengembalikan hasil.
 *                  Sintaks: (harga) -> {return harga - (harga * 0.1);};
 *                  Cocok untuk logika yang lebih kompleks yang memerlukan lebih dari satu baris kode  
 */
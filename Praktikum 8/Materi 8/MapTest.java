/*
 * File : MapTest.java 14/07/2024
 * Deskripsi : contoh penggunaan kelas collection dengan elemen 
 *              berupa pasangan kunci (K) dan nilai (V), java.util.Map<K,V>.
 * Penulis :  Aryela Rachma Davina 24060122140174
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        
        map.put(1, "Satu");
        map.put(2, "Dua");
        
        
        System.out.println(map.get(1));

        Set<Integer> key = map.keySet();

    
        for(Integer k : key){
            System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
        
        }
        
        
        /* Jawaban 
         * Key: 1, 
         * Nilai: Satu
         * Key: 2,
         * Nilai: Dua
        */
        
    }
}

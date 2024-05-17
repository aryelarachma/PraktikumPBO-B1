/*
 * File : ArrayListTest.java 14/07/2024
 * Deskripsi :  Sebuah model Array yang dapat menampung jumlah elemen objek
 * Penulis :  Aryela Rachma Davina 24060122140174
 */

import java.util.ArrayList;

public class ArrayListTest{
    public static void main (String[] args){
       
        ArrayList<String> strings = new ArrayList<String>();
        
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        strings.remove("praktikum");
        
        for(String s: strings){
            System.out.print(s+" ");
        }
    }
}
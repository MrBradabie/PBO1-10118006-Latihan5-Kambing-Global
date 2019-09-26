/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118006.latihan5.kambing.global;

/**
 *
 * @author
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : PBO1
 * NIM   : 10118006
 * Deskripsi Program : Program ini berisi  program untuk mengubah variabel jumlah kambing
 *                     menjadi variabel instance
 */
public class KambingGlobal {

// Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing= 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }    
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
         kambingSusu.getJumlahKambing();
         
         // Menambah satu kambing
         kambingSusu.tambahKambing();
         
         //menampilkan jumlah kambing yang ada
         kambingSusu.getJumlahKambing();
    }
    
}

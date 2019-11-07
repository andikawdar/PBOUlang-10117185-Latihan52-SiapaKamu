/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan52.siapakamu;

/**
 *
 * @author user
 * Nama : Andhyka Widariyanto
 * NIM  : 10117185
 * Kelas: PBO-Ulang
 * Tugas: Latihan 52 - Siapa Kamu.
 */
public class Manusia {
    //Atribute
    String nama;
    int umur;
    
    //Function

    public String getNama() {
        return nama;
    }

    public void setNama(String parNama) {
        nama = parNama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int parUmur) {
        umur = parUmur;
    }
    
    void siapaKamu(){
        System.out.println("Saya Manusia");
    }
    
}

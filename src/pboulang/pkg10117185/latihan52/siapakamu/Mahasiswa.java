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
public class Mahasiswa extends Manusia{
    //Atribute
    String nim;
    String kelas;
    
    //Function

    public String getNim() {
        return nim;
    }

    public void setNim(String parNim) {
        nim = parNim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String parKelas) {
        kelas = parKelas;
    }
    
    void kelasApa(){
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang belajar di kelas "+kelas);
    }
    
    @Override
    void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}

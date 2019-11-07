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
public class Dosen extends Manusia{
    //Atribute
    String nip;
    String mataKuliah;
    
    //Function

    public String getNip() {
        return nip;
    }

    public void setNip(String parNip) {
        nip = parNip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String parMataKuliah) {
        mataKuliah = parMataKuliah;
    }
    
    void mengajarApa(){
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang mengajar matakuliah "+mataKuliah);
    }
    
    @Override
    void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}

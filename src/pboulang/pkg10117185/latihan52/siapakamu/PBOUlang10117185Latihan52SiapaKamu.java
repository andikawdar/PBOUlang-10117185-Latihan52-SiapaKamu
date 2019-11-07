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
public class PBOUlang10117185Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mahasiswa inMhs = new Mahasiswa();
    Dosen inDos = new Dosen();
    
    
    inDos.setNip("4122782930");
    inDos.setNama("Rizki Adam Kurniawan");
    inDos.setUmur(27);
    inDos.setMataKuliah("PBO");
    
    inMhs.setNim("10110269");
    inMhs.setNama("Nindi");
    inMhs.setUmur(17);
    inMhs.setKelas("PBO2");
    
    System.out.println("NIP DOSEN : "+inDos.getNip());
    inDos.siapaKamu();
    inDos.mengajarApa();
    System.out.println("");
    
    System.out.println("NIM MAHASISWA : "+inMhs.getNim());
    inMhs.siapaKamu();
    inMhs.kelasApa();
    System.out.println("");
    }
    
}

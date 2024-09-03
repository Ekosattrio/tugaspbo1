/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo1;

/**
 *
 * @author Advan
 */
public class nilaiM {
   String Npm;
    String nama;
    
    float NAbsen;
    float NTugas;
    float UTS;
    float UAS;
    float NAbsenakhir;
    float NTugasakhir;
    float UTSakhir;
    float UASakhir;
    float Nakhir;
    
    void nilai() {
        NAbsenakhir = NAbsen * 10 / 100; 
        NTugasakhir = NTugas * 20 / 100; 
        UTSakhir = UTS * 30 / 100;       
        UASakhir = UAS * 40 / 100;       
        
        Nakhir = NAbsenakhir + NTugasakhir + UTSakhir + UASakhir; 
    }
    
    void cetaknilai() {
        System.out.println("NPM anda: " + Npm + "       Nama anda: " + nama);
        System.out.println("Nilai Absen anda: " + NAbsen + " (10%) = " + NAbsenakhir);
        System.out.println("Nilai Tugas anda: " + NTugas + " (20%) = " + NTugasakhir);
        System.out.println("Nilai UTS anda: " + UTS + " (30%) = " + UTSakhir);
        System.out.println("Nilai UAS anda: " + UAS + " (40%) = " + UASakhir);
        System.out.println("Nilai Akhir anda: " + NAbsenakhir + " + " + NTugasakhir + " + " + UTSakhir + " + " + UASakhir + " = " + Nakhir);
    }
}


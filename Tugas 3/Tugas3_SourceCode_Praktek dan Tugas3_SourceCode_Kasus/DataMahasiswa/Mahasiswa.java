/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Jumat, 17 April 2026
 * Waktu Pengerjaan: 13:39
 */
package datamahasiswa;
import java.util.Scanner;
/**
 *
 * @author anwik
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private int[] nilai;
    private int jumlahMK ;
  
public Mahasiswa(String nm, String ni, int jmk){
    this.nama = nm;
    this.nim = ni;
    this.jumlahMK = jmk;
    this.nilai = new int[jumlahMK];
}
public void inputNilai(Scanner sc){
    for(int i = 0; i < jumlahMK; i++){
        System.out.print("Nilai MK-"+(i+1)+": ");
        nilai[i] = sc.nextInt();
    }
}
public double hitungRataRata(){
    double total = 0;
    for(int i = 0; i <jumlahMK; i++ ){
        total = total + nilai[i];
    }
    return total/jumlahMK;
}
public char tentukanGrade(){
    double avg = hitungRataRata();
    if(avg >=85){
        return 'A';
    }else if(avg >= 75){
        return 'B';
    }else if(avg >= 60){
        return 'C';
    }else {
        return 'D';
    }
}

public boolean lulus(){
    return hitungRataRata()>=60.0;
}

public void tampilRapor(){
    System.out.println("=== RAPOR ===");
    System.out.println("Nama: "+nama);
    System.out.println("NIM: "+nim);
    System.out.println("Nilai: ");
    for(int i = 0; i < jumlahMK ; i++){
        System.out.println("MK -"+(i + 1)+" : "+ nilai[i]);
    }
    System.out.println("Rata :"+hitungRataRata());
    System.out.println("Grade : "+tentukanGrade());
    System.out.println("Lulus :"+ lulus());
}
}


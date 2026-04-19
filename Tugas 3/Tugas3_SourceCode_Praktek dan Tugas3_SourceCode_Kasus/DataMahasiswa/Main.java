/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Jumat, 17 April 2026
 * Waktu Pengerjaan: 13:30
 */
package datamahasiswa;
import java.util.Scanner;
/**
 *
 * @author anwik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama :");
        String nama = sc.nextLine();
        
        System.out.print("NIM :");
        String nim = sc.nextLine();
        
        System.out.print("Jml MK: ");
        int jmlMK = sc.nextInt();
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, jmlMK);
        
        mhs.inputNilai(sc);
        
        mhs.tampilRapor();
    }
    
}

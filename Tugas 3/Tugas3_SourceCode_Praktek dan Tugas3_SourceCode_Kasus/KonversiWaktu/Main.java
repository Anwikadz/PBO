/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Jumat, 17 April 2026
 * Waktu Pengerjaan: 19:39
 */
package konversiwaktu;
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
        long inputDetik = sc.nextLong();
        System.out.print("");
        
        Konversi kw = new Konversi(inputDetik);
        kw.konversi();
        kw.tampilkanWaktu();
        
//        System.out.println("\n-----Contoh Lain----");
//        System.out.println("Input : 3661");
//        System.out.println("Output: 01:01:01\n");
//        
//        System.out.println("Input : 86400");
//        System.out.println("Output: 00:00:00 (tepat 1 hari)");
    }
    
}

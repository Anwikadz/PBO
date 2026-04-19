/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Jumat, 17 April 2026
 * Waktu Pengerjaan: 13:15
 */
package aplikasikalkulator;
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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        char lagi;
        do{
            System.out.print("Angka 1 : ");
            double angka1 = input.nextDouble();
            System.out.print("Angka 2 : ");
            double angka2 = input.nextDouble();
            System.out.print("Operator : ");
            char operator = input.next().charAt(0);
            
            Kalkulator kal = new Kalkulator(angka1, angka2, operator);
            double hasil = 0;
            
            switch(operator){
                case '+':
                    hasil = kal.tambah();
                    break;
                case '-':
                    hasil = kal.kurang();
                    break;
                case '*':
                    hasil = kal.kali();
                    break;
                case '/':
                    if(angka2 == 0){
                        System.out.println("Error: pembagian dengan nol!");
                        hasil = 0.0;
                    }else{
                        hasil = kal.bagi();
                    }
                    break;
                default:
                    System.out.print("Operator tidak dikenal");
            }
            System.out.println("Hasil :"+angka1+operator+angka2+" = "+hasil);
            System.out.print("Hitung lagi? (y/n): ");
            lagi = input.next().charAt(0);
            
        } while(lagi == 'y' || lagi == 'Y');
        System.out.println("Program selesai");
        
    }
    
}

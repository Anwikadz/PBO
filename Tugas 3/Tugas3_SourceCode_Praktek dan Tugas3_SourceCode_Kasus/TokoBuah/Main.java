/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokobuah;
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
        
        Buah[] katalog = new Buah[3];
        katalog[0] = new Buah("Apel", 15000, 10);
        katalog[1] = new Buah("Jeruk", 12000, 8);
        katalog[2] = new Buah("Mangga", 20000, 5);
        
        int pilih, qty;
        double total;
        
        for(int i = 0; i < katalog.length;i++){
            System.out.println((i+1)+"."+katalog[i].getInfo());  
        }
        total = 0.0;
        while(true){
            System.out.print("Pilih produk(1-3, 0=Selesai): ");
            pilih = sc.nextInt();
            if(pilih  == 0){
                break;
            }
            System.out.print("Jumlah(Kg) : ");
            qty  = sc.nextInt();
            if(katalog[pilih -1].tersedia(qty)){
                double subtotal = katalog[pilih-1].hitungTotal(qty);
                total += subtotal + total;
                System.out.print("OK +Rp"+subtotal+"\n\n");
            }else {
                System.out.println("Stok tidak cukup\n");
            }
           
        }
         System.out.println("Total: Rp"+total);
    }
    
}

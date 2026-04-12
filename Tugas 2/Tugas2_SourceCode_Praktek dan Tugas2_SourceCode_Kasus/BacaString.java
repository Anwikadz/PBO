/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 15:30
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*; // Import ini tidak masalah dibiarkan jika nanti ingin ditambah GUI

public class BacaString {
    public static void main (String[] args) throws IOException { // Perbaikan: IOException
        String str;
        
        BufferedReader dataAIn = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("\nBaca string dan integer: \n");
        System.out.print("Masukkan sebuah string:  ");
        
        // Perbaikan: Variabel disamakan (dataAIn) dan method menggunakan huruf L kapital (readLine)
        str = dataAIn.readLine(); 
        
        System.out.println("String yang dibaca : " + str);
    }
}
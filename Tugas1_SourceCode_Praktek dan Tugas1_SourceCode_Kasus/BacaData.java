/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 1 April 2026
 * Waktu Pengerjaan: 11:55
 */
import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
		int a;
		Scanner masukan;
	/* Program */
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}
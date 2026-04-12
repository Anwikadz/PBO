/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 22:29
 */
import java.util.Scanner;

public class PrintXWhile{
	public static void main(String[] args){
		int sum, x;
		Scanner masukan = new Scanner(System.in);
		
		sum = 0;
		System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();
		while(x != 999){
			sum = sum + x;
			System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt();
		}
		System.out.println("Hasil penjumlahan = "+ sum);
	}
}
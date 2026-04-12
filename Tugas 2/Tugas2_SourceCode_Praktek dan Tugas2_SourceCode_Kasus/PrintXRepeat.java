/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 22:25
 */
import java.util.Scanner;

public class PrintXRepeat{
	public static void main(String[] args){
		int sum, x;
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();
		if(x == 999){
			System.out.print("Kasus kosong\n");
		}else{
			sum = 0;
			do{
				sum = sum + x;
				System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
				x = masukan.nextInt();
			}while(x!=999);
		System.out.println("Hasil Penjumlahan = "+ sum);
		}
	}
}
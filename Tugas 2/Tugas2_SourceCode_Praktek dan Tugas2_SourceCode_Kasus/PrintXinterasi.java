/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 21:57
 */
import java.util.Scanner;

public class PrintXinterasi{
	public static void main(String[] args){
		int sum = 0, x;
		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan nilai X (int), Akhiri dg 999 : ");
		x = masukan.nextInt();
		if (x == 999){
			System.out.print ("Kasus kosong \n");
		}else{
			sum = x;
			for(;;){
				System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
				x  = masukan.nextInt();
				if(x == 999){
					break;
				}else{
					sum = sum + x;
				}
			}
		}
		System.out.println("Hasil Penjumlahan = "+ sum);
	}
}
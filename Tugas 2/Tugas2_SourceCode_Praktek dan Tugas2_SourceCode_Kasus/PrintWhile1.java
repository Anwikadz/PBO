/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 21:48
 */
import java.util.Scanner;

public class PrintWhile1{
	public static void main(String[] args){
		int N, i = 1;
		Scanner masukan = new Scanner(System.in);
	
		System.out.print("Nilai N > 0 = ");
		N = masukan.nextInt();
		System.out.print ("Print i dengan WHILE (ringkas): \n");
		while (i <= N){
			System.out.println(i++);
		}
	}
}
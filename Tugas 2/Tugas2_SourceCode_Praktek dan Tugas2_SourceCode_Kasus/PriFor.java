/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 21:28
 */
import java.util.Scanner;

public class PriFor{
	public static void main(String[] args){
		int i, N;
		Scanner masukan = new Scanner(System.in);

		System.out.print ("Baca N print 1 s/d N ");
		System.out.print ("N = ");

		N = masukan.nextInt();

		for (i = 1; i<=N ; i++){
			System.out.println(i);};
		System.out.println("Akhir Program \n");
	}
}
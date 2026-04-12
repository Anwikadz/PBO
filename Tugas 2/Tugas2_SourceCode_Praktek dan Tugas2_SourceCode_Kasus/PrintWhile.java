/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 21:44
 */
import java.util.Scanner;

public class PrintWhile{
	public static void main(String[] args){
		int N, i;
		Scanner masukan = new Scanner(System.in);
		
		System.out.print ("Nilai N > 0 = " );
		N = masukan.nextInt();
		i = 1;
		
		System.out.print ("Print i dengan WHILE: \n");
		while(i <= N){
			System.out.println(i);
			i++;
		};
	}
}
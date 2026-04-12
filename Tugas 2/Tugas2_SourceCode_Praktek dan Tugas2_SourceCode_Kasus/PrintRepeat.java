/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 21:39
 */
import java.util.Scanner;

public class PrintRepeat{
	public static void main(String[] args){
		int N, i;
		Scanner masukan = new Scanner(System.in);
		
		System.out.print ("Nilai N > 0 = ");
		N = masukan.nextInt();

		i = 1;
		System.out.print ("Print i dengan REPEAT: \n");
		do{
			System.out.print (i+"\n");
			i++;
		}while(i <= N);
	}
}
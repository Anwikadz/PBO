/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 16:27
 */
import java.util.Scanner;

public class If2{
	public static void main(String[] args){
		int a;
		Scanner masukan = new Scanner(System.in);
		System.out.print("contoh IF dua kasus\n");
		System.out.print("Ketikkan suatu nilai integer : ");
		a = masukan.nextInt();

		if(a >= 0){
			System.out.println("Nilai a positif " + a);
		}else{
			System.out.println("Nilai a negative " + a);
		}
	}
}
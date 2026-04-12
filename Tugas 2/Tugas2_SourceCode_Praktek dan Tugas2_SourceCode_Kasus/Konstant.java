/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 17:00
 */
import java.util.Scanner;
	public class Konstant{
		public static void main (String[] args){
			final float PHI = 3.1415f;
			float r;
			Scanner masukan = new Scanner(System.in);
			System.out.print("Jari-jari lingkaran = ");
			r = masukan.nextFloat();
			System.out.print("Luas Lingkaran = "+ (PHI *r *r)+"\n");
			System.out.print("Akhir program \n");
		}
	}
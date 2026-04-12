/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 16:23
 */
import java.util.Scanner;

public class If1{
	public static void main(String[] args) {
		Scanner  masukan = new Scanner(System.in);
		int a;

		System.out.print("contoh If satu kasus \n");
  		System.out.print("Ketikkan suatu nilai Integer: ");
		a = masukan.nextInt();
		if (a >=0)
		System.out.print("\nNilai a positif " + a);
	}
}
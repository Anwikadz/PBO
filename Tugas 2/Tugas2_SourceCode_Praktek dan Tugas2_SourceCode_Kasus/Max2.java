
/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 21:33
 */
import java.util.Scanner;

public class Max2{
	public static void main(String[] args){
		int a, b;
		Scanner masukan = new Scanner(System.in);

		System.out.print ("Maksimum dua bilangan : \n");
		System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN: \n");
		a = masukan.nextInt();
		b = masukan.nextInt();
		System.out.println("Ke dua bilangan : a = "+ a +" b = "+ b);
		
		if(a >= b){
			System.out.println("Nilai a yang Maksimum "+a);
		}else{
			System.out.println("Nilai b yang maksimum "+b);
		}
	}
}
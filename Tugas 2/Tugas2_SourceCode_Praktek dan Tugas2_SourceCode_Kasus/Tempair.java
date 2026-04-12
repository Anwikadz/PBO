/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 10 April 2026
 * Waktu Pengerjaan: 22:47
 */
import java.util.Scanner;

public class Tempair{
	public static void main(String[] args){
		int T;
		Scanner masukan = new Scanner(System.in);
	
		System.out.print("Contoh IF tiga kasus \n");
		System.out.print("Temperatur (der. C) = ");
		T = masukan.nextInt();
		if(T < 0){
			System.out.print("Wujud air beku \n"+T);
		}else if((0 <= T) && ( T <=x 100)){
			System.out.print("Wujud air cair\n"+T);
		}else if(T > 100){
			System.out.print("Wujud air uap/gas \n"+T);
		};
	}
}
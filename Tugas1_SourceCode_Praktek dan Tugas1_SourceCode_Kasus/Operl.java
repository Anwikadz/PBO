/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 2 April 2026
 * Waktu Pengerjaan: 07:49
 */
public class Operl{
	public static void main(String[] args){
		int n = 10; /*1010*/
		int x = 1;  /*   1*/
		int y = 2;  /*  10*/
	
		System.out.println("n = " + n);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("n & 8 = " + (n & 8));    /*1010 and 1000*/
		System.out.println("x & ~ 8 = " + (x & ~8)); /*   1 and 0111*/
		System.out.println("y << 2 = " + (y<<2));    /*10 ==> 1000 = 8*/
		System.out.println("y >> 3 = " + (y>>3));    /*10 ==> 0000 = 0*/
	}
}
/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Rabu, 2 April 2026
 * Waktu Pengerjaan: 08:16
 */
/* Contoh pengoperasian variabel bertype dasar */
public class Operator {
    	public static void main(String[] args) {
        	// TODO Auto-generated method stub
        
        	/* Kamus */
        	boolean Bool1, Bool2, TF;
        	int i, j, hsl;
        	float x, y, res;
        
        	/* algoritma */
        	System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
        
       		/* Boolean */
        	Bool1 = true; 
        	Bool2 = false; 
        	TF = Bool1 && Bool2; /* Boolean AND */
        	TF = Bool1 || Bool2; /* Boolean OR */
        	TF = !Bool1;         /* NOT */
        	TF = Bool1 ^ Bool2;  /* XOR */
		System.out.println("Boolean XOR = " + TF);
        
        	/* operasi numerik int */
        	i = 5; 
        	j = 2;
        	hsl = i + j;
        	hsl = i - j;
        	hsl = i / j; /* pembagian bulat */
        	hsl = i % j; /* sisa modulo */
        	hsl = i * j;
		System.out.println("Operasi Numerik int perkalian 5 * 2 = " + hsl);
        
        	/* operasi numerik float */
        	x = 5.0f; 
        	y = 5.0f;
        	res = x + y;
        	res = x - y;
        	res = x / y;
        	res = x * y;
		System.out.println("Operasi numerik float perkalian 5.0 * 5.0 = " + res);
       	 
        	/* operasi relasional numerik int */
        	TF = (i == j);
        	TF = (i != j);
        	TF = (i < j);
        	TF = (i <= j);
        	TF = (i > j);
        	TF = (i >= j);
		System.out.println("Operasi relasional numerik int 5 >= 2 = " + TF);
        	
        	/* operasi relasional numerik float */
        	TF = (x != y);
        	TF = (x < y);
        	TF = (x > y);
       		TF = (x <= y);
        	TF = (x >= y);
		System.out.println("Operasi relasional numerik float 5 >= 5 =" + TF);
		}
}
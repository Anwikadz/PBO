/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Jumat, 17 April 2026
 * Waktu Pengerjaan: 19:36
 */
package konversiwaktu;

/**
 *
 * @author anwik
 */
public class Konversi {
    private long totalDetik;
    private long detikSekarang;
    private long totalMenit;
    private long menitSekarang;
    private long totalJam;
    private long jamSekarang;
    
    public Konversi(long td){
        this.totalDetik = td;
    }
    public long hitungDetikSekarang(){
        return totalDetik % 60;
    }
    public long hitungTotalMenit(){
        return totalDetik / 60;
    }
    public long hitungMenitSekarang(){
        return totalMenit % 60;
    }
    public long hitungTotalJam(){
        return totalMenit / 60;
    }
    public long hitungJamSekarang(){
        return totalJam % 24;
    }
    public void konversi(){
        this.detikSekarang = hitungDetikSekarang();
        this.totalMenit = hitungTotalMenit();
        this.menitSekarang = hitungMenitSekarang();
        this.totalJam = hitungTotalJam();
        this.jamSekarang = hitungJamSekarang();
    }
    public void tampilkanWaktu(){
        System.out.println("Total Detik: "+ totalDetik);
        System.out.println("=====================");
        System.out.println("Waktu: "+ jamSekarang+":"+menitSekarang+":"+detikSekarang);
        System.out.println("=====================\n");
        System.out.println("Total Detik    : "+ totalDetik);
        System.out.println("detikSaat ini  : "+ detikSekarang);
        System.out.println("MenitSaat ini  : "+ menitSekarang);
        System.out.println("JamSaat ini    : "+ jamSekarang);
        
        
        
    }
}


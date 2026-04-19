/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokobuah;

/**
 *
 * @author anwik
 */
public class Buah {
    private String nama;
    private double harga;
    private int stok;
    
    public Buah(String n, double h, int s){
        this.nama = n;
        this.harga = h;
        this.stok = s;
    }
    public String getInfo(){
        return String.format(nama+"Rp."+harga+"(stok:"+stok+" kg)");
    }
    public double hitungTotal(int qty){
        this.stok -= qty;
        return this.harga * qty;
    }
    public boolean tersedia(int qty){
        return this.stok >= qty;
    }
        
}

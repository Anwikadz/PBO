/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**NIM: 13020240070
 * Nama: Anwika Dzaky Praditya
 * Hari/Tanggal: Jumat, 17 April 2026
 * Waktu Pengerjaan: 13:01
 */
package aplikasikalkulator;
/**
 *
 * @author anwik
 */
public class Kalkulator {
    private double angka1;
    private double angka2;
    private char operator;
 
public Kalkulator(double a1, double a2, char op){
    this.angka1 = a1;
    this.angka2 = a2;
    this.operator = op;
}

public double tambah(){
    return angka1 + angka2;
}
public double kurang(){
    return angka1 - angka2;
}
public double kali(){
    return angka1 * angka2;
}
public double bagi(){
    if (angka2 == 0){
        return 0.0;
    }else{
        return angka1/angka2;
    }
}
}


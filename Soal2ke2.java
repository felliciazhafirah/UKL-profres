package UKLsoal2;

import java.util.Scanner;

public class Soal2ke2 {
    //fungd=si untuk menghitung volume tabung
    public static double hitungVolume(double r, double t) {
        final double PI = 3.14; //konstnta pi
        return PI * r *r * t; //rumus volume tabung
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan jari jarinya = ");
        double jari_jari = in.nextInt();
        System.out.println("Masukkan tingginya = ");
        int tinggi = in.nextInt();
         
        //memanggil fungsi hitung volume
        double volume = hitungVolume(jari_jari, tinggi);

        //menampilkan hasil
        System.out.println("Volume tabung = 3.14 x jari jari x jari jari x tinggi");
        System.out.println("Volume tabung = 3.14 x " +jari_jari+ " x " + jari_jari + " x " +tinggi );
        System.out.println("Volume tabung = " + volume);


    }
    
}

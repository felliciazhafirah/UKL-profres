package UKLsoal2;

import java.util.Scanner;

public class Soal2ke1 {
     public static void main(String[] args) {
        int angka, n, faktorial = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung faktorial!!!");
        System.out.println("Masukkan bilangan anda = ");
        angka = in.nextInt();

        if (angka < 0) {
            System.out.println("Nilai harus positif!");
        }else{
            for(n = 1; n <= angka; n++){
                faktorial = faktorial*n;//rumus faktorial
            }
            System.out.println("Hasil faktorial dari " + angka + "! adalah = " + faktorial);
        }
    
    }
    
}

package UKLsoalke1;

import java.util.Scanner;

public class Soal1ke2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan angka: ");
        int angka = in.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah angka genap");
        }else {
            System.out.println("Angka " + angka + " adalah angka ganjil");
        }
    }
}

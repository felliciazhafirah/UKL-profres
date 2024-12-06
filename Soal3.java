package UKLsoalke3;

import java.util.Scanner;

public class Soal3{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //menginput jumlah elemnt array
            System.out.println("Masukkan jumlah element array yang anda mau = ");
            int jumlah = in.nextInt();
        
            //input element dari user
            int[] array = new int[jumlah];
            System.out.println("Masukkan nilai elemt nya = ");
            for ( int i = 0 ; i < jumlah ; i++){
                System.out.println("element ke- " + (i+1) + " = ");
                array[i] = in.nextInt();
            }
        
            // Loop untuk menghitung frekuensi 
            for (int i = 0; i < array.length; i++) {
                // Cek apakah elemen ini sudah dihitung frekuensinya
                boolean sudahDihitung = false;
                
                // Loop kedua untuk menghitung berapa kali elemen tersebut muncul
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        sudahDihitung = true;
                        break;
                    }
                }
                
                // Jika elemen belum dihitung, hitung frekuensinya
                if (!sudahDihitung) {
                    int frekuensi = 0;
                    for (int j = 0; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            frekuensi++;
                        }
                    }
                    System.out.println("Elemen " + array[i] + " muncul sebanyak " + frekuensi + " kali");
                }
            }
        }
    }


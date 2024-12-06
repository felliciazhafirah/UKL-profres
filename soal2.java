package UKLsoalke3;

import java.util.Arrays;

public class soal2 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 2};
            System.out.println("Nilai arraynya = " + Arrays.toString(arr));
            boolean adaDuplikat = false;
    
            // Nested loop untuk mengecek duplikat
            for (int i = 0; i < arr.length; i++) {
                for ( j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        adaDuplikat = true;
                        System.out.println(" Element yg terduplikat: " + arr[i]);
                    }
                }
            }
    
            if (!adaDuplikat) {
                System.out.println("Tidak ada duplikat di array.");
            }
        }
    System.out.println("ATHA LEADER");
    }

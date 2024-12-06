package UKLsoalke1;

import java.util.Scanner;

public class Soal1ke1 {
    public static void main(String[] args) {
        int jarak;
        double harga; 
        int volume;
        int panjang, lebar, tinggi;
        double biaya;
        double biayaTotal;
        double biayapengiriman;

        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang !!!");
    
        System.out.println("Berapa Kg Paket anda?");
        int Kg = in.nextInt();
        System.out.println("Masukkan Volume paket anda ");
        System.out.println("Berapa panjang paket anda?");
        panjang = in.nextInt();
        System.out.println("Berapa Lebar paket anda?");
        lebar = in.nextInt();
        System.out.println("Berapa tinggi paket anda?");
        tinggi = in.nextInt();
        volume = panjang*lebar*tinggi;
        System.out.println("Volume Paket anda adalah = " +volume + "cm kubik");
        System.out.println("Berapa Jarak tujuannya? \n 1. jarak >= 10 : 4250 \n 2.jarak <= 20 : 6000 \n 3. jarak >= 20 : 8000");
        int pilih = in.nextInt();
        System.out.println("Berapa jaraknya? ");
        jarak = in.nextInt();

        switch (pilih) {
            case 1:
             biayapengiriman = Kg * 4250;
             if ( volume > 100 ){
                biayapengiriman +=50000;
            }
            System.out.println("Biaya yang perlu anda bayarkan adalah  = " + biayapengiriman);
            
                break;

                case 2:
                biayapengiriman = Kg * 6000;
                if ( volume > 100 ){
                    biayapengiriman +=50000;
                }
                System.out.println("Biaya yang perlu anda bayarkan adalah  = " + biayapengiriman);
            
                break;

                case 3:
                biayapengiriman = Kg * 8000; 
                if ( volume > 100 ){
                    biayapengiriman +=50000;
                }
                System.out.println("Biaya yang perlu anda bayarkan adalah  = " + biayapengiriman);       
            default:
                System.out.println("Masukkan pilihan yang valid");
        }
        
        

        }    
}
    


package UKLsoalke3;

import java.util.Scanner;

public class Soal3ke1 {
    public static void main(String[] args) {
        double nilai;
        int jumlah_Siswa;
        int total_Nilai=0;
        int nomor_Absen;
        int RataRata_Nilai;

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa yang nilainya akan di input");
        jumlah_Siswa = in.nextInt();
        for (nomor_Absen=1; nomor_Absen <= jumlah_Siswa ; nomor_Absen++){
            System.out.println("Masukkan nilai siswa ke- " + nomor_Absen + " = ");
            nilai = in.nextInt();
            total_Nilai += nilai;
        }
        RataRata_Nilai = (total_Nilai / jumlah_Siswa);
        System.out.println("Total nilai dari ke- " + jumlah_Siswa + " siswa adalah = " + total_Nilai );
        System.out.println("Rata rata nilai dari ke- " + jumlah_Siswa + " siswa adalah = " + RataRata_Nilai);



    }
    
}

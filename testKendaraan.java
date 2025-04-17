/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Praktikum_17042025;
import java.util.Scanner;

/**
 *
 * @author guslizen
 */
public class testKendaraan {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=== Input Data Kendaraan ===");
        System.out.print("Nama Kendaraan: ");
        String namaKendaraan = scanner.nextLine();
        System.out.print("Tahun Produksi: ");
        int tahunKendaraan = scanner.nextInt();
        scanner.nextLine();

        Kendaraan kendaraan = new Kendaraan(namaKendaraan, tahunKendaraan);
        kendaraan.cetak();

 
        System.out.println("\n=== Input Data Kendaraan Udara ===");
        System.out.print("Nama Udara: ");
        String namaUdara = scanner.nextLine();
        System.out.print("Tahun Produksi: ");
        int tahunUdara = scanner.nextInt();
        System.out.print("Apakah memiliki mesin? (true/false): ");
        boolean mesinUdara = scanner.nextBoolean();
        scanner.nextLine();

        Udara udara = new Udara(namaUdara, tahunUdara, mesinUdara);
        udara.cetak();


        System.out.println("\n=== Input Data Pesawat ===");
        System.out.print("Berapa jumlah pesawat yang ingin dimasukkan? ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        Pesawat[] daftarPesawat = new Pesawat[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData pesawat ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Tahun Produksi: ");
            int tahun = scanner.nextInt();

            System.out.print("Memiliki mesin? (true/false): ");
            boolean mesin = scanner.nextBoolean();

            System.out.print("Muatan penumpang: ");
            int muatan = scanner.nextInt();
            scanner.nextLine();

            daftarPesawat[i] = new Pesawat(nama, tahun, mesin, muatan);
        }

        System.out.println("\n=== DATA SEMUA PESAWAT ===");
        for (Pesawat p : daftarPesawat) {
            p.cetak();
            System.out.println("-------------------------");
        }


        Pesawat maxPesawat = daftarPesawat[0];
        for (int i = 1; i < daftarPesawat.length; i++) {
            if (daftarPesawat[i].getMuatan() > maxPesawat.getMuatan()) {
                maxPesawat = daftarPesawat[i];
            }
        }

        System.out.println("\n=== PESAWAT DENGAN MUATAN TERBESAR ===");
        maxPesawat.cetak();

        scanner.close();
    }

}

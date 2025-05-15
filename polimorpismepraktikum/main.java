/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package polimorpismepraktikum;
import java.util.Scanner;

/**
 *
 * @author guslizen
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulangi = true;
        int totalKendaraan = 0;
        Kendaraan[] dataKendaraan = new Kendaraan[100];

        while (ulangi) {
            System.out.println("MENU");
            System.out.println("1. Masukkan data kendaraan");
            System.out.println("2. Tampilkan data kendaraan");
            System.out.println("3. Edit data warna kendaraan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = Integer.parseInt(scanner.nextLine());

            if (pilihan == 1) {
                System.out.println("Pilih jenis kendaraan");
                System.out.println("1. Mobil");
                System.out.println("2. Taksi");
                System.out.println("3. Truk");
                System.out.println("4. Sepeda");
                System.out.println("5. Sepeda Listrik");
                System.out.print("Pilihan jenis: ");
                int jenis = Integer.parseInt(scanner.nextLine());

                System.out.print("Masukkan jumlah roda: ");
                int roda = Integer.parseInt(scanner.nextLine());
                System.out.print("Masukkan warna: ");
                String warna = scanner.nextLine();

                if (jenis == 1) {
                    System.out.print("Masukkan bahan bakar: ");
                    String bahanBakar = scanner.nextLine();
                    System.out.print("Masukkan kapasitas mesin: ");
                    int kapasitas = Integer.parseInt(scanner.nextLine());
                    dataKendaraan[totalKendaraan++] = new Mobil(roda, warna, bahanBakar, kapasitas);
                } else if (jenis == 2) {
                    System.out.print("Masukkan bahan bakar: ");
                    String bahanBakar = scanner.nextLine();
                    System.out.print("Masukkan kapasitas mesin: ");
                    int kapasitas = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan tarif awal: ");
                    int tarifAwal = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan tarif per km: ");
                    int tarifPerKm = Integer.parseInt(scanner.nextLine());
                    dataKendaraan[totalKendaraan++] = new Taksi(roda, warna, bahanBakar, kapasitas, tarifAwal, tarifPerKm);
                } else if (jenis == 3) {
                    System.out.print("Masukkan bahan bakar: ");
                    String bahanBakar = scanner.nextLine();
                    System.out.print("Masukkan kapasitas mesin: ");
                    int kapasitas = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan muatan maksimum: ");
                    int muatan = Integer.parseInt(scanner.nextLine());
                    dataKendaraan[totalKendaraan++] = new truk(roda, warna, bahanBakar, kapasitas, muatan);
                } else if (jenis == 4) {
                    System.out.print("Masukkan jumlah sadel: ");
                    String sadel = scanner.nextLine();
                    System.out.print("Masukkan jumlah gir: ");
                    int gir = Integer.parseInt(scanner.nextLine());
                    dataKendaraan[totalKendaraan++] = new Sepeda(roda, warna, sadel, gir);
                } else if (jenis == 5) {
                    System.out.print("Masukkan jumlah sadel: ");
                    String sadel = scanner.nextLine();
                    System.out.print("Masukkan jumlah gir: ");
                    int gir = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan kecepatan maksimum: ");
                    int kecepatan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan jarak tempuh: ");
                    int jarak = Integer.parseInt(scanner.nextLine());
                    dataKendaraan[totalKendaraan++] = new SepedaListrik(roda, warna, sadel, gir, kecepatan, jarak);
                }

                System.out.println("Data berhasil ditambahkan\n");

            } else if (pilihan == 2) {
                System.out.println("\nDATA KENDARAAN");
                if (totalKendaraan == 0) {
                    System.out.println("Belum ada data");
                } else {
                    for (int i = 0; i < totalKendaraan; i++) {
                        System.out.println((i + 1) + ". " + dataKendaraan[i]);
                        System.out.println();
                    }
                }

            } else if (pilihan == 3) {
                if (totalKendaraan == 0) {
                    System.out.println("Belum ada data untuk diedit\n");
                } else {
                    System.out.print("Masukkan nomor kendaraan (1-" + totalKendaraan + "): ");
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index >= 1 && index <= totalKendaraan) {
                        System.out.print("Masukkan warna baru: ");
                        String warnaBaru = scanner.nextLine();
                        dataKendaraan[index - 1].setWarna(warnaBaru);
                        System.out.println("Warna berhasil diubah\n");
                    } else {
                        System.out.println("Nomor tidak valid\n");
                    }
                }

            } else if (pilihan == 4) {
                System.out.println("Program selesai");
                break;
            }

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Ulangi program? (y/n): ");
                ulangi = scanner.nextLine().equalsIgnoreCase("y");
                System.out.println();
            }
        }

    }
    
      
}



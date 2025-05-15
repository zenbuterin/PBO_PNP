/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pbo_2401082015;
import java.util.Scanner;

/**
 *
 * @author guslizen
 */
public class ElektronikDemo {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Elektronik[] data = new Elektronik[100];
    int total = 0;

    while (true) {
        System.out.println("MENU\n1. Tambah\n2. Tampil\n3. Edit\n4. Keluar");
        System.out.print("Pilih: ");
        int pilih = sc.nextInt(); sc.nextLine();

        if (pilih == 1) {
            System.out.println("Jenis:\n1. Laptop\n2. Gaming\n3. Smartphone\n4. Smartwatch");
            int jenis = sc.nextInt(); sc.nextLine();
            System.out.print("Merek: ");
            String merek = sc.nextLine();
            System.out.print("Tahun: ");
            int tahun = sc.nextInt();
            System.out.print("Garansi: ");
            int garansi = sc.nextInt(); sc.nextLine();

            if (jenis == 1) {
                System.out.print("Layar: ");
                int layar = sc.nextInt();
                System.out.print("RAM: ");
                int ram = sc.nextInt(); sc.nextLine();
                data[total++] = new Laptop(merek, tahun, garansi, layar, ram);
            } else if (jenis == 2) {
                System.out.print("Layar: ");
                int layar = sc.nextInt();
                System.out.print("RAM: ");
                int ram = sc.nextInt(); sc.nextLine();
                System.out.print("GPU: ");
                String gpu = sc.nextLine();
                System.out.print("Hz: ");
                int hz = sc.nextInt(); sc.nextLine();
                data[total++] = new Gaming(merek, tahun, garansi, layar, ram, gpu, hz);
            } else if (jenis == 3) {
                System.out.print("Baterai: ");
                int bat = sc.nextInt();
                System.out.print("Kamera: ");
                int cam = sc.nextInt(); sc.nextLine();
                data[total++] = new Smartphone(merek, tahun, garansi, bat, cam);
            } else if (jenis == 4) {
                System.out.print("Baterai: ");
                int bat = sc.nextInt();
                System.out.print("Kamera: ");
                int cam = sc.nextInt();
                System.out.print("Layar: ");
                int layar = sc.nextInt(); sc.nextLine();
                System.out.print("Tahan air (true/false): ");
                boolean tahanAir = sc.nextBoolean(); sc.nextLine();
                data[total++] = new SmartWatch(merek, tahun, garansi, bat, cam, layar, tahanAir);
            }
        } 
        
        else if (pilih == 2) {
            if (total == 0) System.out.println("Belum ada data.");
            else for (int i = 0; i < total; i++) System.out.println((i+1) + ". " + data[i].info() + "\n");
        }

        else if (pilih == 3) {
            if (total == 0) System.out.println("Tidak ada data.");
            else {
                System.out.print("Ubah data ke- (1-" + total + "): ");
                int idx = sc.nextInt(); sc.nextLine();
                if (idx >= 1 && idx <= total) {
                    System.out.print("Merek baru: ");
                    String baru = sc.nextLine();
                    data[idx - 1].setMerek(baru);
                    System.out.println("Berhasil diupdate.");
                }
            }
        } 
        
        else if (pilih == 4) break;

        else System.out.println("Pilihan salah.");

        System.out.print("Ulang? (y/n): ");
        if (!sc.nextLine().equalsIgnoreCase("y")) break;
    }

    sc.close();
}
}

        
        
        
        
        
        
   
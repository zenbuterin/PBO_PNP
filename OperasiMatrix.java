package Mar12;

import java.util.Random;
import java.util.Scanner;

public class OperasiMatrix {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        Random rand = new Random();
        char ulang;
        
        do {
            System.out.println("============================");
            System.out.println("       OPERASI MATRIKS       ");
            System.out.println("============================");
            System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Identitas\n5. Transpose\n6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            int pilih = inn.nextInt();
            
            if (pilih == 6) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }
            
            if (pilih < 1 || pilih > 6) {
                System.out.println("Pilihan tidak tersedia!");
                System.out.print("Coba lagi? (y/n): ");
                ulang = inn.next().charAt(0);
                continue;
            }
            
            System.out.print("Masukkan jumlah baris: ");
            int baris = inn.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = inn.nextInt();
            
            int Matriks1[][] = new int[baris][kolom];
            int Matriks2[][] = new int[baris][kolom];
            int result[][] = new int[baris][kolom];
            
            System.out.println("Matriks 1:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    Matriks1[i][j] = rand.nextInt(50) + 1;
                    System.out.print(Matriks1[i][j] + " ");
                }
                System.out.println();
            }
            
            if (pilih != 4 && pilih != 5) {
                System.out.println("Matriks 2:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        Matriks2[i][j] = rand.nextInt(50) + 1;
                        System.out.print(Matriks2[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            
            System.out.println("Hasil:");
            if (pilih == 1) {
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        result[i][j] = Matriks1[i][j] + Matriks2[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (pilih == 2) {
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        result[i][j] = Matriks1[i][j] - Matriks2[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (pilih == 3) {
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < kolom; k++) {
                            result[i][j] += Matriks1[i][k] * Matriks2[k][j];
                        }
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (pilih == 4) {
                if (baris != kolom) {
                    System.out.println("Matriks harus persegi untuk identitas!");
                } else {
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            result[i][j] = (i == j) ? 1 : 0;
                            System.out.print(result[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
            } else if (pilih == 5) {
                for (int i = 0; i < kolom; i++) {
                    for (int j = 0; j < baris; j++) {
                        System.out.print(Matriks1[j][i] + " ");
                    }
                    System.out.println();
                }
            }
            
            System.out.print("Coba lagi? (y/n): ");
            ulang = inn.next().charAt(0);
        } while (ulang == 'y');
    }
}

package Mar12;

import java.util.Scanner;

public class MutasiKombinasi {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.print("Masukkan nilai n: ");
        int n = inn.nextInt();
        System.out.print("Masukkan nilai r: ");
        int r = inn.nextInt();
        System.out.println("====================");
        
        int mutasi = 1, kombi, x = 1;
        
        for (int i = n; i > (n - r); i--) {
            mutasi *= i;
        }
        for (int i = r; i > 1; i--) {
            x *= i;
        }
        
        kombi = mutasi / x;
        
        System.out.println("Hasil Perhitungan:");
        System.out.println("Permutasi (P): " + mutasi);
        System.out.println("Kombinasi (C): " + kombi);
        System.out.println("====================");
    }
}


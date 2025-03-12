package Mar12;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Masukkan ukuran array A: ");
        int nA = scanner.nextInt();
        System.out.print("Masukkan ukuran array B: ");
        int nB = scanner.nextInt();
        System.out.println("=========================");
        
        int A[] = new int[nA], B[] = new int[nB], C[] = new int[nA + nB];
        
        System.out.println("Menghasilkan nilai untuk Array A dan B...");
        
        for (int i = 0; i < nA; i++) A[i] = rand.nextInt(100);
        for (int i = 0; i < nB; i++) B[i] = rand.nextInt(100);
        
        System.out.println("Array A: ");
        for (int i = 0; i < nA; i++) System.out.print(A[i] + (i < nA - 1 ? ", " : "\n"));
        
        System.out.println("Array B: ");
        for (int i = 0; i < nB; i++) System.out.print(B[i] + (i < nB - 1 ? ", " : "\n"));
        
        System.out.println("Array C (Gabungan A dan B):");
        if (nA >= nB) {
            for (int i = 0; i < nA; i++) System.out.print(A[i] + " ");
            for (int i = 0; i < nB; i++) System.out.print(B[i] + " ");
        } else {
            for (int i = 0; i < nB; i++) System.out.print(B[i] + " ");
            for (int i = 0; i < nA; i++) System.out.print(A[i] + " ");
        }
        
        System.out.println("\nProses selesai!");
    }
}


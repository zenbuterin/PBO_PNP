package Mar12;

import java.util.Scanner;

public class Pola {
    public static void main(String[] args) {
        int n, i, j;
        Scanner inn = new Scanner(System.in);

        System.out.print("Ukuran Pola: ");
        n = inn.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == j)
                    System.out.print("0 ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}

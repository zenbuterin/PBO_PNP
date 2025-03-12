package Mar12;

import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        int nX, nY, nZ;
        double totalX, totalY, totalZ, diskonX = 0, diskonY = 0, diskonZ = 0;
        final int hargaX = 40000, hargaY = 50000, hargaZ = 60000;
        Scanner inn = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("      KOTAK SUSU ");
        System.out.println("========================");
        System.out.print("Masukkan jumlah Merk X: ");
        nX = inn.nextInt();
        System.out.print("Masukkan jumlah Merk Y: ");
        nY = inn.nextInt();
        System.out.print("Masukkan jumlah Merk Z: ");
        nZ = inn.nextInt();

        totalX = nX * hargaX;
        totalY = nY * hargaY;
        totalZ = nZ * hargaZ;

        if (nX >= 3)
            diskonX = totalX * 0.10;
        if (nY > 3)
            diskonY = totalY * 0.12;
        if (nZ > 1)
            diskonZ = (nZ - 1) * hargaZ * 0.15;
        
        double totalDiskon = diskonX + diskonY + diskonZ;
        double totalPembelian = totalX + totalY + totalZ;
        double totalBayar = totalPembelian - totalDiskon;
        
        System.out.println("========================");
        System.out.println("       RINCIAN" );
        System.out.println("========================");
        System.out.println("Subtotal         : Rp. " + totalPembelian);
        System.out.println("Diskon diterima  : Rp. " + totalDiskon);
        System.out.println("Total bayar      : Rp. " + totalBayar);
        System.out.println("========================");
        System.out.println("Terima kasih telah berbelanja!");
    }
}


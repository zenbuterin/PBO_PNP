/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TKAGuslizenEffayed;

/**
 *
 * @author guslizen
 */
import java.util.Scanner;

public class testSemuaClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        bank.tambahNasabah("Andi", "Sucipto");
        bank.getNasabah(0).setTabungan(new Tabungan(500000));
        bank.tambahNasabah("Budi", "Pratama");
        bank.tambahNasabah("Candra", "Dinata", new Tabungan(750000));
        bank.tambahNasabah("Dede", "Kusuma", new Tabungan(300000));

        bank.tambahNasabah("Dede", "Andika");


        bank.tambahNasabah("Budi", "Dirgantara", new Tabungan(900000));


        System.out.println("=== Daftar Nasabah ===");
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            System.out.println(i + ". " + bank.getNasabah(i));
        }
        System.out.println("Total nasabah: " + bank.getJumlahNasabah());


        System.out.println("\nNasabah pada indeks ke-3:");
        System.out.println(bank.getNasabah(3));


        int indexCandra = bank.searchNasabah("Candra", "Dinata");
        System.out.println("\nMencari nasabah bernama Candra Dinata:");
        if (indexCandra != -1) {
            System.out.println("Ditemukan: " + bank.getNasabah(indexCandra));
        } else {
            System.out.println("Nasabah tidak ditemukan");
        }

        System.out.println("\nMencari nasabah dengan nama awal: Dede");
        int[] hasilDede = bank.searchNasabah("Dede");
        for (int index : hasilDede) {
            System.out.println(bank.getNasabah(index));
        }


        System.out.println("\nMencari nasabah dengan nama awal: Budi");
        int[] hasilBudi = bank.searchNasabah("Budi");
        for (int index : hasilBudi) {
            System.out.println(bank.getNasabah(index));
        }

        input.close();
    }
}


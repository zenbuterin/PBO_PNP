package Praktikum_13032025.packages;

/**
 *
 * @author guslizen
 */
import java.util.Scanner;

public class Mahasiswa {
    private String nim;
    private String nama;
    private double tugas;
    private double uts;
    private double uas;
    private double quiz;

    public Mahasiswa(String nim, String nama, double tugas, double quiz, double uts, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.tugas = tugas;
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (0.15 * tugas) + (0.20 * quiz) + (0.30 * uts) + (0.25 * uas);
    }

    public String konversiNilai(double nilaiAkhir) {
        if (nilaiAkhir > 80) return "A";
        else if (nilaiAkhir >= 65) return "B";
        else if (nilaiAkhir >= 50) return "C";
        else if (nilaiAkhir >= 40) return "D";
        else return "E";
    }

    public boolean isLulus(double nilaiAkhir) {
        return nilaiAkhir >= 50;
    }

    public void tampilkanData() {
        double nilaiAkhir = hitungNilaiAkhir();
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + konversiNilai(nilaiAkhir));
        System.out.println("Status: " + (isLulus(nilaiAkhir) ? "Lulus" : "Tidak Lulus"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai Quiz: ");
        double quiz = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();

        Mahasiswa mhs = new Mahasiswa(nim, nama, tugas, quiz, uts, uas);
        mhs.tampilkanData();

    }
}


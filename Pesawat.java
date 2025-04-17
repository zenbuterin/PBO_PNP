/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_17042025;

/**
 *
 * @author guslizen
 */
public class Pesawat extends Udara {
    private int muatan;

    public Pesawat() {
        super();
        this.muatan = 0;
    }

 
    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan) {
        super(nama, tahunProduksi, mesin);
        this.muatan = muatan;
    }

 
    public int getMuatan() {
        return muatan;
    }


    public void setMuatan(int muatan) {
        this.muatan = muatan;
    }

    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan) {
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }


    public String kategori(int muatan) {
        if (muatan < 50) return "Ringan";
        else if (muatan <= 200) return "Sedang";
        else return "Berat";
    }


    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Muatan: " + muatan + " penumpang");
        System.out.println("Kategori: " + kategori(muatan));
    }
}

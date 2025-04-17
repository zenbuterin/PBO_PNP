/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_17042025;

/**
 *
 * @author guslizen
 */
public class Udara extends Kendaraan {
    private boolean mesin;


    public Udara() {
        super();
        this.mesin = false;
    }


    public Udara(String nama, int tahunProduksi, boolean mesin) {
        super(nama, tahunProduksi);
        this.mesin = mesin;
    }


    public boolean getMesin() {
        return mesin;
    }


    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }
    
 

 
    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Pakai Mesin?: " + (mesin ? "Ya" : "Tidak"));
    }


}

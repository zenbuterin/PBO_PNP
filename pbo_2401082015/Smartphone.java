/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2401082015;

/**
 *
 * @author guslizen
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera){
        super(merek, tahunProduksi, garansi);
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
        
        

    }
        public int getKapasitasBaterai(){
        return kapasitasBaterai;
    }
        public void setKapasitasBaterai(int editKapasitas){
            this.kapasitasBaterai = editKapasitas;
        }
        public int getJumlahKamera(){
            return jumlahKamera;
        }
        public void setJumlahKamera(int editJumlah){
            this.jumlahKamera = editJumlah;
        }
    @Override
            public String info(){
        return "\n jumlah kameranya adalah =" + getJumlahKamera() +
                "\n kapasitas baterainya adalah =" + getKapasitasBaterai(); 
              
    }
}

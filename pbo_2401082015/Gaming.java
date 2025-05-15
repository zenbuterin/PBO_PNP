/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2401082015;

/**
 *
 * @author guslizen
 */
public class Gaming extends Laptop{
    private String kartuGrafis;
    private int refreshRate;
        public Gaming(String merek, int tahunProduksi, int garansi, int ukuranLayar, int kapasitasRAM, String kartuGrafis, int refreshRate){
            super(merek, tahunProduksi, garansi, ukuranLayar, kapasitasRAM);
            this.kartuGrafis = kartuGrafis;
            this.refreshRate = refreshRate;
        }
        public String getKartuGrafis(){
            return kartuGrafis;
        }
        public void setKartuGrafis(String editKartu){
            this.kartuGrafis = editKartu;
        }
        public int getRefreshRate(){
            return refreshRate;
        }
        public void setRefreshRate(int editRefresh){
            this.refreshRate = editRefresh;
        }
        @Override
        public String info(){
        return "\n merek barang elektroniknya adalah =" + getMerek() +
                "\n tahun barang elektroniknya adalah =" + getTahunProduksi() +
                "\n garansi barang elektroniknya adalah =" + getGaransi()+
                "\n ukuran layarnya adalah ="+ getUkuranLayar()+
                "\n kapasitas ramnya adalah ="+ getKapasitasRAM()+
                "\n kartu grafisnya adalah ="+ getKartuGrafis()+
                "\n refresh ratenya adalah = "+ getRefreshRate();
    }
        
}

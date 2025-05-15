/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorpismepraktikum;

/**
 *
 * @author guslizen
 */
public class Taksi extends Mobil{
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public Taksi(){
    }
    
    public Taksi (int tarifAwal, int tarifPerKm){
        this.tarifAwal=tarifAwal;
        this.tarifPerKm=tarifPerKm;
    }
    
    public Taksi (int jmlRoda, String warna, String bahanBakar, int kapasitasMesin,int tarifAwal, int tarifPerKm){
        super (jmlRoda,warna,bahanBakar,kapasitasMesin);
        this.tarifAwal=tarifAwal;
        this.tarifPerKm=tarifPerKm;
    }
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal=tarifAwal;
        
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKm(int tarifPerKm){
        this.tarifPerKm=tarifPerKm;
    }
    
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    
    @Override
    public void display (){
        System.out.println("Taxi");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Bahan Bakar :"+this.bahanBakar);
        System.out.println("Kapasitas Mesin :"+this.kapasitasMesin);
        System.out.println("Tarif Awal :"+this.tarifAwal);
        System.out.println("Tarif Per KM :"+this.tarifPerKm);   
    }
}

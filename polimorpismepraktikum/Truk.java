/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorpismepraktikum;

/**
 *
 * @author guslizen
 */
public class Truk extends Mobil{
    protected int muatanMaks;
    
    public Truk(){
    }
    
    public Truk (int muatanMaks){
        this.muatanMaks=muatanMaks;
    }
    
    public Truk (int jmlRoda, String warna,String bahanBakar, int kapasitasMesin, int muatanMaks){
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.muatanMaks=muatanMaks;
    }
    
    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks=muatanMaks;
    }
    
    public int getMuatanMaks(){
        return muatanMaks;
    }
    
    @Override
    public void display (){
        System.out.println("Truk");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Bahan Bakar :"+this.bahanBakar);
        System.out.println("Kapasitas Mesin :"+this.kapasitasMesin);
        System.out.println("Muatan Maksimal :"+this.muatanMaks);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorpismepraktikum;

/**
 *
 * @author guslizen
 */
public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public Mobil(){
    }
    
    public Mobil (String bahanBakar, int kapasitasMesin){
        this.bahanBakar=bahanBakar;
        this.kapasitasMesin=kapasitasMesin;
    }
    
    public Mobil (int jmlRoda, String warna ,String bahanBakar, int kapasitasMesin){
        super (jmlRoda,warna);
        this.bahanBakar=bahanBakar;
        this.kapasitasMesin=kapasitasMesin;
    }
    
    public void setBahanBakar(String bahanBakar ){
        this.bahanBakar=bahanBakar;
    }
    
    public String getBahanBakar(){
        return bahanBakar;
    }
    
    public void setKapasitasMesin(int kapasitasMesin){
        this.kapasitasMesin=kapasitasMesin;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    
    @Override
    public void display (){
        System.out.println("Mobil");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Bahan Bakar :"+this.bahanBakar);
        System.out.println("Kapasitas Mesin :"+this.kapasitasMesin);
        
    }
}
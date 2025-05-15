/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorpismepraktikum;

/**
 *
 * @author guslizen
 */
public class SepedaListrik extends Sepeda{
    protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public SepedaListrik(){
    }
    
    public SepedaListrik(int kecepatanMaks,int jarakTempuh){
        this.kecepatanMaks=kecepatanMaks;
        this.jarakTempuh=jarakTempuh;   
    }
    
    public SepedaListrik(int jmlRoda, String warna, String jmlSadel,int jmlGir, int kecepatanMaks,int jarakTempuh){
        super (jmlRoda,warna,jmlSadel,jmlGir);
        this.kecepatanMaks=kecepatanMaks;
        this.jarakTempuh=jarakTempuh;   
    }
    
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks=kecepatanMaks;
    }
    
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setJarakTempuh(int jarakTempuh ){
        this.jarakTempuh=jarakTempuh;
    }
    
    public int getJarakTempuh(){
        return jarakTempuh;
    }
    
    @Override
    public void display (){
        System.out.println("Sepeda Listrik");
        System.out.println("Tahun Produksi :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Jumlah Sadel :"+this.jmlSadel);
        System.out.println("Jumlah Gir :"+this.jmlGir);
        System.out.println("Kecepatan Maks :"+this.kecepatanMaks);
        System.out.println("Jarak Tempuh :"+this.jarakTempuh);
    }
}

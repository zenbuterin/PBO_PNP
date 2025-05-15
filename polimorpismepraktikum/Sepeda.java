/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorpismepraktikum;

/**
 *
 * @author guslizen
 */
public class Sepeda extends Kendaraan{
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda(){
        
    }
    public Sepeda(String jmlSadel,int jmlGir){
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;   
    }
    public Sepeda(int jmlRoda, String warna, String jmlSadel,int jmlGir){
        super (jmlRoda,warna);
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;   
    }
    public void setJmlSadel(String jmlSadel){
        this.jmlSadel=jmlSadel;
    }
    public String getJmlSadel(){
        return jmlSadel;
    }
    public void jmlGir(int jmlGir){
        this.jmlGir=jmlGir;
    }
    public int getJmlGir(){
        return jmlGir;
    }
    @Override
    public void display (){
        System.out.println("Sepeda");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Jumlah Sadel :"+this.jmlSadel);
        System.out.println("Jumlah Gir :"+this.jmlGir);
        
    }
}
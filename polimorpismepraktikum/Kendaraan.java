/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorpismepraktikum;

/**
 *
 * @author guslizen
 */
public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    public Kendaraan (){
    
    }
    public Kendaraan (int jmlRoda, String warna){
        this.warna=warna;
        this.jmlRoda=jmlRoda;
    }
    public void setJmlRoda (int jmlRoda){
        this.jmlRoda = jmlRoda;
    }
    public int getJmlRoda (){
        return jmlRoda;
    }
    public void setWarna(String warna){
        this.warna=warna;
    }
    public String getWarna(){
        return warna;
    }
    public void display (){
        System.out.println("Kendaraan");
        System.out.println("Jumlah Roda "+this.jmlRoda);
        System.out.println("Warna Kendaraan  "+this.warna);
        
    }
}

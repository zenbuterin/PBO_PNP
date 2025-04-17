/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_17042025;

/**
 *
 * @author guslizen
 */
public class Hewan {
    protected String nama;
    
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    public void bersuara() {

        System.out.println("uwak");
    }
    
    public void tampilkanNama() {
        System.out.println("nama : " + this.nama);
        
    }
}

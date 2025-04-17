/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_17042025;

/**
 *
 * @author guslizen
 */
public class Kucing extends Hewan {
    
    public Kucing(String nama) {
        super(nama); // Memanggil constructor dari superclass Hewan
    }
    
    @Override
    public void bersuara() {
        super.bersuara();
        System.out.println("meong");
    }

}


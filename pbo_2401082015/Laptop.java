/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2401082015;

/**
 *
 * @author guslizen
 */
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop() {
    }
    
    public int getUkuranLayar() {
        return this.ukuranLayar;
        
    }
    
    public void setUkuranLayar(int ukuran) {
        this.ukuranLayar = ukuran;
    }
    
    public int getKapasitasRAM() {
        return this.kapasitasRAM;
        
    }
    
    public void setKapasitasRAM(int kapasitas) {
        this.kapasitasRAM = kapasitas;
        
    }
            
    
    
}

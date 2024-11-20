/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

/**
 *
 * @author gm396
 */
public class MasinaTunsIarba extends Aparat {
    String firma;
    int putere;
    int capacitateRezervor;
    
    public MasinaTunsIarba(){
        super();
        firma = "Necunoscuta";
        putere = 0;
        capacitateRezervor = 0;
    }
    
    public MasinaTunsIarba(String firma, int putere, int capacitateRezervor, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata){
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.firma = firma;
        this.putere = putere;
        this.capacitateRezervor = capacitateRezervor;
    }
    
    public MasinaTunsIarba(MasinaTunsIarba other){
        super(other);
        this.firma = other.firma;
        this.putere = other.putere;
        this.capacitateRezervor = other.capacitateRezervor;
    }
    
    @Override
    public String toString(){
        return super.toString() + ",firma = " + firma + ", putere = " + putere + " W, capacitate rezervor = " + capacitateRezervor + "L.";
    }
}

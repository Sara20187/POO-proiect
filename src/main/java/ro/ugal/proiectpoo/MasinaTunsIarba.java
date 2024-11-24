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
    String culoare;
    String materialLama;
    short putere;
    byte capacitateRezervor;
    
    public MasinaTunsIarba(){
        super();
        firma = " Necunoscuta";
        culoare = " Necunoscuta";
        materialLama = " Necunoscut";
        putere = 0;
        capacitateRezervor = 0;
    }
    
    public MasinaTunsIarba(String firma, String culoare, String materialLama, short putere, byte capacitateRezervor, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata){
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.firma = firma;
        this.culoare = culoare;
        this.materialLama = materialLama;
        this.putere = putere;
        this.capacitateRezervor = capacitateRezervor;
    }
    
    public MasinaTunsIarba(MasinaTunsIarba other){
        super(other);
        this.firma = other.firma;
        this.culoare = other.culoare;
        this.materialLama = other.materialLama;
        this.putere = other.putere;
        this.capacitateRezervor = other.capacitateRezervor;
    }
    
    @Override
    public String toString(){
        return super.toString() + ",firma = " + firma + ", culoare = " + culoare + ", material lama = " + materialLama + ", putere = " + putere + " W, capacitate rezervor = " + capacitateRezervor + "L.";
    }
}

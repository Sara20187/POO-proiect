/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

/**
 *
 * @author mi358
 */
public class AparatCuratatGeamuri extends Aparat {
    String firma;
    String materialLama;
    int putere;
    int autonomie;//durata de timp in care nu necesita incarcare in h
    int capacitateRezervor;

    //constructor implicit
    public AparatCuratatGeamuri() {
        super();
        firma="Necunoscuta";
        materialLama="Necunoscut";
        putere=0;
        autonomie=0;
        capacitateRezervor=0;
    }
    //constructor cu parametrii

    public AparatCuratatGeamuri(String firma, String materialLama, int putere, int autonomie, int capacitateRezervor, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.firma = firma;
        this.materialLama = materialLama;
        this.putere = putere;
        this.autonomie = autonomie;
        this.capacitateRezervor = capacitateRezervor;
    }
    //constructor de copiere

    public AparatCuratatGeamuri( AparatCuratatGeamuri other) {
        super(other);
        this.firma = other.firma;
        this.materialLama = other.materialLama;
        this.putere = other.putere;
        this.autonomie = other.autonomie;
        this.capacitateRezervor = other.capacitateRezervor;
    }

    @Override
    public String toString() {
        return  super.toString() + "firma=" + firma + ", material lama=" + materialLama + ", putere=" + putere + ", autonomie=" + autonomie + ", capacitate rezervor=" + capacitateRezervor  ;
    }
    
}

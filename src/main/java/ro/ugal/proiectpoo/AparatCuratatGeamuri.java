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
    private String firma;
    private String materialLamaPerie;
    private int putere;
    private int autonomie;//durata de timp in care nu necesita incarcare in h
    private int capacitateRezervor;

    //constructor implicit
    public AparatCuratatGeamuri() {
        super();
        firma="Necunoscuta";
        materialLamaPerie="Necunoscut";
        putere=0;
        autonomie=0;
        capacitateRezervor=0;
    }
    //constructor cu parametrii

    public AparatCuratatGeamuri(String firma, String materialLamaPerie, int putere, int autonomie, int capacitateRezervor, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.firma = firma;
        this.materialLamaPerie = materialLamaPerie;
        this.putere = putere;
        this.autonomie = autonomie;
        this.capacitateRezervor = capacitateRezervor;
    }
    //constructor de copiere

    public AparatCuratatGeamuri( AparatCuratatGeamuri other) {
        super(other);
        this.firma = other.firma;
        this.materialLamaPerie = other.materialLamaPerie;
        this.putere = other.putere;
        this.autonomie = other.autonomie;
        this.capacitateRezervor = other.capacitateRezervor;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }  
    public String getFirma() {
        return firma;
    }

    public void setMaterialLama(String materialLamaPerie) {
        this.materialLamaPerie = materialLamaPerie;
    }
 
     public String getMaterialLamaPerie() {
          return materialLamaPerie;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }
     public int getPutere() {
        return putere;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }
     public int getAutonomie() {
        return autonomie;
    }

    public void setCapacitateRezervor(int capacitateRezervor) {
        this.capacitateRezervor = capacitateRezervor;
    }
    public int getCapacitateRezervor() {
        return capacitateRezervor;
    }
    

    @Override
    public String toString() {
        return  super.toString() + "firma=" + firma + ", material lama sau perie=" + materialLamaPerie + ", putere=" + putere + ", autonomie=" + autonomie + ", capacitate rezervor=" + capacitateRezervor  ;
    }
    
}

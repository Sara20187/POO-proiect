/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

/**
 *
 * @author mi358
 */
public class AparatCuratatPardoseli extends Aparat {
    private int putereMotor;//in W
    private int capacitateRezervor; // ml
    private int lungimeCablu;//m
    private String functii;
    private String firma;
    
    //constructor implicit

    public AparatCuratatPardoseli() {
        super();
        putereMotor=0;
        capacitateRezervor=0;
        lungimeCablu=0;
        functii="Necunoscut";
        firma="Necunoscut";
    }
    //constructor cu parametrii

    public AparatCuratatPardoseli(int putereMotor, int capacitateRezervor, int lungimeCablu, String functii, String firma, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.putereMotor = putereMotor;
        this.capacitateRezervor = capacitateRezervor;
        this.lungimeCablu = lungimeCablu;
        this.functii = functii;
        this.firma=firma;
    }
    //constructor de copiere

    public AparatCuratatPardoseli(AparatCuratatPardoseli other) {
        super(other);
        this.putereMotor = other.putereMotor;
        this.capacitateRezervor = other.capacitateRezervor;
        this.lungimeCablu = other.lungimeCablu;
        this.functii = other.functii;
        this.firma=other.firma;
    }

    public void setPutereMotor(int putereMotor) {
        this.putereMotor = putereMotor;
    }
    public int getPutereMotor() {
        return putereMotor;
    }
    public void setCapacitateRezervor(int capacitateRezervor) {
        this.capacitateRezervor = capacitateRezervor;
    }
    public int getCapacitateRezervor() {
        return capacitateRezervor;
    }

    public void setLungimeCablu(int lungimeCablu) {
        this.lungimeCablu = lungimeCablu;
    }
      public int getLungimeCablu() {
        return lungimeCablu;
    }

    public void setFunctii(String functii) {
        this.functii = functii;
    } 
    public String getFunctii() {
        return functii;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
    public String getFirma() {
        return firma;
    }
    

    @Override
    public String toString() {
        return   super.toString()+ "putere motor=" + putereMotor + ", capacitate rezervor=" + capacitateRezervor + ", lungime cablu=" + lungimeCablu + ", functii=" + functii + ", firma=" + firma ;
    }
    
    
}

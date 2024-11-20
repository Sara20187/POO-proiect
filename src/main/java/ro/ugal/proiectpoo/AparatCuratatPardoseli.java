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
    int putereMotor;//in W
    int capacitateRezervor; // ml
    int lungimeCablu;//m
    String functii;
    String firma;
    
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
        this.firma=firma;
    }

    @Override
    public String toString() {
        return   super.toString()+ "putere motor=" + putereMotor + ", capacitate rezervor=" + capacitateRezervor + ", lungime cablu=" + lungimeCablu + ", functii=" + functii + ", firma=" + firma ;
    }
    
    
}

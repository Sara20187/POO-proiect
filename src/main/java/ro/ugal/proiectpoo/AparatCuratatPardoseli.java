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
    int putereMotor;
    int capacitateRezervor;
    int lungimeCablu;
    String functii;
    String accesorii;
    
    //constructor implicit

    public AparatCuratatPardoseli() {
        super();
        putereMotor=0;
        capacitateRezervor=0;
        lungimeCablu=0;
        functii="Necunoscut";
        accesorii="Necunoscut";
    }
    //constructor cu parametrii

    public AparatCuratatPardoseli(int putereMotor, int capacitateRezervor, int lungimeCablu, String functii, String accesorii, String modAlimentare, String tipActionare, int greutate, String modUtilizare, String tipSuprafata) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.putereMotor = putereMotor;
        this.capacitateRezervor = capacitateRezervor;
        this.lungimeCablu = lungimeCablu;
        this.functii = functii;
        this.accesorii = accesorii;
    }
    //constructor de copiere

    public AparatCuratatPardoseli(AparatCuratatPardoseli other) {
        super(other);
        this.putereMotor = other.putereMotor;
        this.capacitateRezervor = other.capacitateRezervor;
        this.lungimeCablu = other.lungimeCablu;
        this.functii = other.functii;
        this.accesorii = other.accesorii;
    }

    @Override
    public String toString() {
        return "AparatCuratatPardoseli:" +super.toString()+ "putereMotor=" + putereMotor + ", capacitateRezervor=" + capacitateRezervor + ", lungimeCablu=" + lungimeCablu + ", functii=" + functii + ", accesorii=" + accesorii + '}';
    }
    
    
}

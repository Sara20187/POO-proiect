/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

/**
 *
 * @author gm396
 */
public class Motosapa extends Aparat {
    String firma;
    String tipMotor;
    int adancimeLucru;
    
    public Motosapa(){
        super();
        firma = "Necunoscuta";
        tipMotor = "Necunoscut";
        adancimeLucru = 0;     
    }
    
    public Motosapa(String firma, String tipMotor, int adancimeLucru, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata){
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.firma = firma;
        this.tipMotor = tipMotor;
        this.adancimeLucru = adancimeLucru;
    }
    
    public Motosapa(Motosapa other){
        super(other);
        this.firma = other.firma;
        this.tipMotor = other.tipMotor;
        this.adancimeLucru = other.adancimeLucru;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", firma = " + firma + ", tip motor = " + tipMotor + ", adancime de lucru = " + adancimeLucru + ", cm.";       
    }
}

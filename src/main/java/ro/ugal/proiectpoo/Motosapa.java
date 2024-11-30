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
    private String firma;
    private String tipMotor;
    private String materialConstructie;
    private String culoare;
    private short adancimeLucru;
    
    public Motosapa(){
        super();
        firma = "Necunoscuta";
        tipMotor = "Necunoscut";
        materialConstructie = " Necunoscut";
        culoare = " Necunoscuta";
        adancimeLucru = 0;     
    }
    
    public Motosapa(String firma, String tipMotor, String materialConstructie, String culoare,short adancimeLucru, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata){
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.firma = firma;
        this.tipMotor = tipMotor;
        this.materialConstructie = materialConstructie;
        this.culoare = culoare;
        this.adancimeLucru = adancimeLucru;
    }
    
    public Motosapa(Motosapa other){
        super(other);
        this.firma = other.firma;
        this.tipMotor = other.tipMotor;
        this.materialConstructie = other.materialConstructie;
        this.culoare = other.culoare;
        this.adancimeLucru = other.adancimeLucru;
    }

    public String getFirma() {
        return firma;
    }
    
    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getTipMotor() {
        return tipMotor;
    }
    
    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }

    public String getMaterialConstructie() {
        return materialConstructie;
    }
    
    public void setMaterialConstructie(String materialConstructie) {
        this.materialConstructie = materialConstructie;
    }

    public String getCuloare() {
        return culoare;
    }
    
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAdancimeLucru() {
        return adancimeLucru;
    }

    public void setAdancimeLucru(short adancimeLucru) {
        this.adancimeLucru = adancimeLucru;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ", firma = " + firma + ", tip motor = " + tipMotor + ", material constructie = " + materialConstructie + ", culoare = " + culoare + ", adancime de lucru = " + adancimeLucru + ", cm.";       
    }
}

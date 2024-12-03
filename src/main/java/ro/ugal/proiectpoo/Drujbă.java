package ro.ugal.proiectpoo;


import ro.ugal.proiectpoo.Aparat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deeac
 */
public class Drujbă extends Aparat {
    int lungimeLama; // Lungimea lamei (în cm)
    String tipDrujbă;   // Tipul drujbei (benzina, electrica)
    String firma;  // Philipls
    int vitezaLantului;
    int capacitateRezervor;

    // Constructor fara argumente
    public Drujbă() {
        super(); // Apelam constructorul clasei părinte
        this.lungimeLama = 0;
        this.tipDrujbă = "Necunoscut";
        this.firma= "Necunoscut";
        this.vitezaLantului= 0;
        this.capacitateRezervor= 0;
    }

    // Constructor cu toate argumentele
    public Drujbă(String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata, int lungimeLama, String tipDrujbă, String firma, int vitezaLantului, int capacitateRezervor) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.lungimeLama = lungimeLama;
        this.tipDrujbă = tipDrujbă;
        this.firma = firma;
        this.vitezaLantului= vitezaLantului; 
        this.capacitateRezervor= capacitateRezervor;
    }

    // Constructor de copiere
    public Drujbă(Drujbă other) {
        super(other);
        this.lungimeLama = other.lungimeLama;
        this.tipDrujbă = other.tipDrujbă;
        this.firma= other.firma;
        this.vitezaLantului= other.vitezaLantului;
        this.capacitateRezervor= other.capacitateRezervor;
    }
    
    public void setLungimeLama(int lungimeLama){
        this.lungimeLama= lungimeLama;
    }
    
    public void setTipDrujbă(String tipDrujbă){
        this.tipDrujbă= tipDrujbă;
    }
    
    public void setFirma(String firma){
        this.firma= firma;
    }
    
    public void setVitezaLantului(int vitezaLantului){
        this.vitezaLantului= vitezaLantului;
    }
    
    public void setCapacitateRezervor(int capacitateRezervor){
        this.capacitateRezervor= capacitateRezervor;
    }
    
    public int getLungimeLama(){
        return lungimeLama;
    }
    
    public String getTipDrujbă(){
        return tipDrujbă;
    }
    
    public String getFirma(){
        return firma;
    }
    
    public int getVitezaLantului(){
        return vitezaLantului;
    }
    
    public int getCapacitateRezervor(){
        return capacitateRezervor;
    }

    // Metoda toString
    @Override
    public String toString() {
        return '}' + "Drujbă{" + 
                super.toString() + 
                ", lungimeLama=" + lungimeLama + " cm" +
                ", tipDrujbă= " + tipDrujbă + '\'' +
                ", firma= " + firma + '\'' +
                ",vitezaLantului="+ vitezaLantului + "km/h" +
                "capacitateRezervor=" + capacitateRezervor+ "litri"+
                '}';
    }
}

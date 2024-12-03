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
public class Trimmer extends Aparat {
    boolean esteElectric; // indica daca este electric sau nu
    int autonomie;  // minute
    String firma;
    double capacitateBaterie; //volti
    double pret;
    
    // constructor fara argumente
    public Trimmer() {
        super(); // apelam constructorul clasei parinte
        this.esteElectric = false;
        this.autonomie = 0;
        this.firma= "Necunoscut";
        this.capacitateBaterie= 0;
        this.pret= 0;
    }
    // constructor cu toate argumentele
    public Trimmer(String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata, boolean esteElectric, int autonomie, String firma, double capacitateBaterie, double pret) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.esteElectric = esteElectric;
        this.autonomie = autonomie;
        this.firma= firma;
        this.capacitateBaterie= capacitateBaterie;
        this.pret= pret;
    }
    // constructor de copiere
    public Trimmer(Trimmer other) {
        super(other);
        this.esteElectric = other.esteElectric;
        this.autonomie = other.autonomie;
        this.firma=other.firma;
        this.capacitateBaterie= other.capacitateBaterie;
        this.pret= other.pret;
    }
    
   public void setEsteElectric( boolean esteElectric){
       this.esteElectric= esteElectric;
   }
   
   public void setAutonomie(int autonomie){
       this.autonomie= autonomie;
   }
   
   public void setFirma(String firma){
       this.firma= firma;
   }
   
   public void setCapacitateBaterie(double capacitateBaterie){
       this.capacitateBaterie= capacitateBaterie;
   }
   
   public void setPret(double pret){
       this.pret= pret;
   }
   
   public boolean getEsteElectric(){
       return esteElectric;
   }
   
   public int getAutonomie(){
       return autonomie;
   }
   
   public String getFirma(){
       return firma;
   }
   
   public double getCapacitateBaterie(){
       return capacitateBaterie;
   }
   
   public double getPret(){
       return pret;
   }
    // Metoda toString
    @Override
    public String toString() {
        return "Trimmer{" + 
                super.toString() + 
                ", esteElectric=" + esteElectric + 
                ", autonomie=" + autonomie + "minute" +
                ", firma='" + firma +
                ", capacitateBaterie=" + capacitateBaterie + "volti" +
                ", pret=" + pret +
                '\'' + '}';
    }
}

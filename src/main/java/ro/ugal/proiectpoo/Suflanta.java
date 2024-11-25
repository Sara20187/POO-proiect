/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

/**
 *
 * @author Sara
 */
class Suflanta extends Aparat{
    private int vitezaAer;
    private int durataFunctionare;
    private String firma;
    private String culoare;
    private int putereMaxima;
   public Suflanta(){
       super();
       vitezaAer=0;
       durataFunctionare=0;
       firma="Necunoscut";
       culoare="Necunoscut";
       putereMaxima=0;
   }
   public Suflanta(int vitezaAer,int durataFunctionare,String firma,String culoare,int putereMaxima,String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata){
       super(modAlimentare,tipActionare,greutate,modUtilizare,tipSuprafata);
       this.vitezaAer=vitezaAer;
       this.durataFunctionare=durataFunctionare;
       this.firma=firma;
       this.culoare=culoare;
       this.putereMaxima=putereMaxima;
   }
   public Suflanta( Suflanta other){
       super(other);
       this.vitezaAer=other.vitezaAer;
       this.durataFunctionare=other.durataFunctionare;
       this.firma=other.firma;
       this.culoare=other.culoare;
       this.putereMaxima=other.putereMaxima;
   }

    public void setVitezaAer(int vitezaAer) {
        this.vitezaAer = vitezaAer;
    }

    public void setDurataFunctionare(int durataFunctionare) {
        this.durataFunctionare = durataFunctionare;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setPutereMaxima(int putereMaxima) {
        this.putereMaxima = putereMaxima;
    }

    public int getVitezaAer() {
        return vitezaAer;
    }

    public int getDurataFunctionare() {
        return durataFunctionare;
    }

    public String getFirma() {
        return firma;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getPutereMaxima() {
        return putereMaxima;
    }
   
   @Override
   public String toString(){
       return  super.toString() + "; Viteza aerului este de : "+ vitezaAer + " km/ora, durata de functionare este de:  "+ durataFunctionare + " ore, iar firma produsului este:  "+ firma + ",culoarea este: "+culoare + ", iar puterea maxima este: "+putereMaxima;
   }
}

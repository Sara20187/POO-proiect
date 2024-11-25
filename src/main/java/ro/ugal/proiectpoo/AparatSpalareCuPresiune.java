/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

/**
 *
 * @author Sara
 */
class AparatSpalareCuPresiune extends Aparat{
    private int putereMaxima;
    private String tipMotor;
    private String nivelZgomot;
    private String culoare;
    private String firma;
    
   public AparatSpalareCuPresiune(){
       super();
       putereMaxima=0;
       tipMotor="Necunoscut";
       nivelZgomot="Necunoscut";
       culoare="Necunoscut";
       firma="Necunoscut";
   }
   public AparatSpalareCuPresiune(int putereMaxima,String tipMotor,String nivelZgomot,String culoare,String firma, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata){
       super(modAlimentare,tipActionare,greutate,modUtilizare,tipSuprafata);
       this.putereMaxima=putereMaxima;
       this.tipMotor=tipMotor;
       this.nivelZgomot=nivelZgomot;
       this.culoare=culoare;
       this.firma=firma;
   }
   public AparatSpalareCuPresiune(AparatSpalareCuPresiune other){
       super(other);
       this.putereMaxima=other.putereMaxima;
       this.tipMotor=other.tipMotor;
       this.nivelZgomot=other.nivelZgomot;
       this.culoare=other.culoare;
       this.firma=other.firma;
   }

    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }

    public void setNivelZgomot(String nivelZgomot) {
        this.nivelZgomot = nivelZgomot;
    }

    public void setPutereMaxima(int putereMaxima) {
        this.putereMaxima = putereMaxima;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public int getPutereMaxima() {
        return putereMaxima;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getFirma() {
        return firma;
    }
    

    public String getTipMotor() {
        return tipMotor;
    }

    public String getNivelZgomot() {
        return nivelZgomot;
    }
   
   @Override
   public String toString(){
       return  super.toString() + ";Puterea maxima este de "+ putereMaxima + " bari,tipul de motor este "+ tipMotor + ", nivelul zgomotului este " + nivelZgomot + ", culoarea este: "+culoare+", iar firma este: "+firma;
   }
}

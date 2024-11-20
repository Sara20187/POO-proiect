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
    int putereMaxima;
    String tipMotor;
    String nivelZgomot;
    
   public AparatSpalareCuPresiune(){
       super();
       putereMaxima=0;
       tipMotor="Necunoscut";
       nivelZgomot="Necunoscut";
   }
   public AparatSpalareCuPresiune(int putereMaxima,String tipMotor,String nivelZgomot,  String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata){
       super(modAlimentare,tipActionare,greutate,modUtilizare,tipSuprafata);
       this.putereMaxima=putereMaxima;
       this.tipMotor=tipMotor;
       this.nivelZgomot=nivelZgomot;
   }
   public AparatSpalareCuPresiune(AparatSpalareCuPresiune other){
       super(other);
       this.putereMaxima=other.putereMaxima;
       this.tipMotor=other.tipMotor;
       this.nivelZgomot=other.nivelZgomot;
   }
   @Override
   public String toString(){
       return  super.toString() + ";Puterea maxima este de "+ putereMaxima + " bari,tipul de motor este "+ tipMotor + ", iar nivelul zgomotului este " + nivelZgomot;
   }
}

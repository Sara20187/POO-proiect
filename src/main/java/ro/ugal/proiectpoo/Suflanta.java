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
    int vitezaAer;
     int durataFunctionare;
     String firma;
    
    
   public Suflanta(){
       super();
       vitezaAer=0;
       durataFunctionare=0;
       firma="Necunoscut";
   }
   public Suflanta(int vitezaAer,int durataFunctionare,String firma,String modAlimentare, String tipActionare, int greutate, String modUtilizare, String tipSuprafata){
       super(modAlimentare,tipActionare,greutate,modUtilizare,tipSuprafata);
       this.vitezaAer=vitezaAer;
       this.durataFunctionare=durataFunctionare;
       this.firma=firma;
   }
   public Suflanta( Suflanta other){
       super(other);
       this.vitezaAer=other.vitezaAer;
       this.durataFunctionare=other.durataFunctionare;
       this.firma=other.firma;
   }
   @Override
   public String toString(){
       return  super.toString() + "; Viteza aerului este de : "+ vitezaAer + " km/ora, durata de functionare este de:  "+ durataFunctionare + " ore, iar firma produsului este:  "+ firma;
   }
}

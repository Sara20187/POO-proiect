/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

 

/**
 *
 * @author mi358
 */
public class Aparat implements Control {
    String modAlimentare;//cablu sau baterii
    String tipActionare; //manual, semi-automat, automat
    byte greutate;//kg
    String modUtilizare;//curatare, tuns, spalare, taiere, etc..
    String tipSuprafata;// pentru ce tip de suprafata e potrivit:pardoseala, geamuri, iarba, suprafete dure, etc..
    
    //constructor implicit
    public Aparat() {
        modAlimentare="Necunoscut";
        tipActionare="Necunoscut";
        greutate=0;
        modUtilizare="Necunoscut";
        tipSuprafata="Necunoscut";
    }
    //constructor cu parametrii
    public Aparat(String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata) {
        this.modAlimentare = modAlimentare;
        this.tipActionare = tipActionare;
        this.greutate = greutate;
        this.modUtilizare = modUtilizare;
        this.tipSuprafata = tipSuprafata;
    }
    //constructor de copiere
    public Aparat(Aparat other) {
        this.modAlimentare = other.modAlimentare;
        this.tipActionare = other.tipActionare;
        this.greutate = other.greutate;
        this.modUtilizare = other.modUtilizare;
        this.tipSuprafata = other.tipSuprafata;
    }

    @Override
    public String toString() {
        return  "mod de alimentare=" + modAlimentare + ", tip de actionare=" + tipActionare + ", greutate=" + greutate + ", mod de utilizare=" + modUtilizare + ", tip de suprafata=" + tipSuprafata;
    }

    @Override
    public void pornesteAparat() {
    System.out.println("Apasa butonul de pornire");
    }

    @Override
    public void opresteAparat() {
     System.out.println("Apasa butonul de inchidere"); 
    }
    
}

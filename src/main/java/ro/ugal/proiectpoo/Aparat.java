/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

/**
 *
 * @author mi358
 */
public class Aparat {
    String modAlimentare;//cablu sau baterii
    String tipActionare; //manual, semi-automat, automat
    int greutate;
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
    public Aparat(String modAlimentare, String tipActionare, int greutate, String modUtilizare, String tipSuprafata) {
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
        return "Aparat:" + "modAlimentare=" + modAlimentare + ", tipActionare=" + tipActionare + ", greutate=" + greutate + ", modUtilizare=" + modUtilizare + ", tipSuprafata=" + tipSuprafata;
    }
    
}

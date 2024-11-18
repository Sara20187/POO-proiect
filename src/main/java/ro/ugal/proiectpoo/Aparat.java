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
    int greutate;//kg
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
        return  "mod de alimentare=" + modAlimentare + ", tip de actionare=" + tipActionare + ", greutate=" + greutate + ", mod de utilizare=" + modUtilizare + ", tip de suprafata=" + tipSuprafata;
    }
    
    public static void main(String[] args) {
        
        //instante din Aparat
        Aparat aparat1=new Aparat("Cablu", "Automat", 5, "Tuns", "Iarba");
        Aparat aparat2=new Aparat("Baterii", "Manual", 3, "Taiere", "Lemn");
        Aparat aparat3=new Aparat(); //folosit constructor fara argumente
        System.out.println("Instante Aparat:");
        System.out.println(aparat1);
        System.out.println(aparat2);
        System.out.println(aparat3);
        
        // instanțe din clasa Drujbă
        Drujbă drujba1 = new Drujbă("Benzină", "Automat", 6, "Tăiere", "Pardoseală", 40, "Benzină", "Stihl");
        Drujbă drujba2 = new Drujbă("Cablu", "Semi-Automat", 7, "Tăiere", "Pardoseală", 35, "Electric", "Husqvarna");
        
        System.out.println("\nInstanțe Drujbă:");
        System.out.println(drujba1);
        System.out.println(drujba2);
        
        // instanțe din clasa Trimmer
        Trimmer trimmer1 = new Trimmer("Baterii", "Automat", 1, "Tuns iarba", "Iarbă", true, 60, "Philips");
        Trimmer trimmer2 = new Trimmer("Cablu", "Manual", 2, "Tuns iarba", "Iarbă", false, 0, "Black & Decker");
        
        System.out.println("\nInstanțe Trimmer:");
        System.out.println(trimmer1);
        System.out.println(trimmer2);
    }
}
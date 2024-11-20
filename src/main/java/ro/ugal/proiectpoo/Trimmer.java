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
    int autonomie;         // in minute
    String firma; // philips

    // constructor fara argumente
    public Trimmer() {
        super(); // apelam constructorul clasei parinte
        this.esteElectric = false;
        this.autonomie = 0;
        this.firma= "Necunoscut";
    }

    // constructor cu toate argumentele
    public Trimmer(String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata, boolean esteElectric, int autonomie, String firma) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.esteElectric = esteElectric;
        this.autonomie = autonomie;
        this.firma= firma;
    }

    // constructor de copiere
    public Trimmer(Trimmer altTrimmer) {
        super(altTrimmer);
        this.esteElectric = altTrimmer.esteElectric;
        this.autonomie = altTrimmer.autonomie;
        this.firma=altTrimmer.firma;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Trimmer{" + super.toString() + ", esteElectric=" + esteElectric + ", autonomie=" + autonomie + " minute" + ", firma='" + firma + '\'' + '}';
    }
}

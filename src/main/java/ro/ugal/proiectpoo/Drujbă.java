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
    String tipDrujbă;   // Tipul drujbei (benzină, electrică)
    String firma;  // Philipls

    // Constructor fără argumente
    public Drujbă() {
        super(); // Apelăm constructorul clasei părinte
        this.lungimeLama = 0;
        this.tipDrujbă = "Necunoscut";
        this.firma= "Necunoscut";
    }

    // Constructor cu toate argumentele
    public Drujbă(String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata, int lungimeLama, String tipDrujbă, String firma) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.lungimeLama = lungimeLama;
        this.tipDrujbă = tipDrujbă;
        this.firma = firma;
    }

    // Constructor de copiere
    public Drujbă(Drujbă altaDrujbă) {
        super(altaDrujbă);
        this.lungimeLama = altaDrujbă.lungimeLama;
        this.tipDrujbă = altaDrujbă.tipDrujbă;
        this.firma= altaDrujbă.firma;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Drujbă{" + super.toString() + ", lungimeLama=" + lungimeLama + " cm, tipDrujbă='" + tipDrujbă + '\'' + ", firma='" + firma + '\'' + '}';
    }
}

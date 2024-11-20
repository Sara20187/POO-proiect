/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.proiectpoo;

/**
 *
 * @author da225
 */
public class AspiratorUscat extends Aparat {
    int numarRoti;
    int lungimeCablu; //in metri
    int lungimeFurtun; //in metri
    String culoare;
    String tipSac;
    
    //constructor fara argumente
    public AspiratorUscat(){
        super();
        this.numarRoti = 4;
        this.tipSac = "Textil";
        this.lungimeCablu = 8;
        this.culoare = "Verde";
        this.lungimeFurtun = 4;
    }
    
    //constructor cu toate argumentele

    public AspiratorUscat(int numarRoti, int lungimeCablu, int lungimeFurtun, String culoare, String tipSac, String modAlimentare, String tipActionare, byte greutate, String modUtilizare, String tipSuprafata) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.numarRoti = numarRoti;
        this.lungimeCablu = lungimeCablu;
        this.lungimeFurtun = lungimeFurtun;
        this.culoare = culoare;
        this.tipSac = tipSac;
    }
    
    
    //constructor de copiere
    public AspiratorUscat(AspiratorUscat other) {
        super(other);
        this.numarRoti = other.numarRoti;
        this.lungimeCablu = other.lungimeCablu;
        this.lungimeFurtun = other.lungimeFurtun;
        this.culoare = other.culoare;
        this.tipSac = other.tipSac;
    }
    
    //metoda toString:
    @Override
    public String toString() {
        return "numarRoti=" + numarRoti + ", lungimeCablu=" + lungimeCablu + ", lungimeFurtun=" + lungimeFurtun + ", culoare=" + culoare + ", tipSac=" + tipSac;
    }
    
    
}

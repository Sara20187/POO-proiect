package proiectpoo;
public class AspiratorUmed extends Aparat {
    int capacitateRezervor; // in litri
    String tipLichid; // apa, detergent
    int timpFunctionare;
    String tipSistemUmezire; // ex: jet continuu / stropire
    String culoare;

    //constructor fara argumente
    public AspiratorUmed(){
        this.capacitateRezervor = 10;
        this.tipLichid = "apa";
        this.timpFunctionare = 60;
        this.tipSistemUmezire = "stropire";
        this.culoare = "galben";
    }

    //constructor cu toate argumentele
    public AspiratorUmed(int capacitateRezervor, String tipLichid, int timpFunctionare, String tipSistemUmezire, String culoare, String modAlimentare, String tipActionare, int greutate, String modUtilizare, String tipSuprafata) {
        super(modAlimentare, tipActionare, greutate, modUtilizare, tipSuprafata);
        this.capacitateRezervor = capacitateRezervor;
        this.tipLichid = tipLichid;
        this.timpFunctionare = timpFunctionare;
        this.tipSistemUmezire = tipSistemUmezire;
        this.culoare = culoare;
    }

    //constructor de copiere
    public AspiratorUmed(AspiratorUmed other) {
        super(other);
        this.capacitateRezervor = other.capacitateRezervor;
        this.tipLichid = other.tipLichid;
        this.timpFunctionare = other.timpFunctionare;
        this.tipSistemUmezire = other.tipSistemUmezire;
        this.culoare = other.culoare;
    }
    //metoda toString:
    @Override
    public String toString() {
        return "capacitateRezervor=" + capacitateRezervor + ", tipLichid=" + tipLichid + ", timpFunctionare=" + timpFunctionare + ", tipSistemUmezire=" + tipSistemUmezire + ", culoare=" + culoare;
    }
    
    
}

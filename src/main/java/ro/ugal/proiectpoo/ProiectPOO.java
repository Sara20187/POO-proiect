/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.proiectpoo;

/**
 *
 * @author mi358
 */
public class ProiectPOO {

    public static void main(String[] args) {
        Aparat aparat1=new Aparat();
        Aparat aparat2=new Aparat("cablu","manual",(byte)2,"curatare","parchet");
        Aparat aparat3=new Aparat(aparat2);
        aparat1.pornesteAparat();
        aparat1.opresteAparat();
        AparatCuratatPardoseli mop=new AparatCuratatPardoseli();
        AparatCuratatPardoseli mopCuAburi=new AparatCuratatPardoseli(1200,300,3,"Dezinfectare cu aburi","Vileda","cablu","manual",(byte)2,"curatare","parchet si gresie");
        AparatCuratatPardoseli copieMopAburi=new AparatCuratatPardoseli(mopCuAburi);
    
        AparatCuratatGeamuri stergator=new AparatCuratatGeamuri();
        AparatCuratatGeamuri aparatCuratatGeamuri=new AparatCuratatGeamuri("Bosch","cauciuc",100,1,200,"cablu","manual",(byte)1,"curatare","sticla");
        AparatCuratatGeamuri copieAparatCuratatGeamuri=new AparatCuratatGeamuri(aparatCuratatGeamuri);
        
        System.out.println("Aparat1: "+aparat1);
        System.out.println("Aparat2: "+aparat2);
        System.out.println("Aparat3: "+aparat3);
        
        System.out.println("Mop: " +mop);
        System.out.println("Mop cu aburi: "+mopCuAburi);
        System.out.println("Copie a mopului cu aburi: "+copieMopAburi);
        
        System.out.println("Stergator: "+ stergator);
        System.out.println("Aparat de curatat geamuri: "+aparatCuratatGeamuri);
        System.out.println("Copie aparat de curatat geamuri: "+copieAparatCuratatGeamuri);
        
        Motosapa motosapaBenzina = new Motosapa();
        Motosapa motosapaElectrica = new Motosapa("Ruris", "electric", 20, "baterii", "automat",(byte) 20, "sapa", "pamant");
        Motosapa copieMotosapaElectrica = new Motosapa(motosapaElectrica);
        
        MasinaTunsIarba masinaTunsIarba1 = new MasinaTunsIarba();
        MasinaTunsIarba masinaTunsIarba2 = new MasinaTunsIarba("DeWalt", "galben", "otel",(short)1000, (byte)2, "manual", "cablu", (byte)15, "tuns", "iarba");
        MasinaTunsIarba copieMasinaTunsIarba2 = new MasinaTunsIarba(masinaTunsIarba2);
        
        System.out.println("Motosapa pe benzina: " + motosapaBenzina);
        System.out.println("Motosapa electrica: " + motosapaElectrica);
        System.out.println("Copie motosapa electrica: " + copieMotosapaElectrica);

        System.out.println("Masina tuns iarba 1: " + masinaTunsIarba1);
        System.out.println("Masina tuns iarba 2: " + masinaTunsIarba2);
        System.out.println("Copie masina tuns iarba 2: " + copieMasinaTunsIarba2);
        
        AparatSpalareCuPresiune lavor=new AparatSpalareCuPresiune(135,"electric","mare","baterii","manual",(byte)15,"clatire","masini");
        AparatSpalareCuPresiune honda=new AparatSpalareCuPresiune(160,"benzina","silentios","cablu","manual",(byte)20,"curatare","pereti exteriori");
        AparatSpalareCuPresiune bosch=new AparatSpalareCuPresiune(200,"motorina","usor redus","energie solara","manual",(byte)30,"curatare intensa","pavaje");
        AparatSpalareCuPresiune copieAparatSpalarePresiune=new AparatSpalareCuPresiune(honda);
        
        System.out.println("Aparat de spalare cu presiune de uz casnic: "+ lavor);
        System.out.println("Aparat de spalare cu presiune semi-profesionale: "+ honda);
        System.out.println("Aparat de spalare cu presiune profesionale: "+bosch);
        System.out.println("Copie aparat spalare cu presiune: "+copieAparatSpalarePresiune);
         
        Suflanta electrice=new Suflanta(100,24,"Bosch","electrica","manuala",(byte)13,"indepartarea mizeriilor","interior garaj"); 
        Suflanta peAcumulator=new Suflanta(120,48,"Greenworks","acumulator","manuala",(byte)15,"aspirare","terase si gradini");
        Suflanta peBenzina=new Suflanta(160,72,"Echo","benzina","manuala",(byte)20,"indepartarea mizeriilor","aleii si curti"); 
        Suflanta copieSuflanta=new Suflanta(peBenzina);
        
        System.out.println("Suflante electriea: "+ electrice);
        System.out.println("Suflante cu acumulator: "+ peAcumulator);
        System.out.println("Suflante pe benzina: "+peBenzina);
        System.out.println("Copie suflanta: "+copieSuflanta);   
        
        AspiratorUmed aspiratorUmed1 = new AspiratorUmed();
        AspiratorUmed aspiratorUmed2 = new AspiratorUmed(14, "detergent", 45, "jet continuu", "turcoaz", "baterii", "manual", (byte)3, "curatare", "geam");
        AspiratorUmed aspiratorUmed3 = new AspiratorUmed(aspiratorUmed2);
        System.out.println("aspiratorUmed1: " + aspiratorUmed1.toString());
        System.out.println("aspiratorUmed2: " + aspiratorUmed2.toString());
        System.out.println("aspiratorUmed3: " + aspiratorUmed3.toString());
    
        AspiratorUscat aspiratorUscat1 = new AspiratorUscat();
        AspiratorUscat aspiratorUscat2 = new AspiratorUscat(2, 5, 9, "mov", "hartie", "cablu", "automat", (byte)6, "curatare", "pardoseala");
        AspiratorUscat aspiratorUscat3 = new AspiratorUscat(aspiratorUscat2);
        System.out.println("aspiratorUscat1: " + aspiratorUscat1.toString());
        System.out.println("aspiratorUscat2: " + aspiratorUscat2.toString());
        System.out.println("aspiratorUscat3: " + aspiratorUscat3.toString());

        // instanțe din clasa Drujbă
        Drujbă drujba1 = new Drujbă("Benzină", "Automat", (byte)6, "Tăiere", "Pardoseală", 40, "Benzină", "Stihl");
        Drujbă drujba2 = new Drujbă("Cablu", "Semi-Automat", (byte)7, "Tăiere", "Pardoseală", 35, "Electric", "Husqvarna");
        
        System.out.println("\nInstanțe Drujbă:");
        System.out.println(drujba1);
        System.out.println(drujba2);
        
        // instanțe din clasa Trimmer
        Trimmer trimmer1 = new Trimmer("Baterii", "Automat", (byte)1, "Tuns iarba", "Iarbă", true, 60, "Philips");
        Trimmer trimmer2 = new Trimmer("Cablu", "Manual", (byte)2, "Tuns iarba", "Iarbă", false, 0, "Black & Decker");
        
        System.out.println("\nInstanțe Trimmer:");
        System.out.println(trimmer1);
        System.out.println(trimmer2);
    }    
}

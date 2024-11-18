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
        Aparat aparat2=new Aparat("cablu","manual",2,"curatare","parchet");
        Aparat aparat3=new Aparat(aparat2);
        
        AparatCuratatPardoseli mop=new AparatCuratatPardoseli();
        AparatCuratatPardoseli mopCuAburi=new AparatCuratatPardoseli(1200,300,3,"Dezinfectare cu aburi","Vileda","cablu","manual",2,"curatare","parchet si gresie");
        AparatCuratatPardoseli copieMopAburi=new AparatCuratatPardoseli(mopCuAburi);
    
        AparatCuratatGeamuri stergator=new AparatCuratatGeamuri();
        AparatCuratatGeamuri aparatCuratatGeamuri=new AparatCuratatGeamuri("Bosch","cauciuc",100,1,200,"cablu","manual",1,"curatare","sticla");
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
        Motosapa motosapaElectrica = new Motosapa("Ruris", "electric", 20, "baterii", "automat", 20, "sapa", "pamant");
        Motosapa copieMotosapaElectrica = new Motosapa(motosapaElectrica);
        
        MasinaTunsIarba masinaTuns = new MasinaTunsIarba();
        MasinaTunsIarba masinaTunsIarba = new MasinaTunsIarba("DeWalt", 1500, 2, "automat", "baterii", 20, "tuns", "iarba");
        MasinaTunsIarba copieMasinaTunsIarba = new MasinaTunsIarba(masinaTunsIarba);
        
        System.out.println("Motosapa pe benzina: " + motosapaBenzina);
        System.out.println("Motosapa electrica: " + motosapaElectrica);
        System.out.println("Copie motosapa electrica: " + copieMotosapaElectrica);

        System.out.println("Masina tuns: " + masinaTuns);
        System.out.println("Masina tuns iarba: " + masinaTunsIarba);
        System.out.println("Copie masina tuns iarba: " + copieMasinaTunsIarba);
        
        AparatSpalareCuPresiune lavor=new AparatSpalareCuPresiune(135,"electric","mare","baterii","manual",15,"clatire","masini");
        AparatSpalareCuPresiune honda=new AparatSpalareCuPresiune(160,"benzina","silentios","cablu","manual",20,"curatare","pereti exteriori");
        AparatSpalareCuPresiune bosch=new AparatSpalareCuPresiune(200,"motorina","usor redus","energie solara","manual",30,"curatare intensa","pavaje");
        AparatSpalareCuPresiune copieAparatSpalarePresiune=new AparatSpalareCuPresiune(honda);
        
        System.out.println("Aparat de spalare cu presiune de uz casnic: "+ lavor);
        System.out.println("Aparat de spalare cu presiune semi-profesionale: "+ honda);
        System.out.println("Aparat de spalare cu presiune profesionale: "+bosch);
        System.out.println("Copie aparat spalare cu presiune: "+copieAparatSpalarePresiune);
         
        Suflanta electrice=new Suflanta(100,24,"Bosch","electrica","manuala",13,"indepartarea mizeriilor","interior garaj"); 
        Suflanta peAcumulator=new Suflanta(120,48,"Greenworks","acumulator","manuala",15,"aspirare","terase si gradini");
        Suflanta peBenzina=new Suflanta(160,72,"Echo","benzina","manuala",20,"indepartarea mizeriilor","aleii si curti"); 
        Suflanta copieSuflanta=new Suflanta(peBenzina);
        
        System.out.println("Suflante electriea: "+ electrice);
        System.out.println("Suflante cu acumulator: "+ peAcumulator);
        System.out.println("Suflante pe benzina: "+peBenzina);
        System.out.println("Copie suflanta: "+copieSuflanta);        
    }    
}

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.proiectpoo;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author mi358
 */
public class ProiectPOO {

    public static void main(String[] args) {
        Aparat aparatCuratatPardoseli=new Aparat();
        Aparat aparatCuratatGeamuri=new Aparat("cablu","manual",(byte)2,"curatare","parchet");
        Aparat aparatCuratatSticla=new Aparat(aparatCuratatGeamuri);
        Aparat aparatTaiatLemne=new Aparat("cablu","manual",(byte)3,"taiere","lemn");
        Aparat aparatTaiatIarba=new Aparat("baterie","semimanual",(byte)5,"taiere","iarba");
        Aparat aparatDeSapat=new Aparat("baterie","semimanual",(byte)2,"sapat","pamant/sol");
        Aparat aparatDeAspirat=new Aparat("cablu","manual",(byte)4,"curatare","podeaua");
        Aparat aparatDeSuflat=new Aparat("baterie","manual",(byte)3,"curatare","solul de frunze");
        Aparat aparatDeTaiatVegetatie=new Aparat("baterie","manual",(byte)3,"taiere","iarba"); //trimmer
        Aparat aparatSpalareCuPresiune=new Aparat("cablu","manual",(byte)1,"curatare","orice suprafata");  
       
        AparatCuratatPardoseli mop=new AparatCuratatPardoseli();
        AparatCuratatPardoseli mopCuAburi=new AparatCuratatPardoseli(1200,300,3,"Dezinfectare cu aburi","Vileda","cablu","manual",(byte)2,"curatare","parchet si gresie");
        AparatCuratatPardoseli mopAburiCopie=new AparatCuratatPardoseli(mopCuAburi);
        AparatCuratatPardoseli mopMyria=new AparatCuratatPardoseli(2000,500,5,"Dezinfectare si curatare","Myria","cablu","manual",(byte)2,"curatare","pardoseala");
        AparatCuratatPardoseli mopGorenje=new AparatCuratatPardoseli(1500,600,6,"spalare si dezifectare","Gorenje","cablu","manual",(byte)2,"curatare","pardoseala");
        AparatCuratatPardoseli masinaDeSpalatPardoseliLavor=new AparatCuratatPardoseli(4000,1000,14,"curatare si uscare","Lavor","cablu","manual",(byte)2,"curatare","pardoseala");
        AparatCuratatPardoseli masinaDeSpalatPardoseliDart=new AparatCuratatPardoseli(4500,1000,12,"dezinfecatre, curatare si uscare","Dart","cablu","semimanual",(byte)6,"curatare","pardoseala" );
        AparatCuratatPardoseli masinaDeSpalatPardoseliDureLavor=new AparatCuratatPardoseli(5000,1500,10," Curatare suprafete dure","Lavor","cablu","semimanual",(byte)5,"curatare","suprafete dure");
        AparatCuratatPardoseli masinaDeSpalatPardoseliDureDart=new AparatCuratatPardoseli(5000,1500,10,"curatare suprafete dure","Dart","cablu","semimanual",(byte)7,"curatare","suprafete dure");
        AparatCuratatPardoseli masinaHybrid=new AparatCuratatPardoseli(3000,900,10,"aspirare, curatare si uscare","Gorenje","cablu","semimanual",(byte)4,"curatare","pardoseala");
        
        AparatCuratatGeamuri stergator=new AparatCuratatGeamuri();
        AparatCuratatGeamuri aspiratorGeamuri=new AparatCuratatGeamuri("Bosch","cauciuc",100,1,200,"cablu","manual",(byte)1,"curatare","sticla");
        AparatCuratatGeamuri aparatGeamuri=new AparatCuratatGeamuri(aspiratorGeamuri);
        AparatCuratatGeamuri aparatCuratatAburi=new AparatCuratatGeamuri("Karcher","cauciuc",100,1,200,"baterie","semimanual",(byte)2,"curatare","sticla");
        AparatCuratatGeamuri curatatorElectric=new AparatCuratatGeamuri("Bosch","material textil",200,2,400,"baterie","semimanual",(byte)2,"curatare","sticla");
        AparatCuratatGeamuri robotCuratareGeamuri=new AparatCuratatGeamuri("IHunt","material textil",300,1,200,"baterie","automat",(byte)2,"curatare","sticla");
        AparatCuratatGeamuri stergatorFlippy=new AparatCuratatGeamuri("Flippy","cauciuc",200,1,200,"baterie","manual",(byte)1,"curatare","sticla");      
        AparatCuratatGeamuri aparatGeamuriTaurus=new AparatCuratatGeamuri("Taurus","cauciuc",100,2,300,"baterie","manual",(byte)2,"curatare","sticla");       
        AparatCuratatGeamuri stergatorKarcher=new AparatCuratatGeamuri("Karcher","cauciuc",100,2,200,"baterie","manual",(byte)1,"curatare","sticla");       
        AparatCuratatGeamuri perieElectrica=new AparatCuratatGeamuri("Bosch","plastic sau textil",200,2,300,"baterie","semimanual",(byte)2,"curatare","sticla");
                
        aparatCuratatPardoseli.pornesteAparat();
        aparatCuratatPardoseli.opresteAparat();
        System.out.println("\nAparat de curatat pardoseli: "+aparatCuratatPardoseli);
        System.out.println("Aparat de curatat geamuri: "+aparatCuratatGeamuri);
        System.out.println("Aparat de curatat sticla: "+aparatCuratatSticla);
        
        System.out.println("\nMop: " +mop);
        System.out.println("Mop cu aburi: "+mopCuAburi);
        System.out.println("Copie a mopului cu aburi: "+mopAburiCopie);
        
        System.out.println("\nStergator: "+ stergator);
        System.out.println("Aspirator de geamuri: "+aspiratorGeamuri);
        System.out.println("Copie aspirator de geamuri: "+aparatGeamuri+"\n");
        
 
         //Vectori
     //  Aparat[] apar=new Aparat[10];
     //  apar[0]=aparatCuratatPardoseli;
     //apar[1]=aparatCuratatGeamuri;
     //  apar[2]=aparatCuratatSticla;  
     //  apar[3]=aparatTaiatLemne;
     //   apar[4]=aparatTaiatIarba;  
     // apar[5]=aparatDeSapat;
     // apar[6]=aparatDeAspirat;        
     //apar[7]=aparatDeSuflat;
     // apar[8]=trimmer;
     //  apar[9]=aparatSpalareCuPresiune;
                
        //for(int i=0;i<apar.length;i=i+2)
        //System.out.println("Vector: "+apar[i]); 
        
        //Vector de 10 elemente pentru fiecare clasa
 
        ArrayList<Aparat> aparate=new ArrayList();
        aparate.add(aparatCuratatPardoseli);
        aparate.add(aparatCuratatGeamuri);
        aparate.add(aparatCuratatSticla);
        aparate.add(aparatTaiatLemne);
        aparate.add(aparatTaiatIarba);
        aparate.add(aparatDeSapat);
        aparate.add(aparatDeAspirat);
        aparate.add(aparatDeSuflat);
        aparate.add(aparatDeTaiatVegetatie);
        aparate.add(aparatSpalareCuPresiune);
       for(Aparat apm:aparate){
           if(apm.greutate >2 && apm.modAlimentare.equals("cablu")){
                System.out.println("Aparate: " +apm);
           }}
           System.out.println("\n");
        ArrayList<AparatCuratatPardoseli> aparateCuratatPardoseli=new ArrayList();
        aparateCuratatPardoseli.add(mop);
        aparateCuratatPardoseli.add(mopCuAburi);
        aparateCuratatPardoseli.add(mopAburiCopie);
        aparateCuratatPardoseli.add(mopMyria);
        aparateCuratatPardoseli.add(mopGorenje); 
        aparateCuratatPardoseli.add(masinaDeSpalatPardoseliLavor);
        aparateCuratatPardoseli.add(masinaDeSpalatPardoseliDart); 
        aparateCuratatPardoseli.add(masinaDeSpalatPardoseliDureLavor); 
        aparateCuratatPardoseli.add(masinaDeSpalatPardoseliDureDart); 
        aparateCuratatPardoseli.add(masinaHybrid);
        for (AparatCuratatPardoseli acp : aparateCuratatPardoseli) {
           if (acp.getLungimeCablu() > 9 && acp.getFirma().equals("Lavor")) {
               System.out.println("Aparate de curatat pardoseli: " + acp);
           }
       }
         System.out.println("\n");
 
        ArrayList<AparatCuratatGeamuri> aparateCuratatGeamuri=new ArrayList();
        aparateCuratatGeamuri.add(stergator);
        aparateCuratatGeamuri.add(aspiratorGeamuri);
        aparateCuratatGeamuri.add(aparatGeamuri);
        aparateCuratatGeamuri.add(aparatCuratatAburi);
        aparateCuratatGeamuri.add(curatatorElectric);
        aparateCuratatGeamuri.add(robotCuratareGeamuri);
        aparateCuratatGeamuri.add(stergatorFlippy);
        aparateCuratatGeamuri.add(aparatGeamuriTaurus);
        aparateCuratatGeamuri.add(stergatorKarcher);
        aparateCuratatGeamuri.add(perieElectrica);
        for (AparatCuratatGeamuri acg : aparateCuratatGeamuri) {
            if (acg.getMaterialLamaPerie().equals("cauciuc") && acg.getAutonomie() > 1) {
                System.out.println("Aparate de curatat geamuri: " + acg);
            }
        } 
        System.out.println("\n");
  
        MasinaTunsIarba masinaDeTuns = new MasinaTunsIarba();
        MasinaTunsIarba masinaElectrica = new MasinaTunsIarba("DeWalt", "galben", "metal",(short)1300, (byte)5, "cablu", "manual", (byte)12, "taiere", "iarba");
        MasinaTunsIarba masinaElectricaBosch = new MasinaTunsIarba("Bosch", "galben", "metal", (short)1000, (byte)6, "cablu", "manual", (byte)10, "taiere", "iarba");
        MasinaTunsIarba masinaElectricaMakita = new MasinaTunsIarba("Makita", "verde", "metal sudat", (short)1600, (byte)10, "cablu", "manual", (byte)10, "taiere", "iarba");
        MasinaTunsIarba masinaPeBenzina = new MasinaTunsIarba("Ruris", "rosu", "metal", (short)1600, (byte)8, "cablu", "auto", (byte)15, "curatare", "iarba");
        MasinaTunsIarba masinaPeBenzinaHusqvarna = new MasinaTunsIarba("Husqvarna", "verde", "metal sudat", (short)1500, (byte)7, "benzina", "auto", (byte)25, "taiere", "iarba");
        MasinaTunsIarba masinaPeBaterii = new MasinaTunsIarba("Heinner","galben", "plastic", (short)1700, (byte)10, "benzina", "auto", (byte)30, "taiere", "iarba");
        MasinaTunsIarba masinaPeBateriiBosch = new MasinaTunsIarba("Bosch", "verde", "metal", (short)1500, (byte)8, "baterii", "manual", (byte)9, "taiere", "iarba");
        MasinaTunsIarba masinaPeBateriiRuris = new MasinaTunsIarba("Ruris", "galben", "metal", (short)1700, (byte)18, "baterii", "manual", (byte)8, "taiere", "iarba");
        MasinaTunsIarba masinaTuns = new MasinaTunsIarba(masinaElectrica);
        
        System.out.println("Masina de tuns iarba: " + masinaDeTuns);
        System.out.println("Masina de tuns iarba: " + masinaElectrica);
        System.out.println("Masina de tuns iarba: " + masinaTuns);
        
        
        ArrayList<MasinaTunsIarba> masiniTuns = new ArrayList();
        masiniTuns.add(masinaDeTuns);
        masiniTuns.add(masinaElectrica);
        masiniTuns.add(masinaElectricaBosch);
        masiniTuns.add(masinaElectricaMakita);
        masiniTuns.add(masinaPeBenzina);
        masiniTuns.add(masinaPeBenzinaHusqvarna);
        masiniTuns.add(masinaPeBaterii);
        masiniTuns.add(masinaPeBateriiBosch);
        masiniTuns.add(masinaPeBateriiRuris);
        masiniTuns.add(masinaTuns);
        
        System.out.println("\n");

        for(MasinaTunsIarba masina : masiniTuns){
            if (masina.getFirma().equals("Ruris") && masina.getPutere() > 1500){
                System.out.println("Masina de tuns iarba: " + masina);
            }
        }
      
        Motosapa motosapaPeBenzina = new Motosapa();
        Motosapa motosapaElectrica = new Motosapa("Ruris", "benzina", "plastic", "negru", (short)20, "baterii", "automat",(byte) 20, "sapa", "pamant");
        Motosapa motosapaHonda = new Motosapa("Honda", "benzina", "plastic", "rosu", (short)20, "electric", "manual", (byte)17, "cultivare", "pamant");
        Motosapa motosapaHusqvarna = new Motosapa("Husqvarna", "benzina", "metal", "portocaliu", (short)30, "electric", "semi-auto", (byte)66, "cultivare", "pamant");
        Motosapa motosapaRuris = new Motosapa("Ruris", "benzina", "metal", "gri", (short)20, "electric", "semi-auto", (byte)54, "cultivare", "pamant");
        Motosapa motosapaTexas = new Motosapa("Texas", "benzina", "metal", "negru", (short)15, "electric", "auto", (byte)40, "cultivare", "pamant");
        Motosapa motosapaProGarden = new Motosapa("ProGarden", "benzina", "metal", "portocaliu", (short)18, "electric", "semi-auto", (byte)55, "cultivare", "pamant");
        Motosapa motosapaGardenia = new Motosapa("Gardenia", "benzina", "metal", "verde", (short)30, "electric", "auto", (byte)60, "cultivare", "pamant");
        Motosapa motosapaDeWalt = new Motosapa("DeWalt", "benzina", "metal", "galben", (short)30, "electric", "auto", (byte)38, "cultivare", "pamant");
        Motosapa motosapaBenzina = new Motosapa(motosapaElectrica);
        
        System.out.println("\nMotosapa: " + motosapaPeBenzina);
        System.out.println("Motosapa: " + motosapaElectrica);
        System.out.println("Motosapa: " + motosapaBenzina);
        
        System.out.println("\n");
        
        
        ArrayList<Motosapa> motosape = new ArrayList();
        motosape.add(motosapaPeBenzina);
        motosape.add(motosapaElectrica);
        motosape.add(motosapaHonda);
        motosape.add(motosapaHusqvarna);
        motosape.add(motosapaRuris);
        motosape.add(motosapaTexas);
        motosape.add(motosapaProGarden);
        motosape.add(motosapaGardenia);
        motosape.add(motosapaDeWalt);
        motosape.add(motosapaBenzina);
        
        for (Motosapa motosapa : motosape){
            if (motosapa.getMaterialConstructie().equals("metal") && motosapa.getAdancimeLucru() > 20){
                System.out.println("Motosapa: " + motosapa);
            }
        }
    
        AparatSpalareCuPresiune apar=new AparatSpalareCuPresiune();
        AparatSpalareCuPresiune lavor=new AparatSpalareCuPresiune(135,"electric","mare","baterii","rosu","Lavor","manual",(byte)15,"clatire","masini");
        AparatSpalareCuPresiune honda=new AparatSpalareCuPresiune(160,"benzina","silentios","albastru","Honda","cablu","manual",(byte)20,"curatare","pereti exteriori");
        AparatSpalareCuPresiune bosch=new AparatSpalareCuPresiune(200,"motorina","usor redus","verde","Bosch","energie solara","manual",(byte)30,"curatare intensa","pavaje");
        AparatSpalareCuPresiune boss=new AparatSpalareCuPresiune(250,"energie electrica","redus","roz","Boss","cablu","manual",(byte)27,"curatare","suprafete exterioare");
        AparatSpalareCuPresiune philips=new AparatSpalareCuPresiune(180,"benzina","mare","galben","Philips","baterii","manual",(byte)14,"clatire","motociclete");
        AparatSpalareCuPresiune beko=new AparatSpalareCuPresiune(140,"motorina","redus","portocaliu","Beko","energie solara","manual",(byte)15,"clatire usoara","pereti");
        AparatSpalareCuPresiune sony=new AparatSpalareCuPresiune(210,"electric","puternic","negru","Sony","baterii","manual",(byte)35,"curatare intensa","pavaje");
        AparatSpalareCuPresiune dyson=new AparatSpalareCuPresiune(175,"motorina","redus","alb","Dyson","energie solara","manual",(byte)20,"curatare usoara","pereti exteriori");
        AparatSpalareCuPresiune lg=new AparatSpalareCuPresiune(150,"energie electrica","usor redus","mov","LG","cablu","manual",(byte)30,"clatire","suprafete exterioare");
        AparatSpalareCuPresiune samsung=new AparatSpalareCuPresiune(265,"motorina","usor redus","maro","Samsung","cablu","manual",(byte)32,"curatare intensa","pavaje");
        AparatSpalareCuPresiune copieAparatSpalarePresiune=new AparatSpalareCuPresiune(honda);
        
        System.out.println("\nAparat de spalare cu presiune de uz casnic: "+ lavor);
        System.out.println("Aparat de spalare cu presiune semi-profesionale: "+ honda);
        System.out.println("Aparat de spalare cu presiune profesionale: "+bosch);
        System.out.println("Copie aparat spalare cu presiune: "+copieAparatSpalarePresiune);
        
        System.out.println("\n");
        
        ArrayList<AparatSpalareCuPresiune> aparateSpalarePresiune=new ArrayList();
        aparateSpalarePresiune.add(lg);
        aparateSpalarePresiune.add(samsung);
        aparateSpalarePresiune.add(dyson);
        aparateSpalarePresiune.add(sony);
        aparateSpalarePresiune.add(lavor);
        aparateSpalarePresiune.add(honda);
        aparateSpalarePresiune.add(bosch);
        aparateSpalarePresiune.add(boss);
        aparateSpalarePresiune.add(philips);
        aparateSpalarePresiune.add(beko);
        
        for(AparatSpalareCuPresiune apart:aparateSpalarePresiune)
           if(apart.getTipMotor().equals("motorina") && apart.getPutereMaxima()>200){
               System.out.println("Aparate cu presiune care indeplinesc conditia: "+apart);
           }
         System.out.println("\n");
         
        Suflanta suf=new Suflanta();
        Suflanta electrice=new Suflanta(100,24,"Bosch","alb",452,"electrica","manuala",(byte)13,"indepartarea mizeriilor","interior garaj"); 
        Suflanta peAcumulator=new Suflanta(120,48,"Greenworks","negru",620,"acumulator","manuala",(byte)15,"aspirare","terase si gradini");
        Suflanta peBenzina=new Suflanta(160,72,"Echo","galben",220,"benzina","manuala",(byte)20,"indepartarea mizeriilor","aleii si curti"); 
        Suflanta lenovo=new Suflanta(130,45,"Lenovo","mov",255,"motorina","manuala",(byte)10,"indepartarea mizeriilor mici","interior");
        Suflanta panasonic=new Suflanta(160,52,"Panasonic","roz",356,"benzina","manuala",(byte)25,"aspirare","terase");
        Suflanta nvidia=new Suflanta(120,44,"NVidia","portocaliu",198,"benzina","manuala",(byte)20,"indepartarea mizeriilor","aleii si curti"); 
        Suflanta yazaki=new Suflanta(158,47,"Yazaki","rosu",145,"motorina","manuala",(byte)18,"aspirare","gradini");
        Suflanta hiunda=new Suflanta(110,56,"Hiunda","albastru",564,"benzina","manuala",(byte)25,"indepartarea mizeriilor","curti"); 
        Suflanta kawasaki=new Suflanta(170,82,"Kawasaki","verde",349,"motorina","manuala",(byte)26,"aspirare","interior garaj");
        Suflanta sakura=new Suflanta(145,68,"Sakura","maro",260,"benzina","manuala",(byte)23,"indepartarea frunzisiului","aleii"); 
        Suflanta copieSuflanta=new Suflanta(peBenzina);
        
        System.out.println("\nSuflante electriea: "+ electrice);
        System.out.println("Suflante cu acumulator: "+ peAcumulator);
        System.out.println("Suflante pe benzina: "+peBenzina);
        System.out.println("Copie suflanta: "+copieSuflanta);   
        
        System.out.println("\n");
        
        ArrayList<Suflanta> suflante=new ArrayList();
        suflante.add(electrice);
        suflante.add(peAcumulator);
        suflante.add(peBenzina);
        suflante.add(lenovo);
        suflante.add(panasonic);
        suflante.add(nvidia);
        suflante.add(yazaki);
        suflante.add(hiunda);
        suflante.add(kawasaki);
        suflante.add(sakura);
        
        for(Suflanta sufl:suflante)
            if(sufl.getDurataFunctionare()!=56 && sufl.getFirma().equals("Yazaki")){
                System.out.println("Suflante care indeplinesc conditia: "+sufl);
            }
         System.out.println("\n");
        
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
        Drujbă drujba1 = new Drujbă("Benzina", "Automat", (byte)6, "Taiere", "Busteni", 40, "Benzina", "Stihl",55,1);
        Drujbă drujba2 = new Drujbă("Cablu", "Semi-Automat", (byte)7, "Taiere", "Lemn", 60,"Electric", "Husqvarna",18,3);
        
        System.out.println("\nInstanțe Drujba:");
        System.out.println(drujba1);
        System.out.println(drujba2);
        
        // instanțe din clasa Trimmer
        Trimmer trimmer1 = new Trimmer("Baterii", "Automat", (byte)1, "Tuns iarba", "Iarba", true, 60, "Philips", 18,2000);
        Trimmer trimmer2 = new Trimmer("Cablu", "Manual", (byte)2, "Tuns iarba", "Iarba", false, 0, "Black & Decker", 53, 1000);
        
        System.out.println("\nInstante Trimmer:");
        System.out.println(trimmer1);
        System.out.println(trimmer2);
        
        //drujba
        Drujbă drujbaStandard = new Drujbă();
        Drujbă drujbaElectrica = new Drujbă("electric", "manual", (byte)4, "taiere", "lemn", 35, "compacta", "Bosch", 20, 200);
        Drujbă drujbaBenzina = new Drujbă("benzina", "semimanual", (byte)8, "taiere", "lemn gros", 50, "profesionala", "Husqvarna", 25, 500);
        Drujbă drujbaUsorDeFolosit = new Drujbă("electric", "manual", (byte)3, "taiere", "ramuri mici", 30, "portabila", "Makita", 15, 150);
        Drujbă drujbaPortabila = new Drujbă("baterie", "manual", (byte)5, "taiere", "lemn de foc", 40, "ușoara", "DeWalt", 18, 100);
        Drujbă drujbaGreutateRedusa = new Drujbă("baterie", "manual", (byte)4, "taiere", "lemn subtire", 28, "compacta", "Black+Decker", 12, 120);
        Drujbă drujbaMultifunctionala = new Drujbă("benzina", "semimanual", (byte)6, "taiere", "lemn și ramuri mari", 45, "multifunctionala", "Stihl", 22, 400);
        Drujbă drujbaCopiata = new Drujbă(drujbaElectrica);
        Drujbă drujbaProfesionala = new Drujbă("benzina", "semimanual", (byte)10, "taiere", "lemn profesional", 60, "greutate mare", "Echo", 28, 600);
        Drujbă drujbaCompacta = new Drujbă("electric", "manual", (byte)2, "taiere", "ramuri mici", 25, "mică", "Ryobi", 10, 80);
        //pornire si oprire pt cateva obj
        drujbaElectrica.pornesteAparat();
        drujbaElectrica.opresteAparat();
        System.out.println("\nDrujba electrică: " + drujbaElectrica);
        
        drujbaBenzina.pornesteAparat();
        drujbaBenzina.opresteAparat();
        System.out.println("Drujba pe benzină: " + drujbaBenzina);

        drujbaPortabila.pornesteAparat();
        drujbaPortabila.opresteAparat();
        System.out.println("Drujba portabilă: " + drujbaPortabila);
        
        ArrayList<Drujbă> drujbe = new ArrayList<>();
        drujbe.add(new Drujbă("electric", "manual", (byte)4, "taiere", "lemn", 35, "compactă", "Bosch", 20, 200));
        drujbe.add(new Drujbă("benzina", "semimanual", (byte)8, "taiere", "lemn gros", 50, "profesională", "Husqvarna", 25, 500));
        drujbe.add(new Drujbă("baterie", "manual", (byte)3, "taiere", "ramuri mici", 30, "portabilă", "Makita", 15, 150));
        drujbe.add(new Drujbă("benzina", "manual", (byte)6, "taiere", "lemn mediu", 40, "standard", "Stihl", 22, 400));
        drujbe.add(new Drujbă("electric", "semimanual", (byte)5, "taiere", "lemn subțire", 25, "compactă", "Ryobi", 18, 300));
        drujbe.add(new Drujbă("baterie", "automat", (byte)4, "taiere", "ramuri mici", 20, "portabilă", "Dewalt", 16, 200));
        drujbe.add(new Drujbă("benzina", "manual", (byte)10, "taiere", "lemn dur", 55, "industrială", "Jonsered", 30, 600));
        drujbe.add(new Drujbă("electric", "manual", (byte)3, "taiere", "scânduri", 30, "de atelier", "Black+Decker", 17, 250));
        drujbe.add(new Drujbă("baterie", "manual", (byte)2, "taiere", "lemn mic", 15, "ușoară", "Einhell", 12, 150));
        drujbe.add(new Drujbă("benzina", "semimanual", (byte)7, "taiere", "lemn gros", 45, "avansată", "Echo", 24, 450));

       //Afișare drujba
        for (Drujbă dr : drujbe) {
            //
            if(dr.getCapacitateRezervor()>20 && dr.getVitezaLantului()>200){
            System.out.println("Drujba:"+ dr);
            //
            }
        }
        System.out.println("\n");
        
        
        //Trimmer
        Trimmer trimmerStandard = new Trimmer();
        Trimmer trimmerElectric = new Trimmer("baterie", "automat", (byte)3, "tundere", "iarbă", true, 60, "Bosch", 18, 150);
        Trimmer trimmerCuAutonomieMare = new Trimmer("baterie", "automat", (byte)4, "tundere", "iarbă", true, 90, "Makita", 20, 200);
        Trimmer trimmerEconomic = new Trimmer("electric", "manual", (byte)2, "tundere", "iarbă fină", true, 45, "Ryobi", 10, 80);
        Trimmer trimmerDeLux = new Trimmer("baterie", "automat", (byte)5, "tundere", "iarbă", true, 120, "Stihl", 25, 300);
        Trimmer trimmerProfesional = new Trimmer("benzina", "manual", (byte)6, "tundere", "iarbă groasă", false, 0, "Husqvarna", 0, 400);
        Trimmer trimmerPortabil = new Trimmer("baterie", "manual", (byte)2, "tundere", "iarbă subțire", true, 50, "Einhell", 15, 100);
        Trimmer trimmerDurabil = new Trimmer("electric", "manual", (byte)3, "tundere", "iarbă", true, 60, "DeWalt", 18, 200);
        Trimmer trimmerAvansat = new Trimmer("baterie", "automat", (byte)5, "tundere", "iarbă mare", true, 100, "Echo", 22, 250);
        Trimmer trimmerCopiat = new Trimmer(trimmerElectric);

        //pornire si oprire pt cateva obj
        trimmerElectric.pornesteAparat();
        trimmerElectric.opresteAparat();
        System.out.println("\nTrimmer electric: " + trimmerElectric);

        trimmerDeLux.pornesteAparat();
        trimmerDeLux.opresteAparat();
        System.out.println("Trimmer de lux: " + trimmerDeLux);

        trimmerProfesional.pornesteAparat();
        trimmerProfesional.opresteAparat();
        System.out.println("Trimmer profesional: " + trimmerProfesional);
        
        //vector de tip trimmer
        ArrayList<Trimmer> trimmere = new ArrayList<>();
        trimmere.add(new Trimmer("baterie", "automat", (byte)3, "tundere", "iarbă", true, 60, "Bosch", 18, 150));
        trimmere.add(new Trimmer("baterie", "automat", (byte)4, "tundere", "iarbă", true, 90, "Makita", 20, 200));
        trimmere.add(new Trimmer("electric", "manual", (byte)2, "tundere", "iarbă fină", true, 45, "Ryobi", 10, 80));
        trimmere.add(new Trimmer("baterie", "automat", (byte)5, "tundere", "iarbă", true, 120, "Stihl", 25, 300));
        trimmere.add(new Trimmer("benzina", "manual", (byte)6, "tundere", "iarbă groasă", false, 0, "Husqvarna", 0, 400));
        trimmere.add(new Trimmer("baterie", "manual", (byte)2, "tundere", "iarbă subțire", true, 50, "Einhell", 15, 100));
        trimmere.add(new Trimmer("electric", "manual", (byte)3, "tundere", "iarbă", true, 60, "DeWalt", 18, 200));
        trimmere.add(new Trimmer("baterie", "automat", (byte)5, "tundere", "iarbă mare", true, 100, "Echo", 22, 250));
        trimmere.add(new Trimmer("baterie", "automat", (byte)4, "tundere", "iarbă groasă", true, 90, "Black+Decker", 19, 190));
        trimmere.add(new Trimmer("electric", "manual", (byte)3, "tundere", "iarbă fină", true, 60, "Greenworks", 18, 175));
        
        //afisare 
        for (Trimmer tr : trimmere) {
            if (tr.getAutonomie() > 50 && tr.getCapacitateBaterie() > 15) {
            System.out.println("Trimmer: " + tr);
            }    
        }
        
        System.out.println("\n");
    }          
}
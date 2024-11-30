/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.proiectpoo;
import java.util.*;
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
        Aparat trimmer=new Aparat("baterie","manual",(byte)3,"taiere","iarba");
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
        
        ArrayList<Aparat> aparate=new ArrayList();
        aparate.add(aparatCuratatPardoseli);
        aparate.add(aparatCuratatGeamuri);
        aparate.add(aparatCuratatSticla);
        aparate.add(aparatTaiatLemne);
        aparate.add(aparatTaiatIarba);
        aparate.add(aparatDeSapat);
        aparate.add(aparatDeAspirat);
        aparate.add(aparatDeSuflat);
        aparate.add(trimmer);
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
          for(AparatCuratatPardoseli acp:aparateCuratatPardoseli){
              if(acp.getLungimeCablu() > 9 && acp.getFirma().equals("Lavor") ){
            System.out.println("Aparate de curatat pardoseli: " +acp);}}
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
        
         for(AparatCuratatGeamuri acg:aparateCuratatGeamuri){
             if(acg.getMaterialLamaPerie().equals("cauciuc") && acg.getAutonomie() >1 ){
            System.out.println("Aparate de curatat geamuri: " +acg);}}
         System.out.println("\n");
        
        
        
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

package idmanprogramı;

import java.util.Scanner;

public class Idmanprogramı {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("İdman programına hoşgeldiniz...");
        
        String idmanlar = "Geçerli idmanlar \n"
                          +"Burpee \n"
                          +"Situp \n"
                          +"Pushup \n"
                          +"Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun");
        
        System.out.println("Burpee sayısı:");
        int burpee = input.nextInt();
         
        System.out.println("Situp sayısı:");
        int situp = input.nextInt();
        
        System.out.println("Pushup sayısı:");
        int puhsup = input.nextInt();
        
        System.out.println("Squat sayısı:");
        int squat = input.nextInt();
        input.nextLine();
        
        idman idman = new idman(burpee,situp,puhsup,squat);
        System.out.println("İdmanınız başlıyor...");
        
        while(idman.idmanBittimi()==false){
            System.out.println("Hareket türü(Burpee,Situp,Pushup,Squat)");
            String tür = input.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız?");
            int terkar = input.nextInt();
            input.nextLine();
            idman.hareket_yap(tür, terkar);
            
        }
        
        
        
        
        
        
        
    }
    
}

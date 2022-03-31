package vucudkıtleındeksı;

import java.util.Scanner;

public class Vucudkıtleındeksı {
    public static void main(String[] args) {
   double boy,kılo;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz:");
    boy = input.nextDouble();
    Scanner input2 = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz:");
    kılo = input2.nextDouble();
    float VKI = (float)kılo / (float)(boy*boy);
        
        System.out.printf("Vücut kitle indeksiniz---> " + "%.2f ", VKI);
    if ( VKI <= 18.5 ) {
        System.out.println("ZAYIFSINIZ");
    }
    else if ( VKI <= 25 ) {
        System.out.println("NORMAL KİLODASINZ");
    }
    else if ( VKI <= 30 ) {
        System.out.println("FAZLA KİLOLUSUNUZ");
    }
    else {
        System.out.println("OBEZSİNİZ!!!");
    }
  
        
    
    }
    
}

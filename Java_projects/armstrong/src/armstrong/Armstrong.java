package armstrong;

import java.util.Scanner;

public class Armstrong {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Armstrong sayı kontorlü yapılacak sayıyı giriniz: ");
        int sayı = input.nextInt();
        System.out.println("Basamak sayısı:");
        int basamak_sayısı = input.nextInt();
        
        int gecici_sayı = sayı;
        int toplam = 0;
        
        do {
         int basamak_degeri = gecici_sayı & 10;
         gecici_sayı /= 10;
         
         toplam +=  Math.pow(basamak_degeri , basamak_sayısı);
         
            
            
        }while (gecici_sayı > 0);
       
        if (sayı == toplam) {
            
            System.out.println("BU SAYI ARMSTRONG SAYIDIR");
        } 
        else {
            System.out.println("BU SAYI ARMSTRONG SAYI DEĞİLDİR");
        }
                
       }    
    }
    

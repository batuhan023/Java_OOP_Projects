package baybladeprogramı;

import java.util.Scanner;

public class Baybladeprogramı {

    public static void main(String[] args) {
        
        System.out.println("Bayblade programına hoşgeldiniz..");
        System.out.println("Çıkışş için q ya basınız");
        Scanner Scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi Baylade türünü üretmek istiyorsunuz?");
            String işlem = Scanner.nextLine();
            if(işlem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }else{
                baybladefabrikası fabrika = new baybladefabrikası();
                bayblade bayblade = fabrika.beybladeUret(işlem);
                if (bayblade == null){
                    System.out.println("Lütfen geçerli bir bayblade türü giriniz");
                }else{
                    bayblade.BilgileriGöster();
                    bayblade.KutsalCanavarOrtayaÇıkar();
                    bayblade.saldır();
                }
            
                
            }
        }
        
        
    }
    
}


package linkledlist_sehir;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Linkledlist_sehir {
    
    public static void sehirleri_turla (LinkedList<String> sehirler){
        ListIterator<String>iterator= sehirler.listIterator();
        int islem;
        islemleri_bastır();
        
        Scanner scanner = new Scanner(System.in);
        if(!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor");
        }
        boolean çıkış = false;
        boolean ileri = true;
        
        while(!çıkış){
            System.out.println("Bir işlem seçiniz");
            islem = scanner.nextInt();
            
            switch(islem){
                case 0:
                    islemleri_bastır();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri =true;                  
                    }
                    if(iterator.hasNext()){
                        System.out.println("Şehre gidiliyor " + iterator.next());
                    }else{
                        System.out.println("Gidilecek şehir kalmadı");
                        ileri=true;
                    }
                    break;
                    
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("şehre gidiliyor " + iterator.previous());
                    }else{
                        System.out.println("Şehir turu başladı");
                    }
                    break;
                    
                case 3:
                    çıkış = true;
                    System.out.println("uygulamadan çıkılıyor...");
                    break;
            }
                
            
        }
    }
    
    public static void islemleri_bastır(){
        System.out.println("0 --> işlermleri görüntüle");
        System.out.println("1 --> bir sonraki şehre git");
        System.out.println("2 --> bir önceki şehre git");
        System.out.println("3 --> uygulamadan çık");
        
    }
    
    public static void main(String[] args) {
       
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");
        
        sehirleri_turla(sehirler);
        
        
        
        
    }
    
}

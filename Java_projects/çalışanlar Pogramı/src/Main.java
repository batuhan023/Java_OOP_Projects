
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
       /* yazılımcı yazılımcı1 = new yazılımcı("Batuhan","Yavuz",123,"java ve kodlin");
        yazılımcı1.bilgileriGöster(); */
        
       Scanner input = new Scanner(System.in);
       
        System.out.println("Çalışanlar programına hoşgeldiniz...");
        
        String işlemler = "İşlemler \n"
                +"1. Yazılımcı işlemleri \n"
               +"2. Yönetici işlemleri \n"
                +"Çıkış için q'ya basınız.";
        System.out.println("********************");
        System.out.println(işlemler);
        System.out.println("********************");
        
        while(true){
            System.out.println("İşlem seçiniz");
            String işlem = input.nextLine();
             if(işlem.equals("q")){
                 System.out.println("Programdan çıkılıyor...");
             break;
             }else if(işlem.equals("1")){
                 yazılımcı yazılımcı = new yazılımcı("Batuhan", "Yavuz",567,"Java");
                 String yazılımcı_işlem = "Format at \n"
                         +"Bilgileri göster\n"
                         +"Çıkış için q'ya basınız";
                 System.out.println(yazılımcı_işlem);
                 while(true){
                     System.out.println("İşlem seçiniz");
                     String y_işlem = input.nextLine();
                     if(y_işlem.equals("q")){
                         System.out.println("Programdan çıkılıyor...");
                         break;
                     }else if(y_işlem.equals("1")){
                         System.out.println("İşletim sistemi: ");
                         String işletim_sistemi = input.nextLine();
                         yazılımcı.formatAt(işletim_sistemi);
                     }else if(y_işlem.equals("2")){
                         yazılımcı.bilgileriGöster();
                     }else{
                         System.out.println("Geçersiz yazılımcı işlemi!");
                     }
                     
                     
                 }
             }else if(işlem.equals("2")){
                 yönetici yönetici = new yönetici("Serhat","Say",123,10);
                 String yönetici_işlemleri = "Yönetici işlemleri\n"
                         +"1.işlem Zam yap \n"
                         +"2.işlem Bilgileri Göster \n "
                         +"Çıkış içimn q'ya basınız.";
                 System.out.println(yönetici_işlemleri);
                 while(true){
                     System.out.println("İşlem seçiniz");
                     String y_işlemleri = input.nextLine();
                     if(y_işlemleri.equals("q")){
                         System.out.println("Yönetici işlemlerinden Çıkılıyor...");
                         break;
                     }else if(y_işlemleri.equals("1")){
                         System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz?");
                         int zam_miktarı = input.nextInt();
                         input.nextLine();
                         yönetici.zamYap(zam_miktarı);
                     }else if(y_işlemleri.equals("2")){
                         yönetici.bilgileriGöster();
                     }else{
                         System.out.println("Geçersiz işlem!");
                     }
                 }
                 
                     
             }else{
                 System.out.println("Geçersiz işlem!");
             }
        }
        
    }
    
}

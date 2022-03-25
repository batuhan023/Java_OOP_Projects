
package atmoop;

import java.util.Scanner;

public class atm {
    
    public void çalış(hesap hesap){
        login login = new login();
        Scanner input = new Scanner(System.in);
         
        System.out.println("Bankımıza hoşgeldiniz..");
        
        int giriş_hakkı = 3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else{
                System.out.println("Giriş başarısızı");
                giriş_hakkı -= 1;
                System.out.println("Kalan giriş hakkınız " + giriş_hakkı);
                
            }
            if(giriş_hakkı==0){
                System.out.println("Giriş hakkınız kalmamıştır!!");
                return;
            }
        }
        System.out.println("********************************");
        String işlemler = "1. bakiye görüntüleme \n"
                          +"2. işlem para yatırma \n"
                          +"3. işlem para çekme \n"
                          +"çıkış için q'ya basınız";
        System.out.println(işlemler);
        System.out.println("********************************");
        
        while(true){
            System.out.println("işlem seçiniz");
            String işlem = input.nextLine();
            
            if(işlem.equals("q")){
                System.out.println("progrmadan çıkılıyor...");
                break;
            }else if(işlem.equals("1")){
                System.out.println("Bakiyeniz " + hesap.getBakiye());
            }else if(işlem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı giriniz");
                int tutar = input.nextInt();
                input.nextLine();
                System.out.println("Hesabınıza " + tutar + " TL yatırılıyor");
                hesap.paraYatır(tutar);
                System.out.println("Yeni bakiyeniz " + hesap.getBakiye());
            }else if (işlem.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                int tutar = input.nextInt();
                input.nextLine();
                hesap.paraÇek(tutar);
                
            }else{
                System.out.println("Geçersiz işlem " + işlemler + " lütfen takrar seçiniz");
            }
        }
    }
    
}

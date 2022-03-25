
package atmoop;

import java.util.Scanner;

public class login {
    public boolean login (hesap hesap){
        Scanner input = new Scanner(System.in);
        String kullanıcı_adı;
        String parola;
            System.out.println("Kullanıcı Adı: ");
            kullanıcı_adı = input.nextLine();
            System.out.println("Parola: ");
            parola= input.nextLine();
            if(hesap.getKullanıcı_adı().equals(kullanıcı_adı)&&hesap.getParola().equals(parola)){
                return true;
            }else{
                return false;
            }
            
        
        
    }
    
}

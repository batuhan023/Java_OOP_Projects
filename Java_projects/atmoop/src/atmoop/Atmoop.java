
package atmoop;

public class Atmoop {

    public static void main(String[] args) {
        atm atm = new atm();
        hesap hesap = new hesap("batuhan","1234",1000);
        
        atm.çalış(hesap);
        System.out.println("Programdan çıkılıyor..");
    }
    
}

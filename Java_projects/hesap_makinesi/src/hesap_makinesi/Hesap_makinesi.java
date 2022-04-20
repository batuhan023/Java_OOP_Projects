
package hesap_makinesi;

import java.util.Scanner;

public class Hesap_makinesi {


    public static int toplama (int a, int b){
        
        int sonuç;
        sonuç = (a+b);
        return (sonuç);  
    }
    public static int toplama (int a , int b, int c){
        int sonuç;
        sonuç = a+b+c;
                return(sonuç);
    }
    public static int çıkarma (int a , int b){
        int sonuç;
        sonuç = a - b ;
        return (sonuç);
        }
    public static int çarpma (int a, int b){
        int sonuç;
        sonuç = a*b;
        return (sonuç);
        }
    public static int çarpma (int a, int b , int c){
        int sonuç;
        sonuç = a*b*c;
        return (sonuç);
        }
    public static double bölme (double a, double b){
        double sonuç;
        sonuç = a/b;
        return (sonuç);
        }
    
    
    public static void main(String[] args) {
        
        
        String işlemler = "1. işlem toplama \n"
                        + "2. işlem çıkarma \n"
                        + "3. işlem çarpma \n"
                        + "4. işlem bölme \n"
                        + "q programdan çık\n";
        System.out.println("-----------------------------");
        System.out.println(işlemler);
        System.out.println("-----------------------------");        
        
        while (true) {
            System.out.println("Lütfen yapmk istediğiniz işlemi seçiniz.");
            Scanner input = new Scanner(System.in);
            
            String işlem = input.nextLine();
            if (işlem.equals("1")){
                System.out.println("Kaç sayıyı toplamak istiyrsunuz?");
                int kaç_sayı = input.nextInt();
                if (kaç_sayı == 2){
                    System.out.println("Toplamak istediğiniz birinci sayı:");
                    int sayı1 = input.nextInt();
                    System.out.println("Toplamak istediğiniz ikinci sayı:");
                    int sayı2 = input.nextInt();
                    
                    System.out.println("Bu iki sayının toplamı= " + toplama(sayı1,sayı2));
                    }
                else if (kaç_sayı ==3){
                    System.out.println("Toplamak istediğiniz birinci sayı:");
                    int sayı1 = input.nextInt();
                    System.out.println("Toplamak istediğiniz ikinci sayı:");
                    int sayı2 = input.nextInt();
                    System.out.println("Toplamak istediğiniz üçüncü sayıyı giriniz:");
                    int sayı3 = input.nextInt();
                    
                    System.out.println("Bu üç sayının toplamaı= " + toplama(sayı1,sayı2,sayı3));
                }
                else {
                    System.out.println("Bu cihaz iki ya da üç sayı toplayabilmektedir");
                }
            } else if (işlem.equals("2")){
                System.out.println("Çıkarma işlemi yapmak istediğiniz birinci sayı: ");
                int sayı1 = input.nextInt();
                System.out.println("Çıkarma işlemi yapmak istediğiniz ikinci sayı: ");
                int sayı2 = input.nextInt();
                System.out.println("Bu iki sayının sonucu= " + çıkarma(sayı1,sayı2));
              
        }
            else if (işlem.equals("3")){
                
                System.out.println("Kaç sayıyı çarpmak istiyorsunuz?");
                int kaç_sayı = input.nextInt();
                if (kaç_sayı == 2){
                    System.out.println("Çarpmak istediğiniz birinci sayı:");
                    int sayı1 = input.nextInt();
                    System.out.println("Çarpmak istediğiniz ikinci sayı:");
                    int sayı2 = input.nextInt();
                    
                    System.out.println("Bu iki sayının çarpımı= " + çarpma(sayı1,sayı2));
                    }
                else if (kaç_sayı ==3){
                    System.out.println("Çarpmak istediğiniz birinci sayı:");
                    int sayı1 = input.nextInt();
                    System.out.println("Çarpmak istediğiniz ikinci sayı:");
                    int sayı2 = input.nextInt();
                    System.out.println("Çarpmak istediğiniz üçüncü sayıyı giriniz:");
                    int sayı3 = input.nextInt();
                    
                    System.out.println("Bu üç sayının çarpımı= " + çarpma(sayı1,sayı2,sayı3));
                }
                else {
                    System.out.println("Bu cihaz iki ya da üç sayı toplayabilmektedir");
            }
            }
            else if (işlem.equals("4")) {
                System.out.println("Bölme işlemi yapmak istediğiniz birinci sayı: ");
                double sayı1 = input.nextInt();
                System.out.println("Bölme işlemi yapmak istediğiniz ikinci sayı: ");
                double sayı2 = input.nextInt();
                System.out.println("Bu iki sayının bölümü= " + bölme(sayı1,sayı2));
                
                
            }
            else if (işlem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else {
                System.out.println("Geçersiz işlem!!!");
            }
    
    
    
        }
    }
}


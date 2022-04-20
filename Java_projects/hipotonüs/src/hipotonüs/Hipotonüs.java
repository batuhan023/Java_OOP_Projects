package hipotonüs;
import java.util.Scanner;
public class Hipotonüs {
public static void main(String[] args) {
    float kenar1,kenar2;
    double hipotenüs;
        Scanner input1 = new Scanner(System.in);
        System.out.println("LÜTFEN AMINA KODUMUN TOPU ÜÇGENİN BİR KENAR UZUNŞUĞUNU GİR");
        kenar1 = input1.nextFloat();
        Scanner input2 = new Scanner(System.in);
        System.out.println("LÜTFEN AMINA KODUMUN TOPU ÜÇGENİN DİĞER KENARINI GİR");
        kenar2 = input2.nextFloat();
        hipotenüs = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("TOP HERİF YAZDIĞIN DEĞERLERE GÖRE HİPOTENÜS UZUNLUĞUN: " + hipotenüs);
    }
    
}

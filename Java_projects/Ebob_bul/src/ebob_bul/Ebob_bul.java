package ebob_bul;

import java.util.Scanner;

public class Ebob_bul {

  
    public static void main(String[] args) {
        System.out.println("GİVE TWO NUMBER FOR FİND THE EBOB");
        Scanner input = new Scanner(System.in);
      int number1 = input.nextInt();
      int number2 = input.nextInt();
        System.out.println("THESE TWO NUMBERS EBOB İS " + fınd_ebob(number1 , number2) );
    }
    
       public static int fınd_ebob (int a, int b){
           int ebob = 1; 
           for (int i=1 ; i<a || i<b ; i++ ){
               if (a % i == 0 && b % i == 0){
                   ebob=i;
               }
           }return ebob;
}
    
}
   
 
package calculate_min;

import java.util.Scanner;

public class Calculate_min {

    public static void main(String[] args) {
        System.out.println("GİVE SECONDS FOR CALCULATE ");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        hm(seconds);
    }
    
    public static void hm (int a){
       int hours = 0;
       int min = 0 ;
       while (a > 3600){
        a = a-3600;
        hours++;
       }
       while (a > 60){
        a = a -60 ;
        min++;
       }
        if(hours>9){
            System.out.print(hours + ":" );
        } else {
             System.out.print("0" + hours + ":" );
        }
        if(min>9){
            System.out.print(min + ":" );
        } else {
             System.out.print("0" + min + ":" );
        }
        if(a>9){
            System.out.print(a + " \n");
        } else {
             System.out.print("0" + a + "\n" );
        }
    }
    
   
}

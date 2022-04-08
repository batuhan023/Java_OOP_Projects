package find_ekok;

import java.util.Scanner;

public class Find_ekok {

    public static void main(String[] args) {
        System.out.println("PLESASE WRİTE TWO NUMBERS FOR FİND THE EKOK");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("THE EKOK OF THESE TWO NUMBERS İS " + findekok(number1,number2) );
    }
    public static int findekok (int a, int b){
    int ekok = a*b;
        for (int ek=a*b ; ek>a || ek>b ; ek-- ){
           if (ek % a ==0 && ek % b ==0){
               ekok=ek;
           } 
        
    }return ekok;
    }
}

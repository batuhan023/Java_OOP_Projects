package ısmıterstenyazma;

import java.util.Scanner;

public class IsmıTerstenYazma {     
    public static void main(String[] args) {
        
    String isim;
    Scanner input = new Scanner(System.in);
        System.out.println("Rica etsem bir isim girer misin güzellik :)");
    isim = input.nextLine();
        System.out.print("İsmin tersten yazılışı şu şekilde : " );
    for(int i=isim.length()-1 ; i>=0 ; i--){
        System.out.print(isim.charAt(i) + " ");
    }
    }
    
}

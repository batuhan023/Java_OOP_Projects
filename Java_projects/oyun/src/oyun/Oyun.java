// Batuhan Yavuz 190316023

package oyun;
    
import java.util.Scanner;

public class Oyun {
 
    public static void main(String[] args) {
        RGenerator R1 = new RGenerator();
        Scanner input = new Scanner(System.in);
        String commands = "for play-p \n"
                          +"for quit-q";
        System.out.println("--------------------");
        System.out.println(commands);
        System.out.println("--------------------");
        
        while(true){
        
            System.out.println("Play or quit?");
            String command = input.nextLine();
            R1.changeValue();
          if (command.equals("q")){
                break;
                
          }else if (command.equals("p")){
                
            System.out.println("Enter a num for user1 guess.");
            int user1Guess = input.nextInt();
            System.out.println("Enter a num for user2 guess.");
            int user2Guess = input.nextInt();
        
            System.out.println("Random genereted number is " + R1.getValue());
            System.out.println("User1 guess is : " + user1Guess);
            System.out.println("User2 guess is : " + user2Guess);
        
            int difference1 = Math.abs(user1Guess-R1.getValue());
            int difference2 = Math.abs(user2Guess-R1.getValue());
        
            if(difference1 > difference2){
            System.out.println("User2 won");
            }else if(difference2>difference1){
            System.out.println("User1 won");
            }else{
            System.out.println("Nobody won.");
            }
        
          }else if (command.equals("")){
          }else{    
            
            System.out.println("Invalid command!!");  
            }
        }
    }
    
}

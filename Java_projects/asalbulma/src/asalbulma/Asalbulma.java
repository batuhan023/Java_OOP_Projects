
package asalbulma;

public class Asalbulma {

    public static boolean asalkontrol (int sayı){
        
        for (int i=2 ; i < sayı ; i++){
             if ( sayı % i == 0){
                 return false;
             }
            
        }
        return true;
        
        
    }
   
    public static void main(String[] args) {
        
        for (int i = 2 ; i < 1000 ; i++){
          if ( asalkontrol(i)){
           System.out.println(i);   
          }
            
        }
        
        
    }
    
}

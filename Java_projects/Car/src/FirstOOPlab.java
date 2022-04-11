public class FirstOOPlab {
 
public static void main (String args[]){
    
    NewClass car1 = new NewClass();
    car1.isActive = true;
    System.out.println("");
    NewClass car2 = new NewClass("blue");
    System.out.println("");
    NewClass car3 =new NewClass(100 , 1.5 , 130 , "red" ,"Ford", "09 a 09" , true);
    System.out.println("");
    car3.gas(3);
    car3.breaks(3);
    System.out.println("");
    car3.writeAttributes();
}
}

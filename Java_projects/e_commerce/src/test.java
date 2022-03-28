public class test {
     public static void main(String[] args){
         // I've tested methods and other classes in this class
       user batuhan = new user("batu","batuhan","yavuz","july","abc123","batuhan@","aydın","manisa");
       creditCards ziraat = new creditCards(56789, batuhan ,111,"2030 july");
       product kitap = new product("Az Kitabı","white","books",10,0.3,"You shoul read!!");
       product pc = new product("monster","black","Pc",3,2.5,"It is a mosnter!!");
       product oyuncak = new product("super car","red","toys",0,0.5,"fastest car!!");
    
         System.out.println("********************");
         batuhan.addFavourite(pc);
         order o1 = new order(batuhan,kitap,ziraat);
         order o2 = new order(batuhan,oyuncak,ziraat);
         System.out.println("********************");
         batuhan.wtiteOrderedProducts();
         System.out.println("********************");
         batuhan.wtiteFavouriteProducts();
       
     }
}

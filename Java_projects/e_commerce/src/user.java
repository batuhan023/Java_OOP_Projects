
import java.util.ArrayList;
//I created a user class.
public class user {
    private String userName;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String homeAddress;
    private String workAddress;
    private ArrayList<product> orderedProducts;
    private ArrayList<product> favouriteProducts;
    private creditCards creditCard;

    public user(String userName, String name, String surname, String dateOfBirth, String password, String email, String homeAddress, String workAddress) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.orderedProducts = new ArrayList<product>();
        this.favouriteProducts = new ArrayList<product>();
        this.creditCard = creditCard;
    }
       
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public ArrayList<product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(ArrayList<product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public ArrayList<product> getFavouriteProducts() {
        return favouriteProducts;
    }

    public void setFavouriteProducts(ArrayList<product> favouriteProducts) {
        this.favouriteProducts = favouriteProducts;
    }

    public creditCards getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(creditCards creditCard) {
        this.creditCard = creditCard;
    }
    // This method add product to orederProduct ArrayList
    public void addOrdered(product a){
         this.orderedProducts.add(a);
        
    }
    // This method add product to favouriteProduct ArrayList
    public void addFavourite (product a){
        this.favouriteProducts.add(a);
        
    }
    // This method write orderProducts ArrayList
    public void wtiteOrderedProducts (){
        System.out.println("Ordered products are:");
        for(int i =0 ; i<this.orderedProducts.size();i++){
            System.out.println(this.orderedProducts.get(i).getName());
        }
    }
    // This method write favouriteProducts ArrayList
     public void wtiteFavouriteProducts (){
         System.out.println("Favourite products are: ");
         for(int i =0 ; i<this.favouriteProducts.size();i++){
            System.out.println(this.favouriteProducts.get(i).getName());
        }
    }
 
    

}

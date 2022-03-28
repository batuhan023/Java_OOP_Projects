//I created a product class
public class product {
    private String name;
    private String color;
    private String cataegory;
    private int stock;
    private double weight;
    private String description;

    public product(String name, String color, String cataegory, int stock, double weight, String description) {
        this.name = name;
        this.color = color;
        this.cataegory = cataegory;
        this.stock = stock;
        this.weight = weight;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCataegory() {
        return cataegory;
    }

    public void setCataegory(String cataegory) {
        this.cataegory = cataegory;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // This method controls the stock count.
    public boolean productControl(){
        if(this.stock>0){
          this.stock -= 1;
          return true; 
        }        
        else{
            System.out.println("We don't have enough stock..");
            return false;
        }
    }
}

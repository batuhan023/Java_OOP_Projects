public class NewClass {

public double speed;
public double engineVolume;
public double weight;
public String carColor;
public String carPlake;
public String carMark;
public boolean isActive;
public double [] position = new double [2];
public double [] dimension = new double [3];

 public NewClass(double speed, double engineVolume, double weight, String carColor, String carPlake, String carMark, boolean isActive) {
        this.speed = speed;
        this.engineVolume = engineVolume;
        this.weight = weight;
        this.carColor = carColor;
        this.carPlake = carPlake;
        this.carMark = carMark;
        this.isActive = isActive;
        writeAttributes();
    }

public NewClass(){
this.speed = 50;
this.engineVolume = 1.6;
this.weight = 120;
this.carColor= "yellow";
this.carMark = "Renault";
this.carPlake = "45 abc 45";
writeAttributes();
}
public NewClass(String carCoolor){
  this.carColor=carCoolor;
writeAttributes();  
}

public void writeAttributes(){
    System.out.println("Car speed is " + this.speed); 
    System.out.println("Car engine volume is " + this.engineVolume);
    System.out.println("Car weight is " + this.weight);
    System.out.println("Car carColor is " + this.carColor);
    System.out.println("Car carMark is " + this.carMark);
    System.out.println("Car carPlake is " + this.carPlake);
}
public void turnOnCar(){
    if(!isActive){
    this.isActive = true;
    } else {
        System.out.println("Car is already active!");
    }
}
public void turnOffCar(){
    if(isActive){
        this.isActive = false;
    }
    else{
        System.out.println("Car is already deactive!");
    }
}
public void gas(int count){
    if(isActive)
        for(int i=0 ; i <count ; i++){
        this.speed += (this.speed/10);
}
}
public void breaks(int count){
    if(isActive)
        for(int i=0 ; i < count ; i++ ){
        this.speed -= (this.speed/5);
    if(this.speed<0){
        this.speed=0;
        this.isActive = false;
    }
    }
        
}
}

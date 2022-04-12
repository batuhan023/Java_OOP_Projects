
package composotion;

public class monitöt {
    private String model;
    private String uretici;
    private String boyut;
    private resolution resolution;
    
    public monitöt(String model,String uretici,String boyut, resolution resolution ){
        
    }
    public void monitörü_kapat(){
        System.out.println("Monitör kapatılıyor...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public resolution getResolution() {
        return resolution;
    }

    public void setResolution(resolution resolution) {
        this.resolution = resolution;
    }
}

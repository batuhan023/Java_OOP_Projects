
package composotion;

public class bilgisayar {
    private monitöt monitör;
    private kasa kasa;
    private anakart anakart;
    public bilgisayar(monitöt monitör, kasa kasa, anakart anakart){
        this.monitör=monitör;
        this.kasa=kasa;
        this.anakart=anakart;
        
    }

    
    public monitöt getMonitör() {
        return monitör;
    }


    public void setMonitör(monitöt monitör) {
        this.monitör = monitör;
    }


    public kasa getKasa() {
        return kasa;
    }


    public void setKasa(kasa kasa) {
        this.kasa = kasa;
    }


    public anakart getAnakart() {
        return anakart;
    }


    public void setAnakart(anakart anakart) {
        this.anakart = anakart;
    }
    
}

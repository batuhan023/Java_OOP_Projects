package composotion;
public class anakart {
    private String model;
    private String uretici;
    private int  yuva_sayısı;
    private String işletim_sistemi;
    
    public anakart (String model, String uretici, int yuva_sayısı , String işletim_sistemi){
        this.model=model;
        this.uretici=uretici;
        this.yuva_sayısı=yuva_sayısı;
        this.işletim_sistemi=işletim_sistemi;
        
    }
    public void işletim_sistemi_yükle(String işletim_sistemi){
        this.işletim_sistemi=işletim_sistemi;
        System.out.println("İŞLETİM SİSTEMİ YÜKLENDİ:" + işletim_sistemi);
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

    public int getYuva_sayısı() {
        return yuva_sayısı;
    }

    public void setYuva_sayısı(int yuva_sayısı) {
        this.yuva_sayısı = yuva_sayısı;
    }

    public String getIşletim_sistemi() {
        return işletim_sistemi;
    }

    public void setIşletim_sistemi(String işletim_sistemi) {
        this.işletim_sistemi = işletim_sistemi;
    }
}

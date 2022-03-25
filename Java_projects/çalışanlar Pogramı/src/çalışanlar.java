
public class çalışanlar {
    private String isim;
    private String soyisim;
    private int id;
    
     public çalışanlar(String isim,String soyisim, int id){
         this.isim = isim;
         this.soyisim = soyisim;
         this.id=id;
     }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getId() {
        return id;
    }
    public void bilgileriGöster(){
        System.out.println("-Çalışan Bilgileri-");
        System.out.println("Çalışanın ismi: " + isim);
        System.out.println("Çalışanın soyismi: " + soyisim);
        System.out.println("Çalışan id: " + id);
                         
    }
}

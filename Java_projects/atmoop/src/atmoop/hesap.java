
package atmoop;

public class hesap {
    private String kullanıcı_adı;
    private String parola;
    private int bakiye;

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public hesap(String kullanıcı_adı, String parola, int bakiye) {
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    public void paraYatır(int tutar){
        this.bakiye += tutar ;
        System.out.println("Yeni bakiyeniz: " + this.bakiye);
        
    }
    public void paraÇek(int tutar){
        if((bakiye-tutar)<0){
            System.out.println("Yeterli bakiyeniz yok."
                    + "Bakiyeniz: " + this.bakiye);
        }
        else{
            this.bakiye -= tutar;
            System.out.println("Kalan bakiyeniz: " + this.bakiye);        }
    }
    
    
}

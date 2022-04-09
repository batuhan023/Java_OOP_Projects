package baybladeprogramı;

public class bayblade {
private String baybledci;
private int dönüş_hızı;
private int saldırı_gücü;

public bayblade(String baybledci,int dönüş_hızı, int saldırı_gücü){
    this.baybledci=baybledci;
    this.dönüş_hızı=dönüş_hızı;
    this.saldırı_gücü=saldırı_gücü;
}

    public void setBaybledci(String baybledci) {
        this.baybledci = baybledci;
    }

    public void setDönüş_hızı(int dönüş_hızı) {
        this.dönüş_hızı = dönüş_hızı;
    }

    public void setSaldırı_gücü(int saldırı_gücü) {
        this.saldırı_gücü = saldırı_gücü;
    }

    public String getBaybledci() {
        return baybledci;
    }

    public int getDönüş_hızı() {
        return dönüş_hızı;
    }

    public int getSaldırı_gücü() {
        return saldırı_gücü;
    }
    
    public void saldır(){
        System.out.println(getBaybledci() + "" + saldırı_gücü + " ve " + dönüş_hızı + " ile saldırıyor!!");
        
    }
    
    public void KutsalCanavarOrtayaÇıkar(){
        System.out.println("Bu baybledin kutsal canavarı yoktur.");
    }
     public void BilgileriGöster(){
         System.out.println("Baybledci: " + baybledci);
         System.out.println("Saldırı gücü: " + saldırı_gücü);
         System.out.println("Dönüş hızı: " + dönüş_hızı);
     }
}


public class sanal_kütüphane {

    public static void main(String[] args) {
        kitaplar daha = new kitaplar("Daha",50);    
        daha.bilgileriGöster();
        kütüphane kütüphane1 = new kütüphane();
        kütüphane1.kitap_ekleme(daha);
       
  }

}
import java.util.ArrayList;
import java.util.Scanner;

public class kütüphane {
 
 private ArrayList<String> kitap_isimleri;
 private ArrayList<Integer> sayfa_sayıları;

 
    public void setKitap_isimleri(ArrayList<String> kitap_isimleri) {
        this.kitap_isimleri = kitap_isimleri;
    }

    public void setToplam_sayfa(ArrayList<Integer> sayfa_sayıları) {
        this.sayfa_sayıları = sayfa_sayıları;
    }
    public ArrayList<String> getKitap_isimleri() {
        return kitap_isimleri;
    }

    public ArrayList<Integer> getSayfa_sayıları() {
        return sayfa_sayıları;
    }
 public void kitap_ekleme(kitaplar kitaplar){
     Scanner input = new Scanner(System.in);
     String kitapİsmi;
     int sayfaSayısı;
     for(int i=0 ; i<kitap_isimleri.size();i++){
         System.out.println(kitap_isimleri.add("kitapİsmi"));
         
     }
 }
 public void sayfa_ekleme(int a){
     int sayfalar=0;
     for(int i=0;i<sayfa_sayıları.size();i++){
         System.out.println(sayfa_sayıları.get(i));
     }
     for(int j=0;j<sayfa_sayıları.size();j++){
         sayfalar+= sayfa_sayıları.get(j);
     }
     System.out.println("TOPLAM OKUDUĞUNUZ SAYFA SAYISI: " + sayfalar);
 }
 
  
}

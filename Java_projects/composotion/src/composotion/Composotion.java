
package composotion;

public class Composotion {

    public static void main(String[] args) {
       resolution resolution = new resolution(1920,1080);
       monitöt monitör = new monitöt("VS197","ASUS","18.5",resolution);
       kasa kasa = new kasa("shadow blade","shadow","tamperli cam");
       anakart anakart = new anakart("b250-pro","asus",10,"windwos 10");
       bilgisayar pc = new bilgisayar(monitör,kasa,anakart);
       pc.getKasa().bilgisayarı_aç();
       pc.getMonitör().monitörü_kapat();
       pc.getAnakart().işletim_sistemi_yükle("ubuntu 16.04");
    }
    
}

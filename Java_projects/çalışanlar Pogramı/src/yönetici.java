
public class yönetici extends çalışanlar {
    private int SorumluKişiSayısı;
    public yönetici(String isim, String soyisim, int id, int sorumluKişiSayısı) {
        super(isim, soyisim, id);
        this.SorumluKişiSayısı=sorumluKişiSayısı;
    }
    @Override
    public void bilgileriGöster(){
    super.bilgileriGöster();
        System.out.println("Sorumlu olduğu kişi sayısı: " + SorumluKişiSayısı);
    }
    public void zamYap(int zam){
        System.out.println(getIsim()+ "çalışanlara" + zam + "TL zam yapıyor...");
    }
}

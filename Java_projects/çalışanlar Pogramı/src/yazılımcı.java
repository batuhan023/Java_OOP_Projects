
public class yazılımcı extends çalışanlar {
    private String diller ;
    public yazılımcı(String isim, String soyisim, int id,String diller) {
        super(isim, soyisim, id);
        this.diller=diller;
    }
    public void formatAt(String işletimSistemi){
        System.out.println(getIsim() + işletimSistemi  + " işletim sistemini yüklüyor.." );
    }
    @Override
    public void bilgileriGöster(){
        super.bilgileriGöster();
        System.out.println("Yazılımcının bildiği diller: " +diller);
    }
}

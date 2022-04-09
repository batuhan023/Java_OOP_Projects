
package baybladeprogramı;

public class dragon extends bayblade{
    private String kutsalCanavar;
    private String gizliYetenek;
    public dragon(String baybladci, int dönüş_hızı, int saldırı_gücü,String kutsalCanavar,String gizliYetenek) {
        super(baybladci, dönüş_hızı, saldırı_gücü);
        this.gizliYetenek=gizliYetenek;
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void BilgileriGöster() {
        super.BilgileriGöster(); 
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
    }

    @Override
    public void KutsalCanavarOrtayaÇıkar() {
        super.KutsalCanavarOrtayaÇıkar();
         System.out.println(getBaybledci()+" " + kutsalCanavar + " ı ortaya çıakrıyor...");
        System.out.println(getBaybledci() + " ın saldırısı: Hayalet Kasırgası");
    }
    
}

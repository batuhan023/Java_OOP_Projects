
package baybladeprogramı;


public class Drayga extends bayblade{
    private String kutsalCanavar;
    public Drayga(String baybladci, int dönüş_hızı, int saldırı_gücü,String kutsalCanavar) {
        super(baybladci, dönüş_hızı, saldırı_gücü);
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
        System.out.println(getBaybledci() + " ın saldırısı: Kaplan Pençesi");
    }
    
    
}

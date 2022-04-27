public class kitaplar {
    private String kitapİsmi;
    private int sayfaSayısı;

    public kitaplar(String kitapİsmi, int sayfaSayısı) {
        this.kitapİsmi = kitapİsmi;
        this.sayfaSayısı = sayfaSayısı;
    }

    public String getKitapİsmi() {
        return kitapİsmi;
    }

    public int getSayfaSayısı() {
        return sayfaSayısı;
    }

    public void setKitapİsmi(String kitapİsmi) {
        this.kitapİsmi = kitapİsmi;
    }
    public void setSayfaSayısı(int sayfaSayısı) {
        this.sayfaSayısı = sayfaSayısı;
    }
    public void bilgileriGöster(){
        System.out.println("-Kitap Bilgileri-");
        System.out.println("Kitap ismi: " + kitapİsmi);
        System.out.println("Sayfa sayısı: " + sayfaSayısı);
        System.out.println("***************************");
        }
 
}

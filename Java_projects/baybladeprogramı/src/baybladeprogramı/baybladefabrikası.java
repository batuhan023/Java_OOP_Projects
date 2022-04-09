
package baybladeprogramı;


public class baybladefabrikası {
    
    public bayblade beybladeUret(String beyblade_türü){
        
        if(beyblade_türü.equals("dragon")){
            return new dragon("Takao",800,300,"Mavi Ejderha","kutsal canavarla konuşma");
        }else if (beyblade_türü.equals("Dranza")){
            return new Dranza("Kai",600,400,"Kırmızı anka kuşu");
        }else if (beyblade_türü.equals("Drayga")){
            return new Drayga("Rei",800,250,"Beyaz Kaplan");
        }else if (beyblade_türü.equals("draciel")){
            return new draciel("Max",400,100,"Kara Kaplumbağa");
        }else {
            return null;
        }
    }
}

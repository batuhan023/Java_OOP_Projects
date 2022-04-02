package idmanprogramı;

public class idman {
    
    private int burpee_sayısı;
    private int situp_sayısı;
    private int pushup_sayısı;
    private int squat_sayısı;

    public idman(int burpee_sayısı, int situp_sayısı, int pushup_sayısı, int squat_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
        this.situp_sayısı = situp_sayısı;
        this.pushup_sayısı = pushup_sayısı;
        this.squat_sayısı = squat_sayısı;
    }
    public int getBurpee_sayısı() {
        return burpee_sayısı;
    }

    public void setBurpee_sayısı(int burpee_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public int getPushup_sayısı() {
        return pushup_sayısı;
    }

    public void setPushup_sayısı(int pushup_sayısı) {
        this.pushup_sayısı = pushup_sayısı;
    }

    public int getSquat_sayııs() {
        return squat_sayısı;
    }

    public void setSquat_sayııs(int squat_sayııs) {
        this.squat_sayısı = squat_sayııs;
    }
    public void hareket_yap(String hareket_türü, int hareket_sayısı){
        if(hareket_türü.equals("burpee")){
            burpeeYap(hareket_sayısı);
        }
        else if(hareket_türü.equals("situp")){
            situpYap(hareket_sayısı);
        }
        else if(hareket_türü.equals("pushup")){
            pushupYap(hareket_sayısı);
        }
        else if(hareket_türü.equals("squat")){
            squatYap(hareket_sayısı);
        }
        else{
            System.out.println("Geçersiz hareket!");
        }
    }
    public void burpeeYap(int sayı){
        if(burpee_sayısı==0){
            System.out.println("Yapacak burpee kalmadı");
        }else if(burpee_sayısı-sayı<0){
            System.out.println("Hedeflediğin burpee sayısını geçtin tebrikler!!!");
            burpee_sayısı=0;
            System.out.println("Kalan burpee sayısı: " + burpee_sayısı);
        }else{
            burpee_sayısı-=sayı;
            System.out.println("Kalan burpee sayısı: " + burpee_sayısı);
        }
    }
      public void situpYap(int sayı){
        if(situp_sayısı==0){
            System.out.println("Yapacak situp kalmadı");
        }else if(situp_sayısı-sayı<0){
            System.out.println("Hedeflediğin situp sayısını geçtin tebrikler!!!");
            situp_sayısı=0;
            System.out.println("Kalan situp sayısı: " + situp_sayısı);
        }else{
            situp_sayısı-=sayı;
            System.out.println("Kalan situp sayısı: " + situp_sayısı);
        }
    }
        public void pushupYap(int sayı){
        if(pushup_sayısı==0){
            System.out.println("Yapacak pushup kalmadı");
        }else if(pushup_sayısı-sayı<0){
            System.out.println("Hedeflediğin pushup sayısını geçtin tebrikler!!!");
            pushup_sayısı=0;
            System.out.println("Kalan pushup sayısı: " + pushup_sayısı);
        }else{
            pushup_sayısı-=sayı;
            System.out.println("Kalan pushup sayısı: " + pushup_sayısı);
        }
    }
        public void squatYap(int sayı){
        if(squat_sayısı==0){
            System.out.println("Yapacak squat kalmadı");
        }else if(squat_sayısı-sayı<0){
            System.out.println("Hedeflediğin squat sayısını geçtin tebrikler!!!");
            squat_sayısı=0;
            System.out.println("Kalan squat sayısı: " + squat_sayısı);
        }else{
            squat_sayısı-=sayı;
            System.out.println("Kalan squat sayısı: " + squat_sayısı);
        }
    }
        public boolean idmanBittimi(){
            
        return(burpee_sayısı==0)&&(pushup_sayısı==0)&&(situp_sayısı==0)&&(squat_sayısı==0);
        }
    
}

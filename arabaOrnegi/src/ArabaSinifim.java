public class ArabaSinifim {
    String marka ;
    String model ;
    int yil ;
    int hiz ;

    public  void arabayiGoster(){
        System.out.println("Arabanizin marka ve modeli: "+ this.marka +" " + this.model);
    }
    public  void arabaArtanHizi(int hiz){
        this.hiz = this.hiz + hiz;
        if (hiz > 400 ){
            System.out.println("Hizinizi cok arttirdiniz lutfen dikkatli olun mevcut hiziniz: " + this.hiz + "km");
        }
        else {
            System.out.println("mevcut hiziniz arttirdiniz : " + this.hiz + "km" + " lutfen dikkatli olun");
        }
    }
    public  void  arabaAzalanHizi(int hiz){
        this.hiz = this.hiz - hiz;
        if (hiz<0){
            System.out.println("Durdunuz iyi dinlenmeler: " + 0 + "km");
        }
        else {
            System.out.println("mevcut hiziniz azalttiniz : " +this.hiz + "km" + " lutfen dikkatli olun");
        }
    }
}

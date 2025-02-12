public class MarketAlisVerisi {
    String name;
    double tutar;
    int kisiSayisi =4 ;
    double ortalama= 0;



    public double ortalamaHesapla(double toplam){
        ortalama = toplam / kisiSayisi;
        return ortalama;
    }
    public void alacakVerecek(double orta){
        if(orta>tutar){
            System.out.println(name + ": " + (orta-tutar) + " $ odeyecek");
        }
        else {
            System.out.println(name + ": " + (tutar-orta) + " $ alacakli");
        }
    }

}

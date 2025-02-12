public class BankaHesabi {
    String hesapSahibiAdi;
    String hessapNumarasi;
    double hesapBakiyesi;
    String yorum = "-----------------------------------";

    public BankaHesabi(String hesapSahibiAdi, String hessapNumarasi, double hesapBakiyesi){
        this.hesapSahibiAdi = hesapSahibiAdi;
        this.hessapNumarasi = hessapNumarasi;
        this.hesapBakiyesi= hesapBakiyesi;
    }

    public void paraYatir(double miktar){
        hesapBakiyesi +=miktar;
        System.out.println(miktar+" Para Yatirma isleminiz Basari ile gerceklesti.");
        bakiyeGoster();
    }

    public void paraCek(double miktar){
        if(hesapBakiyesi<miktar){
            System.out.println(hessapNumarasi +" Nolu Hesapta Para Cekme isleminiz Gerceklesmedi.");
            bakiyeGoster();
        }
        else {
            hesapBakiyesi-=miktar;
            System.out.println(miktar+" Para Cekme isleminiz Basari ile gerceklesti.");
            bakiyeGoster();

        }
    }

    public  void bakiyeGoster(){
        System.out.println(hessapNumarasi + " Nolu hesabinizin bakiyesi: " + hesapBakiyesi + " $");
        System.out.println(yorum);
    }

    public void bilgiGoster(){
        System.out.println("Hesap sahibi ismi: " + hesapSahibiAdi);
        System.out.println("Hesap numarasi: " + hessapNumarasi);
        System.out.println("Hesap bakiyesi: " + hesapBakiyesi);
        System.out.println(yorum);
    }

    public  void paraTranfer(String aliciBankaHesabi, double miktar){
        if(miktar<hesapBakiyesi && miktar>0){
            System.out.println(hessapNumarasi + " nolu hesaptan " + aliciBankaHesabi +" nolu hesaba " + miktar +"$ para  basari ile gonderildi.");
            hesapBakiyesi -= miktar;
        }
        else {
            System.out.println("Hesabinizda " + miktar + "$ bulunmamaktadir.");
        }
        bakiyeGoster();
    }
}

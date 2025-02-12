public class Kutuphane {
    String kitapAdi;
    String yazariAdi;
    int toplamSayfaSayisi;
    int okunanSayfaSayisi;

    public Kutuphane(String ktpAdi, String yzrAdi, int toplamSayfaSayisi, int okunanSayfaSayisi){
        this.kitapAdi=ktpAdi;
        this.yazariAdi=yzrAdi;
        this.toplamSayfaSayisi=toplamSayfaSayisi;
        this.okunanSayfaSayisi=okunanSayfaSayisi;
    }


    public void okumaYap(int sayfaSayisi){
        okunanSayfaSayisi += sayfaSayisi;
        if(okunanSayfaSayisi>toplamSayfaSayisi){
            okunanSayfaSayisi = toplamSayfaSayisi;
            System.out.println(kitapAdi + " " + "Bitirdiniz... Tebrikler");
        }else {
            System.out.println(kitapAdi + " " + okunanSayfaSayisi + ". safaya kadar okundu.");
        }
        System.out.println("*******************************************");
    }

    public void kitabiSifirla(){
        okunanSayfaSayisi =0;
        System.out.println("************Kitap sifirlandi*************");
        bilgileriGoster();
        System.out.println("*******************************************");
    }

    public void bilgileriGoster(){
        System.out.println("Kitabin Adi: " + kitapAdi);
        System.out.println("Yazarin Adi: " + yazariAdi);
        System.out.println("Sayfa Sayisi: " + toplamSayfaSayisi);
        System.out.println("Okudugun Sayfa Sayisi: " + okunanSayfaSayisi);
        System.out.println("*******************************************");
    }
}

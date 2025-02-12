//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MarketAlisVerisi marketAlisVerisiNurettin= new MarketAlisVerisi();
        marketAlisVerisiNurettin.name = "Nurettin";
        double nurettin = marketAlisVerisiNurettin.tutar = 492.15;//6.66  \ 3.14+10=13.14

        MarketAlisVerisi marketAlisVerisiKenan= new MarketAlisVerisi();
        marketAlisVerisiKenan.name = "Kenan";
        double kenan = marketAlisVerisiKenan.tutar = 341.54;//10   \ 6.66-3.14

        MarketAlisVerisi marketAlisVerisiFatih= new MarketAlisVerisi();
        marketAlisVerisiFatih.name = "Fatih";
        double fatih = marketAlisVerisiFatih.tutar = 61;//16.66

        MarketAlisVerisi marketAlisVerisiMemo= new MarketAlisVerisi();
        marketAlisVerisiMemo.name = "Gacf";
        double memo = marketAlisVerisiMemo.tutar = 211.68;//16.66

        double toplam = nurettin + kenan + fatih + memo;

        double ortalama = marketAlisVerisiNurettin.ortalamaHesapla(toplam);
        System.out.println("Ortalama: "+ortalama);

        marketAlisVerisiFatih.alacakVerecek(ortalama);
        marketAlisVerisiNurettin.alacakVerecek(ortalama);
        marketAlisVerisiKenan.alacakVerecek(ortalama);
        marketAlisVerisiMemo.alacakVerecek(ortalama);



    }
}
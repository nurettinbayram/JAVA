//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hesap hesapNurettin = new Hesap();
        hesapNurettin.setSahipAdi("Nurettin");
        hesapNurettin.setHesapNo(253645);
        hesapNurettin.setBakiye(500);

        KrediHesabi nurettinKrediHesabi = new KrediHesabi();
        nurettinKrediHesabi.setSahipAdi("Nino");
        nurettinKrediHesabi.setHesapNo(457896);
        nurettinKrediHesabi.setBakiye(4500);
        nurettinKrediHesabi.krediHesapla(hesapNurettin);


        System.out.println(hesapNurettin.getSahipAdi());
        hesapNurettin.paraYatir(2500);

        nurettinKrediHesabi.paraYatir(4500);
        nurettinKrediHesabi.paraCek(200);
        nurettinKrediHesabi.hesapBilgisiGoster();


        MevduatHesabi nurettinMevduatHesabi = new MevduatHesabi();
        nurettinMevduatHesabi.yillikVadeMiktari(hesapNurettin);

    }
}
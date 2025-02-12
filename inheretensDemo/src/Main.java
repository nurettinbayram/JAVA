//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TarimKrediManeger tarimKrediMeneger = new TarimKrediManeger();
        tarimKrediMeneger.Hesapla();
        System.out.println("---------------------------------------------");
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManeger());
    }
}
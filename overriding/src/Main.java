//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseKrediManeger[] krediManegers = new BaseKrediManeger[]{new OgretmenKrediManeger(), new TarimKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManeger krediManeger : krediManegers){
            System.out.println(krediManeger.hesapla(1000));
        }
    }
}
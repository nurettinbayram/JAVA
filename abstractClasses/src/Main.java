//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator =new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator gameCalculator = new MenGameCalculator(); //buradaki yapi Game sinifi turunden yeni Man sinifi olusturuldu
        gameCalculator.gameOver();
        gameCalculator.hesapla();
    }
}
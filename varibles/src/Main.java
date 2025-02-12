//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 59, y = 88, z = 11;

        String enBuyukSayi = "En buyuk sayiniz: ";

        if (x > y & x > z) {
            System.out.println(enBuyukSayi + "x = " + x + " tir");
        } else if (y > x & y > z) {
            System.out.println(enBuyukSayi + "y = " + y + " dir");
        } else {
            System.out.println(enBuyukSayi + "z = " + z + " dir");
        }


    }
}
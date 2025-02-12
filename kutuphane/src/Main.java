//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane("Sefiller", "Victor Hugo", 490, 0);

        kutuphane.okumaYap(25);
        kutuphane.okumaYap(205);
        kutuphane.kitabiSifirla();
        kutuphane.okumaYap(89);
        kutuphane.bilgileriGoster();

        Kutuphane kutuphane1 = new Kutuphane("1984", "George Ovel", 84, 0);
        kutuphane1.bilgileriGoster();
        kutuphane1.okumaYap(45);
    }
}
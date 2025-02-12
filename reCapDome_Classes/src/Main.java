//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DortIslem matIslem = new DortIslem();
        int result=matIslem.Topla(10,12);
        System.out.println(result);
        result=matIslem.Cikar(10,12);
        System.out.println(result);
        result=matIslem.Carp(10,12);
        System.out.println(result);
        result=matIslem.Bol(10,12);
        System.out.println(result);
    }
}
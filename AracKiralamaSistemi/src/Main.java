//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Araba bmw = new Araba("BMW", "X5", 2020);
//        bmw.araciTanit();
//        bmw.kiraUcretiHesapla(10);
//
//        Kamyonet isusu = new Kamyonet("Isuzu", "CZ", 2020);
//        isusu.araciTanit();
//        isusu.kiraUcretiHesapla(10);
//
//        Motosiklet kx = new Motosiklet("KX", "CC", 2020);
//        kx.araciTanit();
//        kx.kiraUcretiHesapla(10);

        Arac[] araclar = new Arac[]{new Araba("BMW", "X5", 2020), new Kamyonet("Isuzu", "CZ", 2020), new Motosiklet("KX", "CC", 2020)};
        for(Arac arac : araclar){
            double gunlukUcret = arac.gunlukUcret;
            System.out.println("------------------------------------------");
            arac.kiraUcretiHesapla(3);
            System.out.println("------------------------------------------");
        }


    }
}
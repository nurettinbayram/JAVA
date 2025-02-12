public class Motosiklet extends Arac{
    public Motosiklet(String marka, String model, int yil) {
        super(marka, model, yil);
        this.gunlukUcret =300- (2025 - yil)*35;
    }

    public void kiraUcretiHesapla(int gun){
        System.out.println(marka +" "+ model + " aracinin gunluk kirasi : " + gunlukUcret);
        System.out.println(marka +" "+ model + " toplam " + gun + " kirasi : " + gunlukUcret*gun + "$ dir");
    }

    public  void araciTanit(){
        System.out.println("Aracin markasi : " + marka);
        System.out.println("Aracin modeli : " + model);
        System.out.println("Aracin yasi : " + yil);
        System.out.println("Aracin gunluk ucreyi : " + gunlukUcret + "$");
    }
}

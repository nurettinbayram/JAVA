public class Arac {
    String marka;
    String model;
    int yil;
    double gunlukUcret;

    public Arac(String marka, String model, int yil){
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.gunlukUcret =300- (2025 - yil)*25;
    }

    public  void araciTanit(){
        System.out.println("Aracin markasi : " + marka);
        System.out.println("Aracin modeli : " + model);
        System.out.println("Aracin yasi : " + yil);
        System.out.println("Aracin gunluk ucreyi : " + gunlukUcret + "$");
    }

    public void kiraUcretiHesapla(int gun){
        System.out.println(marka +" "+ model + " aracinin gunluk kirasi : " + gunlukUcret);
        System.out.println(marka +" "+ model + " toplam " + gun + " kirasi : " + gunlukUcret*gun + "$ dir");
    }
}

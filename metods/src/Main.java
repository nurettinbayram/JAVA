//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi= sayiDondur(4, 9);
        String mesaj = mesajim("Ahmet", "Kaya");
        int toplam = topla2(2,5,2,8,6,465);
        System.out.println(sayi);
        System.out.println(mesaj);
        System.out.println(toplam);
    }

    public  static  void ekle(){
        //void metodlar birseyi dondurmekten ziyade calistiri sadece
        //void olan bir fonksiyonu baska bir degiskene atayamayiz cunku bize deger dondurmuyor

        System.out.println("eklendi.");
    }
    public  static  void sil(){
        System.out.println("silindi.");
    }
    public static void guncelle(){
        System.out.println("guncellendi.");
    }

    public  static int sayiDondur(int x, int y){
        //int string gibi metodlar deger dondurur bu yuzden baska bir degiskene atanabilir
        return x+y;
    }

    public static String mesajim(String name, String lastName){
        return name +" "+ lastName + " you were very spatial person";
    }

    public static int topla2(int... sayilar){
        //bu bolumdeki metot ta istenildigi kadar sayi almasini sagliyor ... nokta sayesinde
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

}
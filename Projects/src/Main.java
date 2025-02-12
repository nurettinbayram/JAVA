import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Sayinizi giriniz:");
//        int number = myScanner.nextInt();
//        String sayi="sayi asaldir";
//
//        for (int i=2; i<number; i++){
//            int remainder = number%i;
//
//            if(remainder==0){
//                sayi = "sayi asal sayi degil";
//                break;
//            }
//            else {
//                sayi="sayi asaldir";
//            }
//        }
//
//        System.out.println(sayi);

        //------------------------------------------------

//        char harf='o';
//
//        if (harf=='a' || harf=='u' || harf=='o'){
//            System.out.println("girilen harf kalindir");
//        } else if (harf=='i' || harf=='e' ) {
//            System.out.println("girilen harf ince harftir");
//        }
//        else {
//            System.out.println("istenilen aralikta bir harf girilmadi");
//        }

        //**********************************************


//        Scanner myObj = new Scanner(System.in);
//        System.out.print("sayinizi giriniz:");
//        int sayi = myObj.nextInt();
//
//        int toplam =0;
//
//        for (int i=1; i<sayi; i++){
//            if (sayi%i==0){
//                toplam =toplam+i;
//            }
//        }
//        if (toplam==sayi){
//            System.out.println("sayiniz mukemmel sayidir: "+ toplam);
//        }
//        else {
//            System.out.println("sayi normal: "+ toplam);
//        }

        //*********************************************


        int[] sayilar = new int[]{1,3,5,7,9,23,54};
        int aranacakSayi = 6;
        boolean varMi =false;

        for (int sayi : sayilar){
            if (sayi==aranacakSayi){
                varMi = true;
                break;
            }
        }

        if (varMi){
            System.out.println("Sayi mevcuttur");
        }
        else {
            System.out.println("sayi mevcut degildir");
        }

    }
}
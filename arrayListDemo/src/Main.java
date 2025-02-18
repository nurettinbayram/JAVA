import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList.size()); //eleman sayisini goster
        arrayList.add("Nurettin");
        arrayList.add("Kenan");
        arrayList.add(10);
        System.out.println(arrayList.size()); //eleman sayisini goster
        System.out.println(arrayList); //eleman sayisini goster
        System.out.println(arrayList.get(1)); //eleman getirir
        arrayList.set(0, "Fatih"); // 0 indekteki daki elemani fatih ile degistir
        System.out.println(arrayList.get(0)); //eleman getirir
        arrayList.remove(0); // 0 indexin daki elemani siler
        System.out.println(arrayList);
        arrayList.clear();//tum elemanlari siler
        System.out.println(arrayList);

        ArrayList listem = new ArrayList();
        System.out.println(listem.size()); //eleman sayisini goster
        listem.add("elma");
        listem.add("Kivi");
        listem.add(4);

        for (Object i : listem){//Buradaki i nin obje olduguna dikkat et yani i tum veri turlerini destekliyor
            System.out.println(i);
        }


        ArrayList<String> sehirler = new ArrayList<>();//burada liste string olarak belirlenmis yukardakiler gibi
        //obje degil yani tum veri turlerini almaz sadece string veri turu ile calisir
        sehirler.add("Sirnak");
        sehirler.add("Mardin");
        sehirler.add("Antep");
        sehirler.add("New York");
        System.out.println(sehirler);
        Collections.sort(sehirler);//sehirlerr dizisini siralar
        for (String i : sehirler){// i nin string tunde olduguna dikkat
            System.out.println(i);
        }





    }
}
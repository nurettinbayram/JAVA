//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj= "   Bugun hava cok guzel.       ";

        System.out.println("Eleman sayisi: " + mesaj.length()); //string uzunlugunu bulur
        System.out.println("5. Eleman: " +mesaj.charAt(4)); //4. indexteki elenami bulur
        System.out.println(mesaj.concat(" Yasasin")); // mesaj metnine yeni metin ekledi
        System.out.println(mesaj);// tekrardan eski metni yazdi
        System.out.println(mesaj.startsWith("A"));// metin A harfi ile basliyor mu? True or False done
        System.out.println(mesaj.endsWith("."));// metin (nokta) . ile bitiyor mu?

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0); //mesaj metnini 0. indexten 5. indexe kadar karakterler dizisinin 0.indexinden baslayip aktar.
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a')); //a nin bastan kacinci indexte oldugunu bulur
        System.out.println(mesaj.lastIndexOf('a')); //a nin sondan kacinci indexte oldugunu bulur

        System.out.println(mesaj.replace(' ', '%'));// mesaj metnindeki bosluklari % ile degistirmeye yarar
        System.out.println(mesaj.substring(2));// 2.indekten sonraki metni alir
        System.out.println(mesaj.substring(2,4));// 2.indekten 4. indexe kadar alir


        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);//besaj metnini bosluklara gore parcalayip kelime atli array ye attip yazdiriyoruz
        }

        System.out.println(mesaj.toLowerCase());// butun harfleri kucuk harfe donusturur
        System.out.println(mesaj.toUpperCase());// butun harfleri buyuk harfe donusturur
        System.out.println(mesaj.trim()); //bu komut matindedi basinda ve sonundaki bosluklari alir



    }
}
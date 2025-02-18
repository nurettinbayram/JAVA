import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();// burada tutun string string olacagini anlatiyor ama int string olarak ta degistirilebilir
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        System.out.println(sozluk.size());

        for (String item : sozluk.keySet()){
            System.out.println("Key: " + item + "  ||  Deger: "+ sozluk.get(item));
        }

        System.out.println("-------------------------------------------");

        System.out.println(sozluk);//

        System.out.println(sozluk.get("table"));//table key degerini getirir
        sozluk.remove("table");//key degeri table olani siler
        System.out.println(sozluk.get("table"));//
        sozluk.clear();
        System.out.println("-------------------------");//
        System.out.println(sozluk);//tum elemanlari siler




    }
}
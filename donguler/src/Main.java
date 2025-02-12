//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------");

        String[] ogrengiler = new String[4];
        ogrengiler[0]="ahmet";
        ogrengiler[1]="rojin";
        ogrengiler[2]="kagan";
        ogrengiler[3]="mehmet";

        for (int i=0; i<ogrengiler.length; i++){
            System.out.println(ogrengiler[i]);
        }

        System.out.println("----------------------");

        for (String ogrenci : ogrengiler){
            System.out.println(ogrenci);
        }
    }
}
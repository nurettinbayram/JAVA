//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // classlar referans titlidir
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //VALUE
        int sayi1= 10;
        int sayi2= 20;
        sayi2=sayi1;
        System.out.println("sayi1: "+ sayi1);
        sayi1=30;
        System.out.println("sayi2: " + sayi2);//DEGER TIPLI ATAMALARDA BELLEKTE YENI ADRESLERI ESITLENMEDIGI ICIN SAYI1 SONRAKI DEGISIMLERI SAYI2'YI ETKILEMIYOR

        //REFERANS
        int [] obj1 = new int[]{1,2,3};
        int [] obj2 = new int[]{4,5,6}; //ASAGIDA OBJ2 YE OBJE1 ATADIGIM ICIN IDEA DE OBJ2 SAG TARAFINI SOLUKLADI YANI ISLEVSIZ HALE GETIRDI
        obj2=obj1;
        obj1[0]=10;
        System.out.println("obje2 degeri : " + obj2[0]);//REFERANS TIPLI ATAMALARDA IKI OBJE ESIRLENIRSE BUNLARIN ADRESLERIDE ESITLENMIS OLUUR BU DURUMDADA ICINDEKI IFADELERDE ESITLENMIS OLUR
 }
}
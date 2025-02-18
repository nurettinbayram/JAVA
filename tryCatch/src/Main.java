//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }
        //birden fazla catch blogu olusturulabilir
        catch (StringIndexOutOfBoundsException strinArrayHatasi){//stringlwe ile ilgili hatalarai yakalar
            System.out.println("String dizisi ile ilgili bir sorununuz var sorunu anlamak icin bir alt satira bakabilirsiniz: \n" +  strinArrayHatasi);
        }
        catch (ArrayIndexOutOfBoundsException diziArrayHatasi){//diziler ile ilgili hatalari yakalar
            System.out.println("Diziniz ile ilgili bir sorununuz var sorunu anlamak icin bir alt satira bakabilirsiniz: \n" +  diziArrayHatasi);
        }
        catch (Exception genelHata){//her turlu hatayi yakalar
            System.out.println("Genel bir sorununuz var sorunu anlamak icin bir alt satira bakabilirsiniz: \n" +  genelHata);
        }
        finally {
            System.out.println("\n\nFinally bolumu her turlu calisir");
        }
    }
}
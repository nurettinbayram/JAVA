public class KrediHesabi extends Hesap{

    public void  krediHesapla(Hesap hesap ){
        System.out.println( hesap.getHesapNo() +" nolu hesaba bankamiz  %"+ hesap.getBakiye()*(0.001) + " oraninda kredi saglamaktadir");

    }
}

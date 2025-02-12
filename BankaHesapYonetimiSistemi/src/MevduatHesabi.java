public class MevduatHesabi extends  Hesap{

    public void yillikVadeMiktari(Hesap hesap){
        System.out.println(hesap.getHesapNo() + "nolu hesabin yillik " + hesap.getBakiye()*(0.099) + "$ vade getirisi var");
    }
}

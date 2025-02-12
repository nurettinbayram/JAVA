public class NormalServis extends HastaneBolumu implements IHastaneBolumu{
    int yatakSayisi;

    public NormalServis(String bolumAdi) {
        super("Normal Servis");
    }

    @Override
    public void hastaKabulEt(String hastaAdi) {

    }

    @Override
    public void hastaTaburcuEt(String hastaAdi) {

    }

    public void yatakDurumuGoster(){

    }

    @Override
    void bolumBilgisi() {
        System.out.println(bolumAdi);
    }
}

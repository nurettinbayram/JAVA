import java.util.List;

public class MuayeneSistemi extends HastaneBolumu implements IHastaneBolumu{
    List<String> randevular;

    public MuayeneSistemi(String bolumAdi) {
        super("Muayene ve Randevu Servisi");
    }


    @Override
    void bolumBilgisi() {
        System.out.println(bolumAdi);
    }

    @Override
    public void hastaKabulEt(String hastaAdi) {

    }

    @Override
    public void hastaTaburcuEt(String hastaAdi) {

    }

    public void randevuOlustur(String hastaAdi, String tarih){

    }

    public void randevuListesiGoster(){

    }
}

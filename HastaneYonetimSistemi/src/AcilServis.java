public class AcilServis extends HastaneBolumu implements  IHastaneBolumu {
    boolean oncelikliHastaVarmi;

    public AcilServis(String bolumAdi) {
        super("Acil Servis");
    }

    public void hastaKabulEt(String hastaAdi){

    }

    public void hastaTaburcuEt(String hastaAdi){

    }

    public void oncelikliMudahale(){

    }

    @Override
    void bolumBilgisi() {
        System.out.println(bolumAdi);
    }
}

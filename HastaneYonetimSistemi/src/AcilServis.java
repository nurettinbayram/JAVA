import java.util.LinkedList;

public class AcilServis extends HastaneBolumu {
    public AcilServis() {
        super("Acil Servis");
    }

    @Override
    public void hastaKabulEt(String hastaAdi, boolean oncelikli) {
        if (oncelikli) {
            ((LinkedList<String>) beklemeListesi).addFirst(hastaAdi);
            System.out.println(hastaAdi + " öncelikli hasta olarak ACİL SERVİSE eklendi.");
        } else {
            beklemeListesi.add(hastaAdi);
            System.out.println(hastaAdi + " ACİL SERVİSE kabul edildi.");
        }
    }

    @Override
    public void hastaTaburcuEt() {
        if (!beklemeListesi.isEmpty()) {
            String hasta = beklemeListesi.poll();
            System.out.println(hasta + " ACİL SERVİSTEN taburcu edildi.");
        } else {
            System.out.println("Acil serviste bekleyen hasta yok.");
        }
    }
}

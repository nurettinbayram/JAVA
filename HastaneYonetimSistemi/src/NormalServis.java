public class NormalServis extends HastaneBolumu {
    public NormalServis() {
        super("Normal Servis");
    }

    @Override
    public void hastaKabulEt(String hastaAdi, boolean oncelikli) {
        beklemeListesi.add(hastaAdi);
        System.out.println(hastaAdi + " NORMAL SERVİS için sıraya alındı.");
    }

    @Override
    public void hastaTaburcuEt() {
        if (!beklemeListesi.isEmpty()) {
            String hasta = beklemeListesi.poll();
            System.out.println(hasta + " NORMAL SERVİS'ten taburcu edildi.");
        } else {
            System.out.println("Normal serviste bekleyen hasta yok.");
        }
    }
}

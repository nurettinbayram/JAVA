public class MuayeneBolumu extends HastaneBolumu {
    public MuayeneBolumu() {
        super("Muayene Bölümü");
    }

    @Override
    public void hastaKabulEt(String hastaAdi, boolean oncelikli) {
        beklemeListesi.add(hastaAdi);
        System.out.println(hastaAdi + " muayene için sıraya alındı.");
    }

    @Override
    public void hastaTaburcuEt() {
        if (!beklemeListesi.isEmpty()) {
            String hasta = beklemeListesi.poll();
            System.out.println(hasta + " muayeneden sonra taburcu edildi.");
        } else {
            System.out.println("Muayene için bekleyen hasta yok.");
        }
    }
}

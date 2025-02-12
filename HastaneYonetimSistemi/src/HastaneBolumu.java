import java.util.LinkedList;
import java.util.Queue;

// 📌 Soyut Hastane Bölümü
public abstract class HastaneBolumu implements IHastaneBolumu {
    protected String bolumAdi;
    protected Queue<String> beklemeListesi;

    public HastaneBolumu(String bolumAdi) {
        this.bolumAdi = bolumAdi;
        this.beklemeListesi = new LinkedList<>();
    }

    @Override
    public void beklemeListesiGoster() {
        System.out.println("\n" + bolumAdi + " Bekleme Listesi: " + beklemeListesi);
    }
}

// 📌 Hastane Bölümleri için Interface
public interface IHastaneBolumu {
    void hastaKabulEt(String hastaAdi, boolean oncelikli);
    void hastaTaburcuEt();
    void beklemeListesiGoster();
}

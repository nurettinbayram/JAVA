public abstract class Oda {
    private int odaNumarasi;
    private double fiyat;
    private int yatakSayisi;
    private KonforSeviyesi konforSeviyesi;
    private boolean rezerveDurumu; // Odanın rezervasyon durumu

    // Constructor (Yapıcı Metot)
    public Oda(int odaNumarasi, double fiyat, int yatakSayisi, KonforSeviyesi konforSeviyesi) {
        this.odaNumarasi = odaNumarasi;
        this.fiyat = fiyat;
        this.yatakSayisi = yatakSayisi;
        this.konforSeviyesi = konforSeviyesi;
        this.rezerveDurumu = false; // Başlangıçta odalar rezerve edilmemiştir
    }

    // Encapsulation (Getter ve Setter Metotları)
    public int getOdaNumarasi() {
        return odaNumarasi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public int getYatakSayisi() {
        return yatakSayisi;
    }

    public KonforSeviyesi getKonforSeviyesi() {
        return konforSeviyesi;
    }

    public boolean isRezerveDurumu() {
        return rezerveDurumu;
    }

    // Abstract Metotlar (Türeyen sınıflar bunları kendilerine göre yazacak)
    public abstract void odaBilgisi();
    public abstract double gunlukUcretHesapla(int gun);

    // Oda rezervasyonu için metot
    public void rezerveEt() {
        if (!rezerveDurumu) {
            rezerveDurumu = true;
            System.out.println("Oda " + odaNumarasi + " başarıyla rezerve edildi.");
        } else {
            System.out.println("Oda " + odaNumarasi + " zaten rezerve edilmiş!");
        }
    }
}

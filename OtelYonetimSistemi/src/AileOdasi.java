class AileOdasi extends Oda {
    public AileOdasi(int odaNumarasi, double fiyat, KonforSeviyesi konforSeviyesi) {
        super(odaNumarasi, fiyat, 4, konforSeviyesi); // Yatak sayısı her zaman 4 olacak
    }

    @Override
    public void odaBilgisi() {
        System.out.println("Aile Odası - Oda No: " + getOdaNumarasi() +
                ", Fiyat: " + getFiyat() + "$, Konfor: " + getKonforSeviyesi());
    }

    @Override
    public double gunlukUcretHesapla(int gun) {
        double ucret = getFiyat() * gun;
        if (getKonforSeviyesi() == KonforSeviyesi.LUKS) {
            ucret *= 1.5; // Lüks odalar %50 ek ücret alır
        }
        return ucret;
    }
}
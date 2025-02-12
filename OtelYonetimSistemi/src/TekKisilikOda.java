class TekKisilikOda extends Oda {
    public TekKisilikOda(int odaNumarasi, double fiyat, KonforSeviyesi konforSeviyesi) {
        super(odaNumarasi, fiyat, 1, konforSeviyesi); // Yatak sayısı her zaman 1 olacak
    }

    @Override
    public void odaBilgisi() {
        System.out.println("Tek Kişilik Oda - Oda No: " + getOdaNumarasi() +
                ", Fiyat: " + getFiyat() + "$, Konfor: " + getKonforSeviyesi());
    }

    @Override
    public double gunlukUcretHesapla(int gun) {
        double ucret = getFiyat() * gun;
        if (getKonforSeviyesi() == KonforSeviyesi.LUKS) {
            ucret *= 1.2; // Lüks odalar %20 ek ücret alır
        }
        return ucret;
    }
}
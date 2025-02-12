class CiftKisilikOda extends Oda {
    public CiftKisilikOda(int odaNumarasi, double fiyat, KonforSeviyesi konforSeviyesi) {
        super(odaNumarasi, fiyat, 2, konforSeviyesi); // Yatak sayısı her zaman 2 olacak
    }

    @Override
    public void odaBilgisi() {
        System.out.println("Çift Kişilik Oda - Oda No: " + getOdaNumarasi() +
                ", Fiyat: " + getFiyat() + "$, Konfor: " + getKonforSeviyesi());
    }

    @Override
    public double gunlukUcretHesapla(int gun) {
        double ucret = getFiyat() * gun;
        if (getKonforSeviyesi() == KonforSeviyesi.LUKS) {
            ucret *= 1.3; // Lüks odalar %30 ek ücret alır
        }
        return ucret;
    }
}
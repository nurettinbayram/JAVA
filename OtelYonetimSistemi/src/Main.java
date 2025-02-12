// Konfor seviyelerini belirlemek için Enum kullanımı
enum KonforSeviyesi {
    EKONOMIK, STANDART, LUKS
}

public class Main {
    public static void main(String[] args) {
        // Otelimizdeki odalar
        Oda oda1 = new TekKisilikOda(101, 50, KonforSeviyesi.EKONOMIK);
        Oda oda2 = new CiftKisilikOda(102, 80, KonforSeviyesi.STANDART);
        Oda oda3 = new AileOdasi(103, 150, KonforSeviyesi.LUKS);

        // Polymorphism kullanarak tüm odaların bilgilerini listeleyelim
        Oda[] otelOdalar = {oda1, oda2, oda3};

        System.out.println("🏨 Otelimizdeki Odalar:");
        for (Oda oda : otelOdalar) {
            oda.odaBilgisi();
        }

        // Belirli bir odanın ücret hesaplamasını yapalım
        System.out.println("\n🛏️ Oda 103'ün 3 günlük ücreti: " + oda3.gunlukUcretHesapla(3) + "$");

        // Bir odanın rezervasyon işlemi
        System.out.println("\n✅ Oda 102'yi rezerve edelim:");
        oda2.rezerveEt();

        // Aynı odayı tekrar rezerve etmeye çalışalım
        oda2.rezerveEt();
    }
}
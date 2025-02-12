public class Main {
    public static void main(String[] args) {
        AcilServis acilServis = new AcilServis();
        MuayeneBolumu muayeneBolumu = new MuayeneBolumu();
        NormalServis normalServis = new NormalServis();

        // 📌 Acil Servis Testleri
        System.out.println("\n--- ACİL SERVİS ---");
        acilServis.hastaKabulEt("Ahmet Yılmaz", false);
        acilServis.hastaKabulEt("Zeynep Demir", true); // Öncelikli hasta
        acilServis.hastaKabulEt("Mehmet Kara", false);
        acilServis.beklemeListesiGoster();

        acilServis.hastaTaburcuEt();
        acilServis.beklemeListesiGoster();

        // 📌 Muayene Bölümü Testleri
        System.out.println("\n--- MUAYENE BÖLÜMÜ ---");
        muayeneBolumu.hastaKabulEt("Ali Vural", false);
        muayeneBolumu.hastaKabulEt("Fatma Öztürk", false);
        muayeneBolumu.beklemeListesiGoster();

        muayeneBolumu.hastaTaburcuEt();
        muayeneBolumu.beklemeListesiGoster();

        // 📌 Normal Servis Testleri
        System.out.println("\n--- NORMAL SERVİS ---");
        normalServis.hastaKabulEt("Burak Kılıç", false);
        normalServis.hastaKabulEt("Elif Arslan", false);
        normalServis.beklemeListesiGoster();

        normalServis.hastaTaburcuEt();
        normalServis.beklemeListesiGoster();
    }
}
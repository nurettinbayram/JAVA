public class OgrenciKrediManager extends  BaseKrediManeger{
    public  double hesapla(double tutar){
        return tutar*1.09; // base de olan hesapla metodunun aynisini burayada tanimladik ama buradaki ogrenciler icin olan hesaplamayi degistirdik ve main bolumunden hesapla fonctionu defolult olan yeri base sinifidir ama ogrenci sinifinda onu ozerine yazdigimiz icin olay overridin oldu buda defoult olan metodu nasil hesaplamalari digerlerinden degistirdigimizi gosteri

    }
}

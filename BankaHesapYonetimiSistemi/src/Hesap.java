public class Hesap {
    private int hesapNo;
    private double bakiye ;
    private String sahipAdi;

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getSahipAdi() {
        return sahipAdi;
    }

    public void setSahipAdi(String sahipAdi) {
        this.sahipAdi = sahipAdi;
    }

    public void paraYatir(double miktar) {
        if (miktar > 0) {
            this.bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + this.bakiye + " TL");
        } else {
            System.out.println("Geçersiz para yatırma işlemi!");
        }
    }
    public void paraCek(double miktar) {
        if (miktar > 0 && miktar <= this.bakiye) {
            this.bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Yeni bakiye: " + this.bakiye + " TL");
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz işlem! " +this.bakiye + " TL");
        }
    }

    public void hesapBilgisiGoster() {
        System.out.println("Hesap Sahibi: " + sahipAdi + " | Hesap No: " + hesapNo + " | Bakiye: " + bakiye + " TL");
    }
}

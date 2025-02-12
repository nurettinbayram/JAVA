public abstract class HastaneBolumu {
    protected String bolumAdi;

    //Kurucu metot
    public HastaneBolumu(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    abstract void bolumBilgisi();
}

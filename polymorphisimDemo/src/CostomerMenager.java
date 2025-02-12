public class CostomerMenager {
    private  BaseLogger logger;

    public CostomerMenager(BaseLogger logger){
        this.logger=logger;
    }

    public void  add(){
        System.out.println("Musteri eklendi");
        this.logger.log("Log Mesaji");
    }
}

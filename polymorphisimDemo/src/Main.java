//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabeseLogger(), new ConsoleLogger()};
//        //burada miras aldiklari baseLoger turunde bir dizi olusturuldu dizi elemanlari ondan miras alan cocuklar eklendi
//        for(BaseLogger logger:loggers){ //baseLogger turundeki loggers dizisini logger degiskenine tek tek atayip uzerinde dolasir
//            logger.log("Log mesaji");
//        }

        CostomerMenager customerMeneger = new CostomerMenager(new DatabeseLogger());//burada istedigin sinifi yazip calistirabilirsin
        customerMeneger.add();
    }
}
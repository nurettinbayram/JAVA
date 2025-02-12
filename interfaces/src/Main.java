//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //interface`lerde abstract`lar gibi new`lenemezler
        // interface`ler birden fazla clasi implament eder
        //ayni class hem implement hemde extend edebilir farkli classlari
//        ICustomerDal customerDal = new MySqlCustomerDal();
//        customerDal.Add();

            // BIRINCI YONTEM
//        CustomerManeger customerManeger = new CustomerManeger();//customerMeneger nesnesi olusturuldu
//        customerManeger.customerDal = new OracleCustomerDal();//customerMeneger nesnesinin customerDal ozelligine OracleCustomerDal atandi
//        customerManeger.add();//buradada  customerManeger.add() cagrilinca customerDal.Add(); calisir customerDal icinde OracleCustomerDal sinifi var.


        // IKINCI YONTEM
        CustomerManeger customerManeger = new CustomerManeger(new MySqlCustomerDal());
        customerManeger.add();

    }
}
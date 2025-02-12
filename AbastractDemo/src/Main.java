//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerMeneger customerMeneger1 = new CustomerMeneger();
        customerMeneger1.databaseManeger = new OracleDatabaseMeneger();//databaseMeneger ozelligine OracleDatabaseMeneger atandi
        customerMeneger1.getCustomers();//customerMeneger in icindeki getCustomers metodu cagrildiginda databaseManeger a atanan sinif kodlari calisir

        CustomerMeneger customerMeneger2 = new CustomerMeneger();
        customerMeneger2.databaseManeger = new MySqlDatabaseMeneger();
        customerMeneger2.getCustomers();
    }
}
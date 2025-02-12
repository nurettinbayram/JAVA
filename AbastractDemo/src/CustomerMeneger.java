public class CustomerMeneger {

    BaseDatabaseManeger databaseManeger;//BaseDatabaseMeneger tutunde databasemeneger adinda bir veri olusturduk

    public void  getCustomers(){
        databaseManeger.getData();//BaseDatabaseMeneger'i extend edilen tum siniflar kullanilabilir
    }
}

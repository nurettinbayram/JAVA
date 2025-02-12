public class MySqlCustomerDal implements ICustomerDal , IRepostory{//iki ayri class implements edildi
    @Override
    public void Add() {
        System.out.println("MySql eklendi.");
    }
}

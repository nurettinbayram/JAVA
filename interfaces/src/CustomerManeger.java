public class CustomerManeger {

    //BIRINCI YONTEM
//    ICustomerDal customerDal;
//    public  void  add(){
//        customerDal.Add();
//    }

    //IKINCI YONTEM
    private  ICustomerDal customerDal;

    public  CustomerManeger(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }

    public void  add(){
        customerDal.Add();
    }
}

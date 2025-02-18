public class ProductValidator {
    static {
        System.out.println("static yapici blogu calisti");
    }

    public  ProductValidator(){
        System.out.println("Yapici Block static durumlarda cakismaz.");
    }
    public static   boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

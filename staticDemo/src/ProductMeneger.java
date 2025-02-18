public class ProductMeneger {
    public void  add(Product product){
//        ProductValidator validator =new ProductValidator();
//        if (validator.isValid(product)){
//            System.out.println(product.name + " Veritabanina eklendi");
//        }
//        else {
//            System.out.println(product.name + " veri tabanina eklenemedi. Sorun olustu");
//        }

        if (ProductValidator.isValid(product)){
            //hemen yukaridaki ornekte isValid metodu static degilken kullanimi
            // normal bir kullanimda ama eger metodu static yaparsak Class new`lenmeden nokta ile
            // cagrilabilir ProductValidator.isValid(product)
            // bu durumlarda yapici block contracter blogu calismaz new`lenme durumunda calisir
            // egerki staticler icin bir yapici block calisilmasini isteniyorsa static{..} seklinde bir metod eklenmeli
            // ama static disindaki diger mmetodlara erismek icin ise class new`lenmesi lazim
            System.out.println(product.name + " Veritabanina eklendi");
        }
        else {
            System.out.println(product.name + " veri tabanina eklenemedi. Sorun olustu");
        }
    }
}

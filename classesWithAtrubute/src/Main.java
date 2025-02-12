//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product =new Product();
        product.setName("laptop");
        product.setDescription("asus computer");
        product.setId(1);
        product.setPrice(1000);
        product.setStockAmount(3);

        ProductMeneger producutManeger = new ProductMeneger();//bu bolumde new ile sinif olusturdugumuz icin bu siniftaki yapici blok cakisir otomatikmen
        producutManeger.Add(product);

        System.out.println(product.getKod());
    }
}
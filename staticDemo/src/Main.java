//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Ana class`lar static olmazlar
    public static void main(String[] args) {
        //static olayi main metoduna baska yerden ulasmamis icin main classi new`lenemez

        ProductMeneger meneger = new ProductMeneger();
        Product product = new Product();
        product.name="Mouse";
        product.price=10;

        meneger.add(product);
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnectin();
    }
}
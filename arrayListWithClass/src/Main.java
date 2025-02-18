import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Nurettin", "Bayram"));
        customers.add(new Customer(2, "Muhammed", "Bayram"));
        customers.add(new Customer(2, "Salih", "Bayram"));

        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }
    }
}
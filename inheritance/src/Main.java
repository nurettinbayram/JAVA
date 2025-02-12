//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.firstName="nurettin"; //first name aslinda customer icinde yok person sinifindan aldik
        employee.firstName="muhammed"; //first name aslinda employee icinde yok person sinifindan aldik
        employee.salary=2000;
        customer.email="fakhan@gmail.com";

        System.out.println(customer.firstName + " emailin " + customer.email);
        System.out.println(employee.firstName + " maasin " + employee.salary);


    }
}
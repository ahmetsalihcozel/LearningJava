package ArrayListWithClass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(12,"Ahmet Salih", "Cozel"));
        customers.add(new Customer(13,"Melike", "Dogru"));
        customers.add(new Customer(14,"Ali", "Kursun"));

        customers.removeIf(customer -> customer.id == 12);

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }

    };  
    
}

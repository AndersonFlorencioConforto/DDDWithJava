import entities.Address;
import entities.Customer;
import entities.Item;
import entities.Order;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {

        var address = new Address("Rua","SP","BR");
        var customer = new Customer(1L,"Anderson");
        customer.setAddress(address);
        customer.activate();

        var itemUm = new Item(1L,"PS5",4500.0);
        var itemDois = new Item(1L,"PS5 Digital",4000.0);
        var order = new Order(1L,1L, Arrays.asList(itemUm,itemDois));

        System.out.println(order);
    }
}

package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long id;
    private Long customerId;
    private List<Item> itens = new ArrayList<>();

    public Order(Long id, Long customerId, List<Item> itens) {
        this.id = id;
        this.customerId = customerId;
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", itens=" + itens +
                '}';
    }
}

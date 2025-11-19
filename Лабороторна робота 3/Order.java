package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id)
                .append(" for customer ").append(customer)
                .append("\n------------------\n");

        double sum = 0.0;

        for (int i = 0; i < cart.getSize(); i++) {
            Item item = cart.getItem(i);
            sum += item.getPrice();

            builder.append("Item id: ").append(item.getId())
                    .append(" name: ").append(item.getName())
                    .append(" price: ").append(item.getPrice())
                    .append("\n");
        }

        builder.append("------------------\nTotal sum: ")
                .append(sum);

        return builder.toString();
    }
}


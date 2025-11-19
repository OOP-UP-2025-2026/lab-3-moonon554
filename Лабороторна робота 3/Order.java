public class Order {
    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {
        StringBuilder b = new StringBuilder();

        b.append("Order #").append(id)
                .append(" for ").append(customer)
                .append("\n------------------\n");

        double sum = 0;

        for (Item item : cart.getItems()) {
            b.append(item.toString());
            sum += item.getPrice();
        }

        b.append("------------------\n");
        b.append("Total: ").append(sum);

        return b.toString();
    }
}

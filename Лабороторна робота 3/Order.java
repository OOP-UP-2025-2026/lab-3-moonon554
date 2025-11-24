public class Order {
    private static int idCounter = 1; // Лічильник для ID замовлень
    private int orderId;
    private Cart cart;
    private String customerName;

    public Order(String customerName, Cart cart) {
        this.orderId = idCounter++;
        this.customerName = customerName;
        this.cart = cart;
    }

    public void showOrder() {
        System.out.println("\n=== ЗАМОВЛЕННЯ №" + orderId + " ===");
        System.out.println("Клієнт: " + customerName);
        cart.showCart();
        System.out.println("======================\n");
    }
}

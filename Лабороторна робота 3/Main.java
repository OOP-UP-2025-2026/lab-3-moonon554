public class Main {
    public static void main(String[] args) {

        System.out.println("=== BOX ===");
        Box b = new Box(2, 3, 4);
        System.out.println("Surface area: " + b.surfaceArea());
        System.out.println("Lateral area: " + b.lateralSurfaceArea());
        System.out.println("Volume: " + b.volume());

        System.out.println("\n=== CART ===");
        Cart cart = new Cart(10);

        cart.add(new Item(1, "Laptop", 25000));
        cart.add(new Item(2, "Phone", 18000));
        cart.add(new Item(3, "TV", 30000));

        System.out.println(cart);

        cart.removeById(2);
        System.out.println(cart);

        Order order = new Order(1, "John");
        System.out.println(order.formOrderBill(cart));

        System.out.println("\n=== STACK ===");
        IntStack st = new IntStack();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top: " + st.peek());
        System.out.println("Pop: " + st.pop());
        System.out.println("Size: " + st.size());
    }
}

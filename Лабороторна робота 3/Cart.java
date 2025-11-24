import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // Видалення товару (корисно мати)
    public void removeItem(String itemName) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
    }

    public double getTotal() {
        double sum = 0;
        for (Item item : items) {
            sum += item.totalPrice();
        }
        return sum;
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Кошик порожній.");
            return;
        }
        System.out.println("--- Вміст кошика ---");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("--------------------");
        System.out.println("Всього до сплати: " + getTotal());
    }
}

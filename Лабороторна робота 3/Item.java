import java.util.Scanner;

public class Item {
    private String name;
    private double price;
    private int quantity;

    // Конструктор
    public Item(String name, double price, int quantity) {
        this.name = name;
        // Використовуємо сетери для перевірки даних ще при створенні
        setPrice(price);
        setQuantity(quantity);
    }

    // Гетери
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Сетери з валідацією (ІНКАПСУЛЯЦІЯ)
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Помилка: ціна не може бути від'ємною! Встановлено 0.");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Помилка: кількість не може бути від'ємною! Встановлено 0.");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public double totalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s | Ціна: %.2f | Кількість: %d | Сума: %.2f", 
                             name, price, quantity, totalPrice());
    }
}

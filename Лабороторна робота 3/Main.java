import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Вітаємо в магазині!");
        System.out.print("Введіть ваше ім'я: ");
        String name = sc.nextLine();

        Cart cart = new Cart();
        boolean adding = true;

        while (adding) {
            System.out.println("\n--- Додавання товару ---");
            
            System.out.print("Назва товару: ");
            String itemName = sc.nextLine();

            double price = 0;
            while (true) {
                System.out.print("Ціна за одиницю: ");
                try {
                    price = Double.parseDouble(sc.nextLine());
                    if (price < 0) System.out.println("Ціна має бути додатною!");
                    else break;
                } catch (NumberFormatException e) {
                    System.out.println("Будь ласка, введіть число.");
                }
            }

            int quantity = 0;
            while (true) {
                System.out.print("Кількість: ");
                try {
                    quantity = Integer.parseInt(sc.nextLine());
                    if (quantity < 0) System.out.println("Кількість має бути додатною!");
                    else break;
                } catch (NumberFormatException e) {
                    System.out.println("Будь ласка, введіть ціле число.");
                }
            }

            // Створення об'єкта і додавання в кошик
            Item newItem = new Item(itemName, price, quantity);
            cart.addItem(newItem);
            System.out.println("Товар додано!");

            System.out.print("\nБажаєте додати ще товар? (так/ні): ");
            String answer = sc.nextLine().trim().toLowerCase();
            if (answer.equals("ні") || answer.equals("no") || answer.equals("-")) {
                adding = false;
            }
        }

        // Формування замовлення
        Order order = new Order(name, cart);
        order.showOrder();
        
        sc.close();
    }
}

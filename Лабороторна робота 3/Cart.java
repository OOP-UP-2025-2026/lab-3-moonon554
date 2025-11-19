import java.util.Arrays;

public class Cart {
    private Item[] items;
    private int size;

    public Cart(int capacity) {
        this.items = new Item[capacity];
    }

    public void add(Item item) {
        if (size == items.length)
            throw new RuntimeException("Cart is full!");

        items[size++] = item;
    }

    public void removeById(long id) {
        int index = find(id);
        if (index == -1) return;

        for (int i = index; i < size - 1; i++)
            items[i] = items[i + 1];

        items[size - 1] = null;
        size--;
    }

    private int find(long id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) return i;
        }
        return -1;
    }

    public Item[] getItems() {
        return Arrays.copyOf(items, size);
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Cart{" + Arrays.toString(getItems()) + "}\n";
    }
}

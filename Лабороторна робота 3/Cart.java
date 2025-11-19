package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(int size) {
        this.contents = new Item[size];
        this.index = 0;
    }

    public void add(Item item) {
        if (isCartFull()) return;
        this.contents[index] = item;
        this.index++;
    }

    public void removeById(long id) {
        int foundIndex = findItemIndexById(id);

        if (foundIndex == -1) return;

        // пересунути вліво
        for (int i = foundIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index - 1] = null;
        index--;
    }

    private int findItemIndexById(long id) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == id) return i;
        }
        return -1;
    }

    public boolean isCartFull() {
        return index == contents.length;
    }

    public int getSize() {
        return this.index;
    }

    public Item getItem(int i) {
        return this.contents[i];
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                "}\n";
    }
}


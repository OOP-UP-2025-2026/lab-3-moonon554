public class IntStack {
    private int[] data;
    private int size;

    public IntStack() {
        data = new int[5];
    }

    public void push(int value) {
        if (size == data.length)
            expand();
        data[size++] = value;
    }

    private void expand() {
        int[] newArr = new int[data.length * 2];
        System.arraycopy(data, 0, newArr, 0, data.length);
        data = newArr;
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty!");
        return data[--size];
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty!");
        return data[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }
}

package _12_array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        System.out.println("Enter shopping list elements and once done enter exit");
        Scanner sc = new Scanner(System.in);
        String shoppingItem = sc.nextLine();
        CustomArray array = new CustomArray();
        do {
            //store the item list
            array.add(shoppingItem);
            shoppingItem = sc.nextLine();
        } while (!shoppingItem.equals("exit"));
        System.out.println("Shopping list");
        System.out.println(array);
    }
}

class CustomArray {

    private Object[] values;
    private int size;
    private int capacity = 5;

    public CustomArray() {
        values = new Object[capacity];
    }

    public void add(Object item) {
        if (size == capacity) {
            capacity *= 2;
            Object[] temp = new Object[capacity];
            for (int i = 0; i < size; i++) {
                temp[i] = values[i];
            }
            values = temp;
        }
        values[size++] = item;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "values=" + Arrays.toString(values) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}

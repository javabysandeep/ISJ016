package _17_collection;

public class Demo1CustomArrayList {
    public static void main(String[] args) {
        class ArrayList {
            Object[] values;
            int capacity = 10;
            int size = 0;

            ArrayList() {
                values = new Object[capacity];
            }

            ArrayList(int capacity) {
                if (capacity > 0) {
                    this.capacity = capacity;
                }
                values = new Object[this.capacity];
            }

            public void add(Object obj) {
                if (size >= capacity) {
                    capacity = (int) (capacity * 1.5 + 1);
                    Object[] temp = new Object[capacity];
                    for (int index = 0; index < size; index++) {
                        temp[index] = values[index];
                    }
                    values = temp;
                }
                values[size++] = obj;
            }

            public void print() {
                for (Object temp : values) {
                    System.out.println(temp);
                }
            }

            public int size() {
                return size;
            }

            public int getCapacity() {
                return capacity;
            }
        }

        ArrayList arrayList = new ArrayList(50);
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(500);
        arrayList.add(500);
        arrayList.add(500);
        arrayList.add(500);
        arrayList.add(500);
        arrayList.add(600);

        arrayList.print();
        System.out.println("size is " + arrayList.size);
        System.out.println("capacity is " + arrayList.capacity);
    }
}

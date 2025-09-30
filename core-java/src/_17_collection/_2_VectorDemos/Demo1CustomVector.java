package _17_collection._2_VectorDemos;

public class Demo1CustomVector {
    public static void main(String[] args) {
        class Vector {
            Object[] values;
            int capacity = 10;
            int size = 0;

            Vector() {
                values = new Object[capacity];
            }

            Vector(int capacity) {
                if (capacity > 0) {
                    this.capacity = capacity;
                }
                values = new Object[this.capacity];
            }

            public synchronized void add(Object obj) {
                if (size >= capacity) {
                    capacity = (int) (capacity * 2);
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

        Vector vector = new Vector(50);
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);
        vector.add(500);
        vector.add(500);
        vector.add(500);
        vector.add(500);
        vector.add(500);
        vector.add(500);
        vector.add(600);

        vector.print();
        System.out.println("size is " + vector.size);
        System.out.println("capacity is " + vector.capacity);
    }
}

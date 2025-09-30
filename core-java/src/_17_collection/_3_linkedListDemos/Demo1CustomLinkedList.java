package _17_collection._3_linkedListDemos;

public class Demo1CustomLinkedList {
    public static void main(String[] args) {
        class Node {
            Object data;
            Node next;
            Node previous;

            Node(Object obj) {
                this.data = obj;
            }

            Node() {
            }
        }
        class LinkedList {
            Node first;
            Node last;
            int size = 0;

            public void add(Object obj) {
                Node newNode = new Node(obj);
                if (first == null) {
                    first = newNode;
                    last = newNode;
                }
                first.next = newNode;
                last = newNode;
            }

            public void print() {

            }

            public int size() {
                return size;
            }


        }

        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(500);
        linkedList.add(500);
        linkedList.add(500);
        linkedList.add(500);
        linkedList.add(500);
        linkedList.add(600);

        linkedList.print();
        System.out.println("size is " + linkedList.size);
    }
}

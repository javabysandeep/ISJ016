package _17_collection._3_linkedListDemos;

import java.util.LinkedList;
import java.util.Vector;

public class Demo2LinkedList {
    public static void main(String[] args) {
        // multiple values --> homogeneous, heterogeneous, duplicate, null, insertion order
        LinkedList linkedList = new LinkedList(); // create the container
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);

        System.out.println(linkedList.toString());
        System.out.println("size of the linkedList "+linkedList.size());
        System.out.println("is linkedList empty "+linkedList.isEmpty());
        System.out.println("whether abc is present in the linkedList "+linkedList.contains("abc"));

    }
}

package _17_collection._3_linkedListDemos;

import java.util.Collections;
import java.util.LinkedList;

public class Demo7LinkedListSort {
    public static void main(String[] args) {
        //sorting ---> comparison --> homogeneous data
        LinkedList linkedList = new LinkedList();
        linkedList.add("vishnu");
        linkedList.add("suyash");
        linkedList.add("komal");
        linkedList.add("shital");
        linkedList.add("vaishnwai");
        linkedList.add("rutuja");

        System.out.println("Before sorting");
        System.out.println(linkedList);

        Collections.sort(linkedList);
        System.out.println("after sorting");
        System.out.println(linkedList);

    }
}

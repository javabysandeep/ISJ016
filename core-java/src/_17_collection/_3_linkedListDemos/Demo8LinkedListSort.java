package _17_collection._3_linkedListDemos;

import java.util.Collections;
import java.util.LinkedList;

public class Demo8LinkedListSort {
    public static void main(String[] args) {
        //sorting ---> comparison --> homogeneous data
        LinkedList linkedList = new LinkedList();
        linkedList.add(88);
        linkedList.add(67);
        linkedList.add(70);
        linkedList.add(91);
        System.out.println("Before sorting");
        System.out.println(linkedList);

        Collections.sort(linkedList);
        System.out.println("after sorting");
        System.out.println(linkedList);


    }
}

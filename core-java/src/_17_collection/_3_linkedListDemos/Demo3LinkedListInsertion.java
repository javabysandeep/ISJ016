package _17_collection._3_linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo3LinkedListInsertion {
    public static void main(String[] args) {
        //create a container
        LinkedList linkedList = new LinkedList();
        System.out.println("when list is created " + linkedList);

        //insertion
        //01. add single element at the end of list
        linkedList.add(100);
        System.out.println("when single element added at the end of list " + linkedList);

        //02. add single element at a specified index
        linkedList.add(0, 200);
        System.out.println("when single element added at the specific index " + linkedList);

        //03. add multiple elements at the end of list
        ArrayList listOfElements = new ArrayList<>();
        listOfElements.add(1);
        listOfElements.add(2);
        listOfElements.add(3);

        linkedList.addAll(listOfElements);
        System.out.println("when list of elements added at the end " + linkedList);

        //04. add multiple elements at a specified index
        linkedList.addAll(0, listOfElements);
        System.out.println("when list of elements added at a specific index " + linkedList);


    }
}

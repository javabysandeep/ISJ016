package _17_collection._2_VectorDemos;

import java.util.ArrayList;
import java.util.Vector;

public class Demo3VectorInsertion {
    public static void main(String[] args) {
        //create a container
        Vector vector = new Vector();
        System.out.println("when list is created " + vector);

        //insertion
        //01. add single element at the end of list
        vector.add(100);
        System.out.println("when single element added at the end of list " + vector);

        //02. add single element at a specified index
        vector.add(0, 200);
        System.out.println("when single element added at the specific index " + vector);

        //03. add multiple elements at the end of list
        ArrayList listOfElements = new ArrayList<>();
        listOfElements.add(1);
        listOfElements.add(2);
        listOfElements.add(3);

        vector.addAll(listOfElements);
        System.out.println("when list of elements added at the end " + vector);

        //04. add multiple elements at a specified index
        vector.addAll(0, listOfElements);
        System.out.println("when list of elements added at a specific index " + vector);


    }
}

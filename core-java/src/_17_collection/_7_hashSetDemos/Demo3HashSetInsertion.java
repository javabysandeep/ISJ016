package _17_collection._7_hashSetDemos;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo3HashSetInsertion {
    public static void main(String[] args) {
        //no index concept
        //create a container
        HashSet hashSet = new HashSet();
        System.out.println("when set is created " + hashSet);

        //insertion
        //01. add single element at the end
        hashSet.add(100);
        System.out.println("when single element added at the end " + hashSet);

        //02. add multiple elements at the end
        ArrayList listOfElements = new ArrayList<>();
        listOfElements.add(1);
        listOfElements.add(2);
        listOfElements.add(3);

        hashSet.addAll(listOfElements);
        System.out.println("when list of elements added at the end " + hashSet);

    }
}

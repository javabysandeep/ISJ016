package _17_collection._9_treeSetDemos;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2TreeSetInsertion {
    public static void main(String[] args) {
        //no index concept
        //create a container
        Set set = new TreeSet();
        System.out.println("when set is created " + set);

        //insertion
        //01. add single element at the end
        set.add(100);
        System.out.println("when single element added at the end " + set);

        //02. add multiple elements at the end
        ArrayList listOfElements = new ArrayList<>();
        listOfElements.add(1);
        listOfElements.add(2);
        listOfElements.add(3);

        set.addAll(listOfElements);
        System.out.println("when list of elements added at the end " + set);

    }
}

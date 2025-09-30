package _17_collection._1_arrayListDemos;

import java.util.ArrayList;

public class Demo3ArrayListInsertion {
    public static void main(String[] args) {
        //create a container
        ArrayList arrayList = new ArrayList();
        System.out.println("when list is created " + arrayList);

        //insertion
        //01. add single element at the end of list
        arrayList.add(100);
        System.out.println("when single element added at the end of list " + arrayList);

        //02. add single element at a specified index
        arrayList.add(0, 200);
        System.out.println("when single element added at the specific index " + arrayList);

        //03. add multiple elements at the end of list
        ArrayList listOfElements = new ArrayList<>();
        listOfElements.add(1);
        listOfElements.add(2);
        listOfElements.add(3);

        arrayList.addAll(listOfElements);
        System.out.println("when list of elements added at the end " + arrayList);

        //04. add multiple elements at a specified index
        arrayList.addAll(0, listOfElements);
        System.out.println("when list of elements added at a specific index " + arrayList);


    }
}

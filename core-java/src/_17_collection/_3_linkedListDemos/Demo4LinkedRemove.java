package _17_collection._3_linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo4LinkedRemove {
    public static void main(String[] args) {
        //create a container
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add("abc");

        System.out.println("list at the time of creation " + linkedList);

        //01. remove single element
        linkedList.remove("abc");
        System.out.println("after single specified element removal " + linkedList);

        //02. remove single element at a specific index
        linkedList.remove(0);
        System.out.println("after single specified element removal from index " + linkedList);

        //03. remove multiple elements
        ArrayList removalList = new ArrayList();
        removalList.add(30);
        removalList.add(40);

        linkedList.removeAll(removalList);
        System.out.println("after list of elements removed " + linkedList);

        linkedList.add("x");
        linkedList.add("y");
        linkedList.add("z");

        //04. keep specified elements and remove rest
        ArrayList selectList = new ArrayList<>();
        selectList.add("x");

        linkedList.retainAll(selectList);
        System.out.println("selected people " + linkedList);

        //05. remove all elements
        linkedList.clear();
        System.out.println("cleared the list "+linkedList);


    }
}

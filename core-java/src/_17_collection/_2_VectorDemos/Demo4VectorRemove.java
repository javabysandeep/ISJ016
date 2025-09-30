package _17_collection._2_VectorDemos;

import java.util.ArrayList;
import java.util.Vector;

public class Demo4VectorRemove {
    public static void main(String[] args) {
        //create a container
        Vector vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add("abc");

        System.out.println("list at the time of creation " + vector);

        //01. remove single element
        vector.remove("abc");
        System.out.println("after single specified element removal " + vector);

        //02. remove single element at a specific index
        vector.remove(0);
        System.out.println("after single specified element removal from index " + vector);

        //03. remove multiple elements
        ArrayList removalList = new ArrayList();
        removalList.add(30);
        removalList.add(40);

        vector.removeAll(removalList);
        System.out.println("after list of elements removed " + vector);

        vector.add("x");
        vector.add("y");
        vector.add("z");

        //04. keep specified elements and remove rest
        ArrayList selectList = new ArrayList<>();
        selectList.add("x");

        vector.retainAll(selectList);
        System.out.println("selected people " + vector);

        //05. remove all elements
        vector.clear();
        System.out.println("cleared the list "+vector);


    }
}

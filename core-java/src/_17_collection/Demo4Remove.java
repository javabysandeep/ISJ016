package _17_collection;

import java.util.ArrayList;

public class Demo4Remove {
    public static void main(String[] args) {
        //create a container
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add("abc");

        System.out.println("list at the time of creation " + arrayList);

        //01. remove single element
        arrayList.remove("abc");
        System.out.println("after single specified element removal " + arrayList);

        //02. remove single element at a specific index
        arrayList.remove(0);
        System.out.println("after single specified element removal from index " + arrayList);

        //03. remove multiple elements
        ArrayList removalList = new ArrayList();
        removalList.add(30);
        removalList.add(40);

        arrayList.removeAll(removalList);
        System.out.println("after list of elements removed " + arrayList);

        arrayList.add("x");
        arrayList.add("y");
        arrayList.add("z");

        //04. keep specified elements and remove rest
        ArrayList selectList = new ArrayList<>();
        selectList.add("x");

        arrayList.retainAll(selectList);
        System.out.println("selected people " + arrayList);

        //05. remove all elements
        arrayList.clear();
        System.out.println("cleared the list "+arrayList);


    }
}

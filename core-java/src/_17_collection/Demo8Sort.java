package _17_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo8Sort {
    public static void main(String[] args) {
        //sorting ---> comparison --> homogeneous data
        ArrayList arrayList = new ArrayList();
        arrayList.add(88);
        arrayList.add(67);
        arrayList.add(70);
        arrayList.add(91);
        System.out.println("Before sorting");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println("after sorting");
        System.out.println(arrayList);


    }
}

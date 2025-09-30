package _17_collection._1_arrayListDemos;

import java.util.ArrayList;

public class Demo2ArrayList {
    public static void main(String[] args) {
        // multiple values --> homogeneous, heterogeneous, duplicate, null, insertion order
        ArrayList arrayList = new ArrayList(); // create the container
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        System.out.println(arrayList.toString());
        System.out.println("size of the arraylist "+arrayList.size());
        System.out.println("is arrayList empty "+arrayList.isEmpty());
        System.out.println("whether abc is present in the arrayList "+arrayList.contains("abc"));

    }
}

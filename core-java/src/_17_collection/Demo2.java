package _17_collection;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        // multiple values --> homoegenous, heterogeneous, dduplicate, null, insertion order
        ArrayList arrayList = new ArrayList();
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

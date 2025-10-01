package _17_collection._8_linkedHashSetDemos;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1LinkedHashSet {
    public static void main(String[] args) {
        // multiple values --> homogeneous, heterogeneous, unique, null(1), insertion order, no sorting order
        Set set = new LinkedHashSet(); // create the container

        set.add(10);
        set.add(10);
        set.add(10);
        set.add("abc");
        set.add("abc");
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(null);

        System.out.println(set.toString());
        System.out.println("size of the set " + set.size());
        System.out.println("is set empty " + set.isEmpty());
        System.out.println("whether abc is present in the set " + set.contains("abc"));

    }
}

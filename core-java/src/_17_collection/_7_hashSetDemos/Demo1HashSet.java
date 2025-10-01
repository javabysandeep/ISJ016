package _17_collection._7_hashSetDemos;

import java.util.HashSet;

public class Demo1HashSet {
    public static void main(String[] args) {
        // multiple values --> homogeneous, heterogeneous, unique, null(1), no insertion order, no sorting order
        HashSet hashSet = new HashSet(); // create the container

        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet.toString());
        System.out.println("size of the hashSet " + hashSet.size());
        System.out.println("is hashSet empty " + hashSet.isEmpty());
        System.out.println("whether abc is present in the hashSet " + hashSet.contains("abc"));

    }
}

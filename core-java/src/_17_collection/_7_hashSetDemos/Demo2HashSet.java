package _17_collection._7_hashSetDemos;

import java.util.HashSet;

public class Demo2HashSet {
    public static void main(String[] args) {
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
        System.out.println("size of the arraylist "+hashSet.size());
        System.out.println("is hashSet empty "+hashSet.isEmpty());
        System.out.println("whether abc is present in the hashSet "+hashSet.contains("abc"));

    }
}

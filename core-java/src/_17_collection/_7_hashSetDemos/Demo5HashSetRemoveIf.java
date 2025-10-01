package _17_collection._7_hashSetDemos;

import java.util.HashSet;
import java.util.function.Predicate;

public class Demo5HashSetRemoveIf {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        hashSet.add(15);
        System.out.println("set at the creation " + hashSet);

        //remove elements based on condition
        // boolean test(T t);
        Predicate<Integer> evenTest = integer -> integer % 2 == 0;

        //remove all even numbers
        hashSet.removeIf(evenTest);
        System.out.println("after removal " + hashSet);


    }
}

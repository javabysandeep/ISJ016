package _17_collection._9_treeSetDemos;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Demo5TreeSetRemoveIf {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        System.out.println("set at the creation " + set);

        //remove elements based on condition
        // boolean test(T t);
        Predicate<Integer> evenTest = integer -> integer % 2 == 0;

        //remove all even numbers
        set.removeIf(evenTest);
        System.out.println("after removal " + set);


    }
}

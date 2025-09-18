package _17_collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo5RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println("list at the creation " + list);

        //remove elements based on condition
        Predicate<Integer> evenTest = x -> x % 2 == 0;

        //remove all even numbers
        list.removeIf(evenTest);
        System.out.println("after removal " + list);


        //convert the list into array
        Object[] array = list.toArray();



    }
}

package _17_collection._2_VectorDemos;

import java.util.Vector;
import java.util.function.Predicate;

public class Demo5VectorRemoveIf {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println("list at the creation " + list);

        //remove elements based on condition
        // boolean test(T t);
        Predicate<Integer> evenTest = integer -> integer % 2 == 0;

        //remove all even numbers
        list.removeIf(evenTest);
        System.out.println("after removal " + list);


        //convert the list into array
        Object[] array = list.toArray();


    }
}

package _17_collection._8_linkedHashSetDemos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Demo6LinkedHashSetRetrieval {
    public static void main(String[] args) {
        /*
         *  way 01 : using enhanced for loop
         *  way 02 : using java 8 forEach() method
         *  way 03 : using cursor i.e. Iterator
         * */

        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);


        //01. read all elements from the given set --> enhanced for loop
        System.out.println("\n retrieve using enhanced for loop");
        for (int temp : set) {
            System.out.print(temp + " ");
        }

        //02. read all elements from the given set --> java 8 forEach method
        System.out.println("\n retrieve using java 8 forEach method");
        Consumer<Integer> consumer = input -> System.out.println(input);
        // void accept(T t);
        //forEach internally runs the for loop and calls the accept method of provided Consumer
        set.forEach(consumer);


        //03. retrieve the elements of set using Iterator
        System.out.println("retrieve the elements of set using Iterator");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


    }
}

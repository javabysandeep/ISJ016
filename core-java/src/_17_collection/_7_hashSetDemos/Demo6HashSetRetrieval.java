package _17_collection._7_hashSetDemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo6HashSetRetrieval {
    public static void main(String[] args) {
        /*
        *  way 01 : using enhanced for loop
        *  way 02 : using java 8 forEach() method
        *  way 03 : using cursor i.e. Iterator
        * */

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);

        //01. get method is not there
      /*  System.out.println(set.get(0));//returns element at a specified index
        System.out.println(set.getFirst());//returns first element
        System.out.println(set.getLast());//returns last element*/


       /* //02. read all elements from the given set --> traditional for loop
        System.out.println(" retrieve using traditional for loop");
        for (int index = 0; index < set.size(); index++) {
            System.out.print(set.get(index) + " ");
        }*/

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


        //03. read all elements from the given set --> java 8 forEach method --> method reference
        System.out.println("\n retrieve using java 8 forEach method");
        Consumer<Integer> consumer1 = System.out::println;
        //forEach internally runs the for loop and calls the accept method of provided Consumer
        set.forEach(consumer1);

        //set.forEach(System.out::println);


        //04. retrieve the elements of set using Iterator
        System.out.println("retrieve the elements of set using Iterator");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        /*//07. not applicable --> retrieve the elements of set using ListIterator
        System.out.println("\n retrieve the elements of set using ListIterator");
        ListIterator<Integer> listIterator = set.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }*/


    }
}

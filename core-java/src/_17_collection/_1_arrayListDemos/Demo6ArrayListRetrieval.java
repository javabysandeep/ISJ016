package _17_collection._1_arrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Demo6ArrayListRetrieval {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        //01. get method
        System.out.println(list.get(0));//returns element at a specified index
        System.out.println(list.getFirst());//returns first element
        System.out.println(list.getLast());//returns last element


        //02. read all elements from the given list --> traditional for loop
        System.out.println(" retrieve using traditional for loop");
        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index) + " ");
        }

        //03. read all elements from the given list --> enhanced for loop
        System.out.println("\n retrieve using enhanced for loop");
        for (int temp : list) {
            System.out.print(temp + " ");
        }

        //04. read all elements from the given list --> java 8 forEach method
        System.out.println("\n retrieve using java 8 forEach method");
        Consumer<Integer> consumer = input -> System.out.println(input);
                // void accept(T t);
        //forEach internally runs the for loop and calls the accept method of provided Consumer
        list.forEach(consumer);


        //05. read all elements from the given list --> java 8 forEach method --> method reference
        System.out.println("\n retrieve using java 8 forEach method");
        Consumer<Integer> consumer1 = System.out::println;
        //forEach internally runs the for loop and calls the accept method of provided Consumer
        list.forEach(consumer1);

        //list.forEach(System.out::println);


        //06. retrieve the elements of list using Iterator
        System.out.println("retrieve the elements of list using Iterator");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        //07. retrieve the elements of list using ListIterator
        System.out.println("\n retrieve the elements of list using ListIterator");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }


    }
}

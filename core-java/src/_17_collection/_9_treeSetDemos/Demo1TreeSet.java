package _17_collection._9_treeSetDemos;

import java.util.Set;
import java.util.TreeSet;

public class Demo1TreeSet {
    public static void main(String[] args) {
        //homogeneous, unique, not null, sorting order
        Set set = new TreeSet(); // create the container
        set.add(10);
        set.add(10);
        set.add(10);
     /*   set.add("abc");
        set.add("abc");*/
      /*  set.add(null);
        set.add(null);
        set.add(null);
        set.add(null);*/

        System.out.println(set.toString());
        System.out.println("size of the set " + set.size());
        System.out.println("is set empty " + set.isEmpty());
        System.out.println("whether abc is present in the set " + set.contains("abc"));//ClassCastException

    }
}

package _17_collection._8_linkedHashSetDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo4LinkedHashSetRemove {
    public static void main(String[] args) {
        //create a container
        Set set = new LinkedHashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add("abc");
        System.out.println("set at the time of creation " + set);

        //01. remove single element by specifying
        set.remove("abc");
        System.out.println("after single specified element removal " + set);

        set.remove(10);
        System.out.println("after single specified element removal" + set);

        //03. remove multiple elements
        ArrayList removalList = new ArrayList();
        removalList.add(30);
        removalList.add(40);

        set.removeAll(removalList);
        System.out.println("after set of elements removed " + set);

        set.add("x");
        set.add("y");
        set.add("z");

        //04. keep specified elements and remove rest
        ArrayList selectList = new ArrayList<>();
        selectList.add("x");

        set.retainAll(selectList);
        System.out.println("selected people " + set);

        //05. remove all elements
        set.clear();
        System.out.println("cleared the set " + set);


    }
}

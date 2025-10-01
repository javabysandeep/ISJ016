package _17_collection._9_treeSetDemos;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo3TreeSetRemove {
    public static void main(String[] args) {
        //create a container
        Set set = new TreeSet();
        set.add(10);
        set.add(200);
        set.add(33);
        set.add(41);
        set.add(50);
        set.add(30);
        set.add(20);
        System.out.println("set at the time of creation " + set);

        //01. remove single element by specifying
        set.remove(10);
        System.out.println("after single specified element removal " + set);


        //02. remove multiple elements
        ArrayList removalList = new ArrayList();
        removalList.add(30);
        removalList.add(50);

        set.removeAll(removalList);
        System.out.println("after set of elements removed " + set);

        //04. keep specified elements and remove rest
        ArrayList selectList = new ArrayList<>();
        selectList.add(200);

        set.retainAll(selectList);
        System.out.println("selected people " + set);

        //05. remove all elements
        set.clear();
        System.out.println("cleared the set " + set);


    }
}

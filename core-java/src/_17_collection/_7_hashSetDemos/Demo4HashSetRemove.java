package _17_collection._7_hashSetDemos;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo4HashSetRemove {
    public static void main(String[] args) {
        //create a container
        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add("abc");
        System.out.println("set at the time of creation " + hashSet);

        //01. remove single element by specifying
        hashSet.remove("abc");
        System.out.println("after single specified element removal " + hashSet);

        hashSet.remove(10);
        System.out.println("after single specified element removal" + hashSet);

        //03. remove multiple elements
        ArrayList removalList = new ArrayList();
        removalList.add(30);
        removalList.add(40);

        hashSet.removeAll(removalList);
        System.out.println("after set of elements removed " + hashSet);

        hashSet.add("x");
        hashSet.add("y");
        hashSet.add("z");

        //04. keep specified elements and remove rest
        ArrayList selectList = new ArrayList<>();
        selectList.add("x");

        hashSet.retainAll(selectList);
        System.out.println("selected people " + hashSet);

        //05. remove all elements
        hashSet.clear();
        System.out.println("cleared the set " + hashSet);


    }
}

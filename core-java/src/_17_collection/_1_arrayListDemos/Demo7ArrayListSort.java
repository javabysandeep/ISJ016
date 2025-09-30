package _17_collection._1_arrayListDemos;

import java.util.ArrayList;
import java.util.Collections;

public class Demo7ArrayListSort {
    public static void main(String[] args) {
        //sorting ---> comparison --> homogeneous data
        ArrayList arrayList = new ArrayList();
        arrayList.add("vishnu");
        arrayList.add("suyash");
        arrayList.add("komal");
        arrayList.add("shital");
        arrayList.add("vaishnwai");
        arrayList.add("rutuja");

        System.out.println("Before sorting");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println("after sorting");
        System.out.println(arrayList);

    }
}

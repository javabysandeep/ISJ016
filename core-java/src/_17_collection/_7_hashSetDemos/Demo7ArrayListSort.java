package _17_collection._7_hashSetDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Demo7ArrayListSort {
    public static void main(String[] args) {
        //sorting ---> comparison --> homogeneous data
        HashSet hashSet = new HashSet();
        hashSet.add("vishnu");
        hashSet.add("suyash");
        hashSet.add("komal");
        hashSet.add("shital");
        hashSet.add("vaishnwai");
        hashSet.add("rutuja");

        System.out.println("Before sorting");
        System.out.println(hashSet);

        // Collections.sort(hashSet);// this is applicable for List implementations


    }
}

package ru.gds;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Дмитрий on 10.10.2016.
 */
public class MyClassMass {

    public static void main(String[] args) {
        String[] string = new String[]{"123"};
        System.out.println(string[0]);
        MyClassMass myClassMass = new MyClassMass();


    }

    public static void somMetod(String[] strings){
        System.out.println(strings[0]);
        strings[0] = "897 som";
        System.out.println(strings[0]);
    }
}



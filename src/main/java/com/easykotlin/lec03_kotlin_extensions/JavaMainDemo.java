package com.easykotlin.lec03_kotlin_extensions;

import java.util.Arrays;
import java.util.List;

public class JavaMainDemo {

    public static void main(String[] args) {
        String str = "This is a Java Demo";
        String convertedStr = MyUtils.convertSpace2Underscore(str);
        System.out.println(convertedStr);

        // "This is a Java Demo".convertSpace2Underscore();

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sumOfList = MyUtils.sumOfList(list);
        System.out.println(sumOfList);

        System.out.println(MyUtils.exe("ls -R"));
//        "ls -R".exe();
    }
}

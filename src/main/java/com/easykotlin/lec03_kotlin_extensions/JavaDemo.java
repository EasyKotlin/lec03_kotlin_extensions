package com.easykotlin.lec03_kotlin_extensions;

import java.util.ArrayList;
import java.util.List;

public class JavaDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        CollectionUtils.swap(list, 0, list.size() - 1);
        System.out.println(list);

        String str = "This Java Programming Language";
        String newStr = StringUtils.convertSpace2UnderScore(str);
        System.out.println(newStr);

        System.out.println(StringUtils.exe("ls -R"));
    }
}

package com.easykotlin.lec03_kotlin_extensions;

import java.util.List;

public class CollectionUtils {
    public static void swap(List<Integer> list, int src, int target) {
        int temp = list.get(src);
        list.set(src, list.get(target));
        list.set(target, temp);
    }
}

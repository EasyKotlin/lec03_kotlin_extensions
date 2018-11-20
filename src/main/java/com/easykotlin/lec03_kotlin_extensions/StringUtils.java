package com.easykotlin.lec03_kotlin_extensions;

public class StringUtils {
    public static String convertSpace2UnderScore(String src) {
        return src.replaceAll(" ", "_");
    }
}

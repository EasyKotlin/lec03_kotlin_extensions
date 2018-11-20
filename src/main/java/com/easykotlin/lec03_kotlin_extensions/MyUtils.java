package com.easykotlin.lec03_kotlin_extensions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class MyUtils {

    /**
     * 把字符串中空白字符转换成 _
     */
    public static String convertSpace2Underscore(String s) {
        return s.replaceAll(" ", "_");
    }


    /**
     * 获取一个字符串的首字符
     */
    public static String firstChar(String s) {
        if (s != null && s.length() > 0) {
            return s.charAt(0) + "";
        }
        return null;
    }

    /**
     * 返回 List 元素的和
     *
     * @param list
     * @return
     */
    public static int sumOfList(List<Integer> list) {
        int sum = 0;
        for (int e : list) {
            sum += e;
        }
        return sum;
    }

    /**
     * 执行 shell 命令行函数
     */

    public static String exe(String cmd) {
        try {
            Process p = Runtime.getRuntime().exec(cmd);
            InputStream ins = p.getInputStream();
            String lines = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(ins));
            String line;
            do {
                line = br.readLine();
                lines += line + "\n";
            } while (line != null);
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}

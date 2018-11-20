package com.easykotlin.lec03_kotlin_extensions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringUtils {
    public static String convertSpace2UnderScore(String src) {
        return src.replaceAll(" ", "_");
    }

    public static String exe(String cmd) {
        try {
            Process p = Runtime.getRuntime().exec(cmd);
            InputStream ins = p.getInputStream();
            InputStream es = p.getErrorStream();

            String inputLines = "";
            BufferedReader brIns = new BufferedReader(new InputStreamReader(ins));
            String line;

            do {
                line = brIns.readLine();
                inputLines += line + "\n";
            } while (line != null);

            String errorLines = "";
            BufferedReader brErr = new BufferedReader(new InputStreamReader(es));
            String errLine;
            do {
                errLine = brErr.readLine();
                errorLines += errLine + "\n";
            } while (errLine != null);

            return inputLines + "\n" + errorLines;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

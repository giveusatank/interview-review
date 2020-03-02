package com.interview.java.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexp {

    public static void main(String[] args) {


        boolean res1 = Pattern.matches("\\d{4}", "1234");
        System.out.println(res1);

        Pattern compile = Pattern.compile("[^0-9ABCDE]");
        Matcher matcher1 = compile.matcher("y3456u2AAbbs06das34sd");

        System.out.println("~~~");
        System.out.println(Pattern.matches("\\D{4}", "ABCD"));

        boolean matches = matcher1.matches();
        System.out.println(matches);

        while (matcher1.find()){
            System.out.print(matcher1.group()+"\t"+matcher1.start()+"\t"+matcher1.end());
            System.out.println();
        }

        String aaaa = matcher1.replaceFirst("AAAA");
        String bbbb = matcher1.replaceAll("BBBB");

    }
}

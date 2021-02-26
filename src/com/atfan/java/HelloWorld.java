package com.atfan.java;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World， Java！");
        System.out.println("java");
        String s1 = "java";
        String s2 = "java";
        String s6 = "";
        String s3 = s1 + "";
        String s7 = s1 + s6;
        String s8 = "java" + "";
        String s4 = new String("java");
        String s5 = new String("java");
        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb1 = sb.append("");
        System.out.println("s1 == s2:"+(s1 == s2));
        System.out.println("s1 == s3:"+(s1 == s3));
        System.out.println("s1 == s7:"+(s1 == s7));
        System.out.println("s1 == s8:"+(s1 == s8));
        System.out.println("s7 == s8:"+(s7 == s8));
        System.out.println("s3 == s7:"+(s3 == s7));
        System.out.println(s1 == s4);

        System.out.println(s4 == s5);
        System.out.println(sb == sb1);
        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s5));
        System.out.println(sb.equals(sb1));
    }
}

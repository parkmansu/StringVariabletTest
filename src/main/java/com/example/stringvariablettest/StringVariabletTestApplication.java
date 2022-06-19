package com.example.stringvariablettest;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringVariabletTestApplication {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";
        String str4 = new String("hello");

        System.out.println(str1==str2); //false
        System.out.println(str1==str3); //true
        System.out.println(str2==str4); //false

        System.out.println();

        String str5 = str1 + " world";
        System.out.println(str5); // [ hello world ]
        System.out.println(str5==str1); //false

        System.out.println();

        String str6 = str2 + " world";
        System.out.println(str6); // [ hello world ]
        System.out.println(str6==str2); //false

        System.out.println();

        StringBuffer str7 = new StringBuffer("hello");
        StringBuffer str8 = str7.append(" world");
        System.out.println(str8);  // [ hello world ]
        System.out.println(str7==str8); //true

        System.out.println();

        StringBuilder str9 = new StringBuilder("hello");
        StringBuilder str10 = str9.append(" world");
        System.out.println(str10);  // [ hello world ]
        System.out.println(str9==str10); //true

    }

}

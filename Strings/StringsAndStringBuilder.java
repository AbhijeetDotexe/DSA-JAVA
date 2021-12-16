package com.abhijeet.Strings;

public class StringsAndStringBuilder {
    public static void main(String[] args) {

        String name = "Lakshay";
        System.out.println(name);

        String a = "Priyanshu";
        System.out.println(a);

        a = "Abhijeet";
        System.out.println(a);
        String b= "Abhijeet";
        System.out.println(a == b);

        String name1 = new String("Lakshay");
        String name2 = new String("Lakshay");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));//This one checks the value inside both the objects

        System.out.println(name1.charAt(0));

        float e = 453.1234f;
        System.out.printf("Original Number is " +e+" and Number after formatting is %.2f",e);
        System.out.println();
        //It also rounds off the number

        String series = "";
        for (int i=0; i<26 ;i++){
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j <26 ; j++) {
            char ch = (char) ('a'+j);
                builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(15);//deleting p from it
        System.out.println(builder.toString());
    }
}

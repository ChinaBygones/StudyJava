package org.study.type;

public class Type {
    protected String a = "1";
    public static void main(String[] args){
//         int value_int = 1;
//         char value_char = Integer.toString(value_int).charAt(0);
//         System.out.println(value_char);
//         Type type = new Type();
//         System.out.println(type.a);
         int redix = 10;
         int value_int = 6;
         //整型转字符char
         char value_char = Character.forDigit(value_int,redix);
         System.out.println(value_char);
    }
}

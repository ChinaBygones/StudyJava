package org.study.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        System.out.println("Study List");

//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("pear");
//        list.add("apple");
//        list.add(1,"123");
//        list.remove(1);
//        list.remove("pear");
//        list.add(null);
//        list.set(1,"niubi");
//        int index = list.indexOf("apple");
//        int lastIndex = list.lastIndexOf("apple");
//        System.out.println(index);
//        System.out.println(lastIndex);
//        String second = list.get(1);
//        System.out.println(list);
//        System.out.println(second);
//
//        List<String> alist = List.of("A","B","C","D");
//        System.out.println(alist);

        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("apple");
        linkList.add("Mac");
        linkList.add("Studio");
        linkList.addFirst("first");
        linkList.addLast("last");
        linkList.remove(1);
        linkList.remove("apple");
        linkList.removeLast();
        linkList.removeFirst();
        linkList.set(1,"Mac book");
        System.out.println(linkList.get(1));
        System.out.println(linkList.indexOf("mac"));
        System.out.println(linkList);
    }
}

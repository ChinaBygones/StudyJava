package org.study.map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //创建map对象 sites
        HashMap<Integer,String> Sites = new HashMap<Integer,String>();
        //添加键值对
        Sites.put(1,"google");
        Sites.put(2,"Taobao");
        Sites.put(3,"Jingdong");
        Sites.put(4,"Zhihu");
//        Sites.remove(4);
//        Sites.clear();
        System.out.println(Sites.size());
        System.out.println(Sites);
        HashMap<String,String> Name = new HashMap<String,String>();
        Name.put("名字是：","小明");
        Name.put("年龄是","19");
        Name.put("家在：","河南");
        Name.put("喜欢","看书");
        System.out.println(Name);
        System.out.println(Sites.keySet());
        System.out.println(Sites.values());
        for (Integer i : Sites.keySet()){
            System.out.println("Key:"+i+" Value:"+Sites.get(i));
        }

        for (String value : Sites.values()){
            System.out.println(value+", ");
        }
        HashMap<String,String> Name2 = new HashMap<String,String>();
        Name2.put("身高","180cm");
        Name2.putAll(Name);
        System.out.println(Name2);
        HashMap<String,Integer> prices = new HashMap<>();

        prices.put("Shoes",200);
        prices.put("Bag",300);
        prices.put("Pant",150);
        System.out.println("HashMap:"+prices);
        int returnedValue = prices.merge("Shirt",100,(oldValue,newValue) ->  oldValue + newValue);
        System.out.println("Price of Shirt:"+returnedValue);
        System.out.println("Updated HashMap:"+prices);
    }
}
package org.study.array;

import java.util.Arrays;

public class Array {
    public static void main(String [] args){
        System.out.println("Study Array");
//        int[] ns = {1,235,346,745,75,23,124,241,1234241};
//        for (int i = 0;i<ns.length;i++){
//            int n = ns[i];
//            System.out.println(n);
//        }
//        for (int n : ns){
//            System.out.println(n);
//        }
//        System.out.println(ns);//打印数组在JVM中的引用地址
//        System.out.println(Arrays.toString(ns));
//
//        for (int i = ns.length -1;i>=0;i--){
//            System.out.println(ns[i]);
//        }
//        System.out.println("--------------------------");
//        //冒泡排序
//
//        int[] mao = {124,34,76,24,347,458,3,5,235,43,745,7};
//        //排序前
//        System.out.println(Arrays.toString(mao));
//        for (int i = 0;i<mao.length - 1;i++){
//            for (int j = 0;j<mao.length -i - 1;j++){
//                if(mao[j] > mao[j+1]){
//                    int tmp = mao[j];
//                    mao[j] = mao[j+1];
//                    mao[j+1] = tmp;
//                }
//            }
//        }
//        //排序后
//        System.out.println(Arrays.toString(mao));
        int[][] arrayS = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        int[] arr0 = arrayS[0];
        System.out.println(arrayS.length);
        System.out.println(arrayS[0][1]);
        for (int[] arr : arrayS){
            for (int a : arr){
                System.out.println(a);
            }
        }
        System.out.println(Arrays.deepToString(arrayS));
    }
}

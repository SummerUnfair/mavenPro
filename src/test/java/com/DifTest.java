package com;

import com.Pojo.People;
import com.Pojo.User;

import java.util.HashSet;

public class DifTest {

    public static void main (String[] args)
    {
        HashSet<People> set = new HashSet<>();
        People p1 = new People("小美女",18);
        People p2 = new People("小美女",18);
        People p3 = new People("小美女",10);
        System.out.println(p1.hashCode());//734175839
        System.out.println(p2.hashCode());//734175839
        System.out.println(p1==p2);//false
        System.out.println(p1.equals(p2));//true
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}

package com.ferao.SingletonTest;

import com.ferao.aopTest.UserService;

//饿汉式单例
public class UseSingleton {

    //私有化构造器
    private UseSingleton(){
    }

    //类初始化的时候，立即加载该对象
    private static UseSingleton instance = new UseSingleton();

    //提供获取该对象的方法，没有synchronized，效率高
    public static UseSingleton getInstance(){
        return instance;
    }
}

class UseSingleTest{
    public static void main (String[] args)
    {

        UseSingleton instance = UseSingleton.getInstance();
        UseSingleton instance1 = UseSingleton.getInstance();

        System.out.println(instance==instance1);
    }
}
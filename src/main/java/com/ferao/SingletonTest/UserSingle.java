package com.ferao.SingletonTest;

//DCL懒汉式
public class UserSingle {

    //私有化构造器
    private UserSingle(){
    }

    //类初始化的时候，不立即加载该对象
    private  static UserSingle instance;

    //提供获取该对象的方法，有synchronized，效率较低
    public static synchronized  UserSingle getInstance(){
        if (instance==null){
            synchronized (UserSingle.class){
                if (instance==null){
                    instance= new UserSingle();
                }
            }
        }
        return instance;
    }

}
class UseSingleTest2{
    public static void main (String[] args)
    {

        UserSingle instance = UserSingle.getInstance();
        UserSingle instance1 = UserSingle.getInstance();

        System.out.println(instance==instance1);
    }
}

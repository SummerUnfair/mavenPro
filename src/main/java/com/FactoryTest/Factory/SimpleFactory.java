package com.FactoryTest.Factory;

public class SimpleFactory {

    public static Car getWuLing(){
        return new WuLing();
    }
    public static Car getTesLa(){
        return new TesLa();
    }
}

package com.FactoryTest.Factory;

public class Consumer {
    public static void main (String[] args)
    {
        Car tesLa = SimpleFactory.getTesLa();
        Car wuLing = SimpleFactory.getWuLing();
        tesLa.name();
        wuLing.name();
    }
}

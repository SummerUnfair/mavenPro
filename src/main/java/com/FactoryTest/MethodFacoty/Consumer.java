package com.FactoryTest.MethodFacoty;

public class Consumer {

    public static void main (String[] args)
    {
        Car car = new TesLaFacoty().getCar();
        Car car1 = new WuLingFactory().getCar();
        car.name();
        car1.name();
    }
}

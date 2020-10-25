package com.FactoryTest.MethodFacoty;

public class TesLaFacoty implements CarFactory {

    @Override
    public Car getCar() {
        return new TesLa();
    }
}

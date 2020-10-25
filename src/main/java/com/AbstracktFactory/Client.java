package com.AbstracktFactory;

public class Client {
    public static void main (String[] args)
    {
        System.out.println("==小米产品==");
        //小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IrouteProduct irouteProduct = xiaomiFactory.routerProduct();
        irouteProduct.openWifi();
        irouteProduct.setting();
}
}

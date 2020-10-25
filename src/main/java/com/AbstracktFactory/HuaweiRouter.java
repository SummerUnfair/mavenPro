package com.AbstracktFactory;

import org.omg.CORBA.IRObject;

//华为路由器
public class HuaweiRouter implements IrouteProduct {
    @Override
    public void start() {
        System.out.println("开启华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("开启华为Wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置华为");
    }
}

package com.AbstracktFactory;

//小米路由器
public class XiaomiRouter implements IrouteProduct {
    @Override
    public void start() {
        System.out.println("开启小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("开启小米Wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置小米");
    }
}

package com.AbstracktFactory;

//小米工厂
public class XiaomiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IrouteProduct routerProduct() {
        return new XiaomiRouter();
    }
}

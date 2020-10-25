package com.AbstracktFactory;

//华为工厂
public class HuaweiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IrouteProduct routerProduct() {
        return new HuaweiRouter();
    }
}

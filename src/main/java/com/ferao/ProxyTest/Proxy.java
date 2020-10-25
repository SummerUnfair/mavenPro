package com.ferao.ProxyTest;

public class Proxy implements Rent {

    private Host host;

    public Proxy(){
    }
    public Proxy(Host host){
        this.host=host;
    }
    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("go seeHouse");
    }
    //签合同
    public void hetong(){
        System.out.println("success to sell house");
    }

    public void fare(){
        System.out.println("get charge");
    }
}

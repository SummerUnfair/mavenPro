package com.ferao.higntSingleTton;

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("host rent house");
    }
}

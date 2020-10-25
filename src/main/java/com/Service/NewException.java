package com.Service;/*
 * @author Ferao
 * @date
 * @discription
 */

public class NewException extends Exception{
    public NewException(){

    }
    public NewException(String str){
        //此处传入的是抛出异常后显示的信息提示
        super(str);
    }
}

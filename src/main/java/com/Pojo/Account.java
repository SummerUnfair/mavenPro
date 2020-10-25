package com.Pojo;

import java.util.Date;

public class Account {

    private String name ;
    private String age ;
    private Date date;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", date=" + date +
                '}';
    }

    public Account(String name, String age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public Account(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

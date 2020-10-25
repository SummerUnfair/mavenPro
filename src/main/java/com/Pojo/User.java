package com.Pojo;

import java.io.Serializable;
import java.util.Objects;


public class User implements Serializable {

    private int id ;
    private String username;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id &&
//                Objects.equals(username, user.username);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, username);
//    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }


}

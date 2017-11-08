package com.example.woodson.mvptest.bean;

/**
 * Created by Woodson on 2017/11/8.
 */

public class user {
    private String username;
    private String password;

    public user(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
}

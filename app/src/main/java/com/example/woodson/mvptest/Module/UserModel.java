package com.example.woodson.mvptest.Module;

import android.util.SparseArray;

import com.example.woodson.mvptest.bean.user;

/**
 * Created by Woodson on 2017/11/8.
 */

public class UserModel implements IUserModel {
    private String username;
    private String password;
    private int id;
    private SparseArray<user> array = new SparseArray<>();
    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
        user u  = new user(this.username,password);
        array.append(id,u);//key value
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public user load(int id) {
        this.id = id;
        user userBean = array.get(this.id, new user("not found",
                "not found"));
        return userBean;
    }
}

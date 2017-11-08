package com.example.woodson.mvptest;

import com.example.woodson.mvptest.Module.IUserModel;
import com.example.woodson.mvptest.Module.UserModel;
import com.example.woodson.mvptest.View.IUserView;
import com.example.woodson.mvptest.bean.user;

/**
 * Created by Woodson on 2017/11/8.
 */

public class UserPresenter {
    private IUserModel userModel;
    private IUserView userView;

    public UserPresenter(IUserView userView){
        this.userView = userView;
        userModel = new UserModel();
    }

    public void saveUser(int id,String username,String password)
    {
        userModel.setID(id);
        userModel.setUsername(username);
        userModel.setPassword(password);
        //保存
    }

    public void loadUser(int id){
        user user = userModel.load(id);
        userView.setUsername(user.getUsername());
        userView.setPssword(user.getPassword());
    }

}

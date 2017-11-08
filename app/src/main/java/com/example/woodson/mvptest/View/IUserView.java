package com.example.woodson.mvptest.View;

/**
 * Created by Woodson on 2017/11/8.
 * View可以对ID、FirstName、LastName这三个EditText进行读操作，对FirstName和LastName进行写操作，由此定义IUserView接口
 */

public interface IUserView {
    String getUserName();
    String getPassword();
    Void setUsername(String username);
    Void setPssword(String password);
    int getId();
}

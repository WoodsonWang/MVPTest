package com.example.woodson.mvptest.Module;

import com.example.woodson.mvptest.bean.user;

/**
 * Created by Woodson on 2017/11/8.
 * Model也需要对这三个字段进行读写操作，并存储在某个载体内(这不是我们所关心的
 * 可以存在内存、文件、数据库或者远程服务器，但对于Presenter及View无影响),定义IUserModel接口：
 */

public interface IUserModel {
    void setID (int id);
    void setPassword (String password);
    void setUsername(String username);
    int getID();
    user load (int id);//通过id读取user信息,返回一个UserBean
}

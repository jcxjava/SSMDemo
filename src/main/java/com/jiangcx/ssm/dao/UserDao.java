package com.jiangcx.ssm.dao;

import com.jiangcx.ssm.entity.User;

import java.util.List;

/**
 * Created by jiangcx on 2018/9/21
 */

public interface UserDao {
    /*查询所有的user*/
    List<User> getAllUser();

    /*通过userId查询User*/
    User getUserByUserId(String id);

    void update(User user);

    void delete(String id);

    void add(User user);
}

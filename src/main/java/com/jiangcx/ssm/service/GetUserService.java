package com.jiangcx.ssm.service;

import com.jiangcx.ssm.entity.User;

import java.util.List;

/**
 * Created by jiangcx on 2018/9/21
 */

public interface GetUserService {
    /**
     * all
     * @return
     */
    List<User> getAll();

    /**
     * one
     * @param id
     * @return
     */
    User getUserById(String id);

    void updateUser(User user);

    void deleteUser(String id);

    void addUser(User user);



}

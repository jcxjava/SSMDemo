package com.jiangcx.ssm.service;

import com.jiangcx.ssm.dao.UserDao;
import com.jiangcx.ssm.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jiangcx on 2018/9/21
 */
@Service("userService")
public class GetUserServiceImpl implements GetUserService {
    @Resource(name = "userDao")
    private UserDao dao;
    @Override
    public List<User> getAll() {
        return dao.getAllUser();
    }

    @Override
    public User getUserById(String id) {

        return dao.getUserByUserId(id);
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(id);
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }
}

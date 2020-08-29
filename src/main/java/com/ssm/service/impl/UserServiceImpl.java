package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.po.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
@Autowired
private UserDao userDao;
    @Override
    public List<User> findAll() {
        //System.out.println("查询所有信息成功！");
        return userDao.findAll();
    }

    @Override
    public void saveUserInfo(User user) {

//        System.out.println("进行用户信息添加工作成功！");
        userDao.saveUser(user);
    }
}

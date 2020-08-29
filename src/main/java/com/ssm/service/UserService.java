package com.ssm.service;

import com.ssm.po.User;

import java.util.List;

public interface UserService {
    // 查询所有账户
    public List<User> findAll();

    // 保存帐户信息
    public void saveUserInfo(User user);
}

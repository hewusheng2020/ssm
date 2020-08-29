package com.ssm.dao;


import com.ssm.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 帐户dao接口
 */
@Repository("userDao")
public interface UserDao {

    // 查询所有账户
    @Select("select * from user")
    public List<User> findAll();

    // 保存帐户信息
    @Insert("insert into user(username,address)value(#{username},#{address})")
    public void saveUser(User user);

}

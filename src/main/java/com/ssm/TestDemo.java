package com.ssm;

import com.ssm.dao.UserDao;
import com.ssm.po.User;
import com.ssm.service.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDemo {
    @Test
    public void testMybatis() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //调用代理对象相关方法
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        //释放资源
        sqlSession.close();
        inputStream.close();

    }

    @Test
    public void testSpring() {
        //获取springioc容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        //获取bean对象
        UserService us = (UserService) ac.getBean("userService");
        us.findAll();

    }
}

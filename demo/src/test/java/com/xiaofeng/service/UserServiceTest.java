package com.xiaofeng.service;

import com.xiaofeng.FinanceApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/23
 * @email chenxf84@gmail.com
 */

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = FinanceApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp(){
        userService.deleteAll();
    }

    @Test
    public void test()throws Exception{
        // 插入5个用户
        userService.create("a", 1);
        userService.create("b", 2);
        userService.create("c", 3);
        userService.create("d", 4);
        userService.create("e", 5);
        // 查数据库，应该有5个用户
        Assert.assertEquals(5, userService.getAll().intValue());
        // 删除两个用户
        userService.deleteByName("a");
        userService.deleteByName("e");
        // 查数据库，应该有5个用户
        Assert.assertEquals(3, userService.getAll().intValue());
    }

}

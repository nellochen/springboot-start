package com.xiaofeng.service;

import com.xiaofeng.domain.User;
import com.xiaofeng.service.p.UserMongoRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/24
 * @email chenxf84@gmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {

    @Autowired
    private UserMongoRepository userMongoRepository;

    @Before
    public void setUp() {
        userMongoRepository.deleteAll();
    }

    @Test
    public void test() throws Exception {

        // 创建三个User，并验证User总数
        userMongoRepository.save(new User(1L, "didi", 30));
        userMongoRepository.save(new User(2L, "mama", 40));
        userMongoRepository.save(new User(3L, "kaka", 50));
        Assert.assertEquals(3, userMongoRepository.findAll().size());
        // 删除一个User，再验证User总数
        User u = userMongoRepository.findOne(1L);
        userMongoRepository.delete(u);
        Assert.assertEquals(2, userMongoRepository.findAll().size());
        // 删除一个User，再验证User总数
        u = userMongoRepository.findByName("mama");
        userMongoRepository.delete(u);
        Assert.assertEquals(1, userMongoRepository.findAll().size());


    }
}

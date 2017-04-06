package com.xiaofeng.service;

import com.xiaofeng.domain.User;
import com.xiaofeng.service.p.UserRepository;
import com.xiaofeng.service.s.MemberRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/24
 * @email chenxf84@gmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MutiJpaTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MemberRepository memberRepository;


    @Autowired
    private CacheManager cacheManager;

    @Before
    public void setUp() {
        //userRepository.deleteAll();
        userRepository.save(new User("xiaofeng", 10));
    }

    @Test
    @Transactional(value = "primaryTransactionManager", isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public void test() throws Exception {

//        userRepository.save(new User("aaa", 10));
//        userRepository.save(new User("bbb", 20));
//        userRepository.save(new User("ccc", 30));
//        userRepository.save(new User("ddd", 40));
//        userRepository.save(new User("eee", 50));
//
//        Assert.assertEquals(5, Lists.newArrayList(userRepository.findAll()).size());
//
//        memberRepository.save(new Member("o1", 1));
//        memberRepository.save(new Member("o2", 2));
//        memberRepository.save(new Member("o3", 2));
//
//        Assert.assertEquals(3, Lists.newArrayList(memberRepository.findAll()).size());

        User u1 = userRepository.findByName("xiaofeng");
        System.out.println("第一次查询：" + u1.getAge());

        User u2 = userRepository.findByName("xiaofeng");
        System.out.println("第二次查询：" + u2.getAge());

        u1.setAge(20);
        userRepository.save(u1);
        User u3 = userRepository.findByName("xiaofeng");
        System.out.println("第三次查询：" + u3.getAge());


    }
}

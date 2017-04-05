package com.xiaofeng.service;

import com.google.common.collect.Lists;
import com.xiaofeng.FinanceApplication;
import com.xiaofeng.domain.Member;
import com.xiaofeng.repository.MemberRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/24
 * @email chenxf84@gmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FinanceApplication.class)
@WebAppConfiguration
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void test() throws Exception{
        // 创建10条记录
        memberRepository.save(new Member("AAA", 10));
        memberRepository.save(new Member("BBB", 20));
        memberRepository.save(new Member("CCC", 30));
        memberRepository.save(new Member("DDD", 40));
        memberRepository.save(new Member("EEE", 50));
        memberRepository.save(new Member("FFF", 60));
        memberRepository.save(new Member("GGG", 70));
        memberRepository.save(new Member("HHH", 80));
        memberRepository.save(new Member("III", 90));
        memberRepository.save(new Member("JJJ", 100));
        // 测试findAll, 查询所有记录
        Assert.assertEquals(10, Lists.newArrayList(memberRepository.findAll()).size());
        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(60, memberRepository.findByName("FFF").getAge().longValue());
        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, memberRepository.find("FFF").getAge().longValue());
        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("FFF", memberRepository.findByNameAndAge("FFF", 60).getName());
        // 测试删除姓名为AAA的User
        memberRepository.delete(memberRepository.findByName("AAA"));
        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, Lists.newArrayList(memberRepository.findAll()).size());
    }
}

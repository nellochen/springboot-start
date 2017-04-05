package com.xiaofeng.service;

import com.xiaofeng.domain.City;
import com.xiaofeng.mapper.CityMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/29
 * @email chenxf84@gmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisTest {

    @Autowired
    private CityMapper cityMapper;

    @Test
    @Rollback
    public void test() throws Exception {
        // 保存字符串
        City city = cityMapper.selectCityById(1);
        Assert.assertEquals("San Francisco", city.getName());

    }
}

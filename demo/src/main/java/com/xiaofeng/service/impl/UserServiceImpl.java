package com.xiaofeng.service.impl;

import com.xiaofeng.domain.User;
import com.xiaofeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/23
 * @email chenxf84@gmail.com
 */

@Component("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("INSERT  INTO user (name, age) VALUES (?, ?)", name, age);
    }

    @Override
    public void update(User user) {
        jdbcTemplate.update("UPDATE user SET name = ?,age = ?", user.getName(), user.getAge());
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update("DELETE FROM user WHERE id = ?", id);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM user WHERE name = ?", name);
    }

    @Override
    public Integer getAll() {
        return jdbcTemplate.queryForObject("SELECT count(1) FROM user WHERE 1 = 1", Integer.class);
    }

    @Override
    public void deleteAll() {
        jdbcTemplate.update("DELETE FROM user ");
    }
}

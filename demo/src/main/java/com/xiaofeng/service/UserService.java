package com.xiaofeng.service;

import com.xiaofeng.domain.User;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/23
 * @email chenxf84@gmail.com
 */

public interface UserService {

    /**
     * 新增
     *
     * @param name
     * @param age
     */
    void create(String name, Integer age);

    /**
     * 更新
     *
     * @param user
     */
    void update(User user);

    /**
     * 删除
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据name删除
     *
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取总量
     */
    Integer getAll();

    /**
     * 删除所有
     */
    void deleteAll();
}

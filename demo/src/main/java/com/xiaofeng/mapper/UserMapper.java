package com.xiaofeng.mapper;

import com.xiaofeng.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/30
 * @email chenxf84@gmail.com
 */

@Mapper
public interface UserMapper {

    @Select("select * from user where name = #{name}")
    User findByName(@Param("name") String name);

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    @SelectKey(statement = "call identity()", keyProperty = "id", before = false, resultType = int.class)
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Update("UPDATE user SET age=#{age} WHERE name=#{name}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);

    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })

    @Select("SELECT name, age FROM user")
    List<User> findAll();
}

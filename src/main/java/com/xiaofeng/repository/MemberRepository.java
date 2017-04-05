package com.xiaofeng.repository;

import com.xiaofeng.domain.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/23
 * @email chenxf84@gmail.com
 */


public interface MemberRepository extends CrudRepository<Member, Integer> {
    Member findByName(String name);

    Member findByNameAndAge(String name, Integer age);

    @Query(value = "SELECT m FROM Member m WHERE m.name=:name")
    Member find(@Param("name") String name);
}

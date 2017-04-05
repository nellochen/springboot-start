package com.xiaofeng.service.p;

import com.xiaofeng.domain.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/29
 * @email chenxf84@gmail.com
 */

@CacheConfig(cacheNames = "user")
public interface UserRepository extends CrudRepository<User, Integer> {

    @Cacheable(key = "#p0")
    User findByName(String name);

    @CachePut(key = "#p0.name")
    User save(User user);
}

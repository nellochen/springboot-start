package com.xiaofeng.service.p;

import com.xiaofeng.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/30
 * @email chenxf84@gmail.com
 */


public interface UserMongoRepository extends MongoRepository<User, Long> {

    User findByName(String name);
}

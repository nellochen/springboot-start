package com.xiaofeng.service.s;

import com.xiaofeng.domain.Member;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/23
 * @email chenxf84@gmail.com
 */


public interface MemberRepository extends CrudRepository<Member, Integer> {

}

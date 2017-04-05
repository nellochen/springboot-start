package com.xiaofeng.web;

import com.xiaofeng.domain.Member;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/24
 * @email chenxf84@gmail.com
 */

@RestController
@RequestMapping("/members")
public class MemberController {

//    @Autowired
//    private MemberRepository memberRepository;

    /**
     * 测试添加用户
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public Member view(@PathVariable("id") Long id) {
        Integer i = new Integer(Long.toString(id));
        Member user = new Member();
        user.setName("zhang");
        user.setAge(i);
//        memberRepository.save(user);
        return user;
    }
}

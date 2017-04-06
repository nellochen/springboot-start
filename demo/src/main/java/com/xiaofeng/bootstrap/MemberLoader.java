package com.xiaofeng.bootstrap;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/27
 * @email chenxf84@gmail.com
 */

@Component
public class MemberLoader implements ApplicationListener<ContextRefreshedEvent>{

//    private MemberRepository memberRepository;

    private Logger log = Logger.getLogger(MemberLoader.class);

//    @Autowired
//    public void setMemberRepository(MemberRepository memberRepository){
//        this.memberRepository = memberRepository;
//    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        Member member = new Member();
//        member.setName("zhang");
//        member.setAge(10);
//        memberRepository.save(member);
//
//        log.info("Saved member - id: " + member.getId());
//
//        Member user = new Member();
//        user.setName("chen");
//        user.setAge(100);
//        memberRepository.save(user);
//
//        log.info("Saved member - id: " + user.getId());
    }
}

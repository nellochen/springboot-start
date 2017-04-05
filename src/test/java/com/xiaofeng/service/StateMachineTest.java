package com.xiaofeng.service;

import com.xiaofeng.constant.Events;
import com.xiaofeng.constant.States;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/04/01
 * @email chenxf84@gmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StateMachineTest {

    @Autowired
    private StateMachine<States, Events> stateMachine;

    @Before
    public void setUp() {
    }

    @Test
    public void test() throws Exception {

        stateMachine.start();
        stateMachine.sendEvent(Events.PAY);
        stateMachine.sendEvent(Events.RECEIVE);

    }

}

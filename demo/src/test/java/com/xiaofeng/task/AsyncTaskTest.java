package com.xiaofeng.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/30
 * @email chenxf84@gmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncTaskTest {

    @Autowired
    private AsyncTask task;

    @Test
    public void test() throws Exception {
//        task.doTaskOne();
//        task.doTaskTwo();
//        task.doTaskThree();
        long start = System.currentTimeMillis();
        Future<String> task1 = task.doTaskOne();
        Future<String> task2 = task.doTaskTwo();
        Future<String> task3 = task.doTaskThree();
        while (true) {
            if (task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }
}

package com.xiaofeng.task;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/30
 * @email chenxf84@gmail.com
 */

//@Component
public class ScheduledTasks {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("现在时间：" + DATE_FORMAT.format(new Date()));
    }
}

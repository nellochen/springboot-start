package com.xiaofeng.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Chen Xiaofeng on 2017/3/17.
 */
@Component
public class BlogProperties {
    @Value("${com.xiaofeng.blog.name}")
    private String name;
    @Value("${com.xiaofeng.blog.title}")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

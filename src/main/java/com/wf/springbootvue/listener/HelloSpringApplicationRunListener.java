package com.wf.springbootvue.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author wf
 * @create 2020-08-22 21:10
 * @desc
 **/
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

    // 需要提供构造器
    public HelloSpringApplicationRunListener(SpringApplication application, String[] args) {

    }

}

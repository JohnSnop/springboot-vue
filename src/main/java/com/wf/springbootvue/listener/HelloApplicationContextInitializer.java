package com.wf.springbootvue.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author wf
 * @create 2020-08-22 21:08
 * @desc
 **/
public class HelloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("===ApplicationContextInitializer===initialize===");
        System.out.println(applicationContext);
    }
}

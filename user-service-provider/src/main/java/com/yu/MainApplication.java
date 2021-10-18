package com.yu;

import com.alibaba.dubbo.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 15:33 2021/10/17
 * @Modified By:
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        System.in.read();
    }
}

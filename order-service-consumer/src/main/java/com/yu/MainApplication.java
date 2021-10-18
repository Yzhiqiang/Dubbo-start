package com.yu;

import com.yu.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 18:52 2021/10/17
 * @Modified By:
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = applicationContext.getBean(OrderService.class);
        bean.initOrder("111");
        System.out.println("调用结束");
        System.in.read();
    }
}

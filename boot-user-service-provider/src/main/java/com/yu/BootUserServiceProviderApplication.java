package com.yu;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 1.导入依赖
 *  1）导入dubbo-starter
 *  2）导入dubbo的其他依赖
 */
//@EnableDubbo     //开启dubbo功能
//@ImportResource(locations = "classpath:provider.xml")
@SpringBootApplication
/**
 * SPringBoot与dubbo整合的三种方式：
 * 1）导入dubbo-starter，在application.properties配置属性，使用@Service【暴露服务】使用@Reference【引用服务】
 * 2）保留配置文件
 * 导入dubbo-starter    使用@ImportResource导入dubbo配置文件
 * 3）使用注解API   ,将每一个组件配置到configure中
 */
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}

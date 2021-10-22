package com.yu.config;

import com.alibaba.dubbo.config.*;
import com.yu.service.UserService;
import javafx.concurrent.Service;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 22:24 2021/10/18
 * @Modified By:
 */
@Configuration
public class MyDubboConfig {

//        <dubbo:application name="boot-user-service-provider"></dubbo:application>
    @Bean
    public ApplicationConfig applicationConfig()
    {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-user-service-provider");
        return applicationConfig;
    }

//    <dubbo:registry address="zookeeper://127.0.0.1:2181"></dubbo:registry>
    @Bean
    public RegistryConfig registryConfig()
    {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

//        <dubbo:protocol name="dubbo" port="20081"></dubbo:protocol>
    @Bean
    public ProtocolConfig protocolConfig()
    {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }

    //<dubbo:service interface="com.yu.service.UserService" ref="userServiceImpl"></dubbo:service>
    @Bean
    public ServiceConfig<UserService> serviceConfig(UserService userService)
    {
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("1.0.0");

        //配置每一个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);

        //将method的设置到service配置中
        List<MethodConfig> methods = new ArrayList<>();
        methods.add(methodConfig);
        serviceConfig.setMethods(methods);
        return serviceConfig;
    }



}

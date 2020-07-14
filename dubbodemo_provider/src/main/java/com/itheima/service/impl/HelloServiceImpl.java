package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.HelloService;

/**
 * @author kpwang
 * @create 2020-07-15 2:29
 */
@Service//发布为服务必须使用Dubbo提供的@Service注解
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}

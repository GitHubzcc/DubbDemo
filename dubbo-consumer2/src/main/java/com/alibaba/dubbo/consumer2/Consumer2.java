package com.alibaba.dubbo.consumer2;

import com.alibaba.dubbo.demo.demoService2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eriz on 2018/3/6.
 */
public class Consumer2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer2.xml");
        context.start();
        System.out.println("consumer start");
        demoService2 demoService2 = context.getBean(demoService2.class);
        System.out.println("consumer");
        System.out.println(demoService2.getPhone("爱过"));

    }
}

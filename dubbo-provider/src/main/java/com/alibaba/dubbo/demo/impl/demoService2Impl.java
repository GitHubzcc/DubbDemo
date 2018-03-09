package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.demoService2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eriz on 2018/3/6.
 */
public class demoService2Impl implements demoService2 {
    public List<String> getPhone(String name) {
        List<String> phone = new ArrayList<String>();
        phone.add("name:"+name);
        phone.add("i am s , the first:" + "白衣染霜华");
        phone.add("i am s , the seccend:" + "菱花泪朱砂");
        phone.add("i am s , the three:" + "凭谁错牵挂");
        phone.add("i am s , the end:" + "青丝成白发");
        return phone;
    }
}

package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * Created by eriz on 2018/3/5.
 */
public interface DemoService {
        List<String> getPermissions(Long id);

}

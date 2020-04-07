package org.javaboy.applicationrunner.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@Order(98)
public class MyApplicationRunner2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 获取所有的参数
        String[] sourceArgs = args.getSourceArgs();
        System.out.println("sourceArgs:"+sourceArgs);
        // 获取不是键值对的数据
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("nonOptionArgs:"+nonOptionArgs);
        // 获取属于键值对数据的所有的key的set
        Set<String> set = args.getOptionNames();
        for (String key : set) {
            // 根据key获取value
            System.out.println((key+":"+args.getOptionValues(key)));
        }

    }
}

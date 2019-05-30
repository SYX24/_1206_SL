package com.sy.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sy"})
//生成mapper接口的实现类对像(动态代理产生的对像)
@MapperScan(basePackages = "com.sy.mapper")
public class SpringConfig {

}

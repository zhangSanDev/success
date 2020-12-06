package com.success.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhang
 */
@Configuration
@MapperScan("com.success.mbg.mapper")
public class MyBatisConfig {

}

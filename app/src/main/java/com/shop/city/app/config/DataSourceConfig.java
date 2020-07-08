package com.shop.city.app.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mysql.jdbc.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Bean
    public DataSource getDataSource() throws Exception{
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&relaxAutoCommit=true&autoReconnect=true&allowMultiQueries=true&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL");
//        dataSource.setUsername("root");
//        dataSource.setPassword("adminroot123");
//        return dataSource;


        Properties props = new Properties();
        props.put("driverClassName", env.getProperty("spring.datasource.driver-class-name"));
        props.put("url",env.getProperty("spring.datasource.url"));
        props.put("username",env.getProperty("spring.datasource.username"));
        props.put("password",env.getProperty("spring.datasource.password"));

        return DruidDataSourceFactory.createDataSource(props);
    }
}

package com.shop.city.common;

import com.shop.city.common.annotation.AppConfig;
import com.shop.city.common.annotation.AroundTest;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Watermelon
 * @Date: 2021/3/15 13:38
 */
@RestController
@RequestMapping("my")
public class AroundController {

    @AroundTest
    @GetMapping("/test")
    public String huatest(String name){
        System.out.println("环绕通知测试");
        return name;
    }

//    public static void main(String[] args) {
////        ApplicationContext applicationContext = AppConfig.getApplicationContext();
//        AroundController aroundController = AppConfig.getBean(AroundController.class);
//        aroundController.huatest();
//
//    }
}

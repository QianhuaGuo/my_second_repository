package com.shop.city.app.controller;

import com.shop.city.common.bean.RestResult;
import com.shop.city.common.pojo.User;
import com.shop.city.common.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Value("${mylist.list1}")
    private String[] arr1;

    @ApiOperation(value = "查询所有人员",notes = "查询所有人员",produces = "application/json")
    @ApiResponse(code = 200, message = "成功")
    @GetMapping("/getUserAll")
    public RestResult getUserAll(HttpServletRequest httpServletRequest){
        String path = httpServletRequest.getContextPath();
        System.out.println("path:"+path);
        System.out.println(httpServletRequest.getServletPath());
        System.out.println(httpServletRequest.getRequestURI());
        System.out.println(httpServletRequest.getRequestURL());
        for (int i = 0;i<arr1.length;i++){
            logger.info("this is:"+arr1[i]);
        }
        List<User> list = userService.getUserAll();
        return RestResult.SUCCESS().object(list).build();
    }
}

package com.shop.city.app;

import com.shop.city.common.pojo.User;
import com.shop.city.common.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @Author: Watermelon
 * @Date: 2021/3/22 18:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UseTestApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUserAll(){
        List<User> userAll = userService.getUserAll();
        Assert.assertNotNull(userAll);
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setId(1);
        user.setStudentId(1);
        user.setAge(11);
        user.setUserName("hh");
        user.setBirth(new Date());

        userService.add(user);

    }
}

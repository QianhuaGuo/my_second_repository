package com.shop.city.app.controller;

import com.shop.city.app.bean.User;
import org.apache.commons.collections.ArrayStack;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

//    public static void main(String[] args) {
//        List<User> userList = new ArrayList<>();
//        userList.add(new User("张三",12));
//        userList.add(new User("李四",13));
//        userList.add(new User("王五",12));
//
//        Optional<User> o = userList.stream().filter(u->u.getAge().equals(0)).findFirst();
//        Boolean bool = userList.stream().anyMatch(u->u.getAge().equals(12));
//        System.out.println(o.isPresent());
//        System.out.println(bool);
//    }
}

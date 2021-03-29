package com.shop.city.common.service.impl;

import com.shop.city.common.mapper.UserMapper;
import com.shop.city.common.pojo.User;
import com.shop.city.common.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserAll() {
        List<User> userList = userMapper.getUserAll();
        if (CollectionUtils.isEmpty(userList)){
            return Collections.emptyList();
        }
        return userList;
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }
}

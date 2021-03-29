package com.shop.city.common.mapper;

import com.shop.city.common.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getUserAll();

    void add(User user);
}

package com.shop.city.common.annotation;

import java.util.List;

/**
 * @Author: Watermelon
 * @Date: 2021/1/20 14:30
 */
public class PasswordUtil {

    @UseCase(id = 47,description = "password must contain at least one number")
    public boolean validatePassword(String password){
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49,description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords,String password){
        return !prevPasswords.contains(password);
    }
}

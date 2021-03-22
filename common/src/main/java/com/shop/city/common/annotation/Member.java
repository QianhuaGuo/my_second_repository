package com.shop.city.common.annotation;

import io.swagger.models.auth.In;
import lombok.Data;
import org.springframework.context.annotation.Primary;

/**
 * @Author: Watermelon
 * @Date: 2021/1/20 15:56
 */
@DBTable(name = "MEMBER")
//@Data
public class Member {
    @SQLString(30)
    String firstName;
    @SQLString(50)
    String lastName;
    @SQLInteger
    Integer age;
    @SQLString(value = 30,constraints=@Constraints(primaryKey = true))
    String handle;

    static int memberCount;
    public String getHandle(){return handle;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public Integer getAge(){return age;}
}

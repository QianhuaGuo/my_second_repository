package com.shop.city.common.annotation;

/**
 * @Author: Watermelon
 * @Date: 2021/1/20 15:54
 */

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}

package com.shop.city.app.config.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {


    @ApiOperation(value = "根据商品id查询商品详情", notes = "根据商品id查询商品详情", produces = "application/json")
    @GetMapping("/get/goods")
    public String getGoods(){
        return "this is a appler";
    }
}

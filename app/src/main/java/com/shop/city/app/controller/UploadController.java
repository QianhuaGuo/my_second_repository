package com.shop.city.app.controller;

import com.shop.city.common.bean.RestResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.shop.city.common.service.UploadService;

@RestController
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @ApiOperation(value = "上传单张图片", notes = "图片属性", produces = "application/json")
    @ApiImplicitParam(name = "file", value = "图片", required = true, dataTypeClass = MultipartFile.class)
    @ApiResponse(code = 200, message = "成功")
    @PostMapping("/upload")
    public RestResult upload(@RequestParam("file") MultipartFile file){
        if (file.isEmpty()){
            return RestResult.ERROR_PARAMS().message("图片不能为空").build();
        }
        String visitPath = uploadService.upload(file);
        return RestResult.SUCCESS().Object(visitPath).build();
    }
}

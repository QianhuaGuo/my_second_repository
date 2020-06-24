package com.shop.city.common.service.impl;

import com.shop.city.common.bean.CommonException;
import com.shop.city.common.bean.CommonExceptionEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.shop.city.common.service.UploadService;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class UploadServiceImpl implements UploadService {

    //文件保存路径
    @Value("${imagepath.savePath}")
    private String savePath;

    //文件访问路径
    @Value("${imagepath.visitPath}")
    private String visitPath;


    @Override
    public String upload(MultipartFile file) {
        //1.获取文件名
        String fileName = file.getOriginalFilename();
        //2.获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //3.创建文件名称（生成保存的图片的名称）
        String newFileName = this.createID() + suffixName;
        //4.创建保存的文件对象
        File target = new File(savePath + "/" + newFileName);
        //5.上传操作
        if (!"image/png".equals(file.getContentType()) && !"image/jpg".equals(file.getContentType()) && !"image/jpeg".equals(file.getContentType())
                && !"image/gif".equals(file.getContentType())){
            throw new CommonException(CommonExceptionEnum.ILLEGAL_ARGUMENT,"请上传jpg、png、gif或jpeg格式文件");
        }
        if (!target.getParentFile().exists()){
            target.getParentFile().mkdirs();
        }
        try{
            file.transferTo(target);
            return this.createVisitPath(newFileName);
        }catch (IOException e){
            throw new CommonException(CommonExceptionEnum.ILLEGAL_ARGUMENT,e);
        }
    }

    /**
     * 获取图片的访问路径
     * @param newFileName
     * @return
     */
    private String createVisitPath(String newFileName) {
        return visitPath + "/" + newFileName;
    }

    /**
     * 生成ID
     *
     * @return
     */
    private String createID() {
        return UUID.randomUUID().toString().replace("-","");
    }
}

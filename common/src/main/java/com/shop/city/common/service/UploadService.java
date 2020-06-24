package com.shop.city.common.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 上传文件
 */
public interface UploadService {

    /**
     * 上传文件
     * @param file
     * @return
     */
    String upload(MultipartFile file);
}

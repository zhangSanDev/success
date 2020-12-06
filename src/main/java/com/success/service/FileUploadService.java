package com.success.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhang
 */
public interface FileUploadService {

    /**
     *  文件上传并计算
     * @param startTime
     * @param stride
     * @param projectName
     * @param multipartFile
     * @return
     * @throws Exception
     */
    @Transactional(rollbackFor = {Exception.class})
    Object upload(Double startTime, Double stride, String projectName, MultipartFile multipartFile) throws Exception;
}

package com.success.service;

import com.success.mbg.model.Project;

import java.util.List;

/**
 * @author zhang
 */
public interface ProjectListService {

    /**
     * 获取项目列表
     * @return
     * @throws Exception
     */
    List<Project> getProjectList() throws Exception;
}

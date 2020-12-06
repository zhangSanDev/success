package com.success.service;

import com.success.mbg.model.Parameter;

import java.util.List;

/**
 * @author zhang
 */
public interface ParameterListService {

    /**
     * 根据项目编号获取参数列表
     * @param projectId
     * @return
     */
    List<Parameter> getParameterList(String projectId);
}

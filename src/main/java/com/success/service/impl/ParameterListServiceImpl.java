package com.success.service.impl;

import com.success.controller.CalculationController;
import com.success.mbg.mapper.ParameterMapper;
import com.success.mbg.model.Parameter;
import com.success.mbg.model.ParameterExample;
import com.success.service.ParameterListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhang
 */
@Service
public class ParameterListServiceImpl implements ParameterListService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationController.class);

    @Resource
    private ParameterMapper parameterMapper;

    @Override
    public List<Parameter> getParameterList(String projectId) {
        ParameterExample parameterExample = new ParameterExample();
        parameterExample.createCriteria().andProjectIdEqualTo(projectId);
        List<Parameter> parameterList = parameterMapper.selectByExample(parameterExample);
        return parameterList;
    }
}

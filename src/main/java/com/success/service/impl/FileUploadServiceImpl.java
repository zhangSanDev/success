package com.success.service.impl;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.success.common.utils.MultipartFileToFile;
import com.success.controller.CalculationController;
import com.success.mbg.mapper.ParameterMapper;
import com.success.mbg.mapper.ProjectMapper;
import com.success.mbg.model.Parameter;
import com.success.mbg.model.Project;
import com.success.service.FileUploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang
 */
@Service
public class FileUploadServiceImpl implements FileUploadService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationController.class);

    @Resource
    private ProjectMapper projectMapper;
    @Resource
    private ParameterMapper parameterMapper;

    @Override
    public Object upload(Double startTime, Double stride, String projectName, MultipartFile multipartFile) throws Exception {

        DateTime dateTime = DateUtil.date();

        String projectId = IdUtil.objectId();
        Project project = new Project();
        project.setProjectId(projectId);
        project.setProjectName(projectName);
        project.setCreateTime(dateTime);
        int count = projectMapper.insertSelective(project);

        File file = MultipartFileToFile.multipartFileToFile(multipartFile);
        List<Parameter> parameterList=new ArrayList<>();
        List<String> parameters=new ArrayList<>();
        String s=null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String parameterId = IdUtil.objectId();
        while ((s=br.readLine())!=null){
            parameters.add(s);
            Parameter parameter = new Parameter();
            parameter.setParameterId(parameterId);
            parameter.setParameterData(new BigDecimal(s));
            parameter.setProjectId(projectId);
            parameterList.add(parameter);
        }
        br.close();
        int count1 = parameterMapper.insertList(parameterList);

        //计算


        return null;
    }

}

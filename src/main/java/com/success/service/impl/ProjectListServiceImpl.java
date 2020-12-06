package com.success.service.impl;

import com.success.controller.CalculationController;
import com.success.mbg.mapper.ProjectMapper;
import com.success.mbg.model.Project;
import com.success.mbg.model.ProjectExample;
import com.success.service.ProjectListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhang
 */
@Service
public class ProjectListServiceImpl implements ProjectListService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationController.class);

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public List<Project> getProjectList() throws Exception {
        ProjectExample projectExample = new ProjectExample();
        projectExample.isDistinct();
        List<Project> projects = projectMapper.selectByExample(projectExample);
        return projects;
    }
}

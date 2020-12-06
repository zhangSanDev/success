package com.success.controller;

import com.success.common.result.CommonResult;
import com.success.mbg.model.Parameter;
import com.success.mbg.model.Project;
import com.success.mbg.model.Result;
import com.success.service.FileUploadService;
import com.success.service.ParameterListService;
import com.success.service.ProjectListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang
 */
@Api(tags = "计算")
@RestController
@RequestMapping("/calculation")
public class CalculationController {

    @Resource
    private FileUploadService fileUploadService;
    @Resource
    private ProjectListService projectListService;
    @Resource
    private ParameterListService parameterListService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationController.class);

    @ApiOperation("文件上传")
    @PostMapping("/upload")
    public CommonResult upload(@RequestParam(value = "startTime") Double startTime,
                               @RequestParam(value = "stride") Double stride,
                               @RequestParam(value = "projectName") String projectName,
                               @RequestParam(value = "multipartFile") MultipartFile multipartFile){

        try {


        }catch (Exception e){
            LOGGER.error("读取.txt文件计算失败",e);
            return CommonResult.failed();
        }
        return null;

    }

    @ApiOperation("获取项目列表")
    @GetMapping("/projectList")
    public CommonResult<List<Project>> projectList(){
        List<Project> projectList = new ArrayList<>();
        try {
            projectList = projectListService.getProjectList();
        }catch (Exception e){
            LOGGER.error("获取项目列表失败",e);
            return CommonResult.failed();
        }
        return CommonResult.success(projectList);
    }

    @ApiOperation("获取参数列表")
    @GetMapping("/parameterList")
    public CommonResult<List<Parameter>> parameterList(@RequestParam(value = "projectId") String projectId){
        List<Parameter> parameterList=new ArrayList<>();
        try {
            parameterList=parameterListService.getParameterList(projectId);
        }catch (Exception e){
            LOGGER.error("获取参数列表失败",e);
            return CommonResult.failed();
        }
        return CommonResult.success(parameterList);
    }

    @ApiOperation("获取结果列表")
    @GetMapping("/resultList")
    public CommonResult<List<Result>> resultList(@RequestParam(value = "parameterId") String parameterId){
        List<Result> resultList=new ArrayList<>();
        try {

        }catch (Exception e){
            LOGGER.error("获取结果列表失败",e);
            return CommonResult.failed();
        }
        return CommonResult.success(resultList);
    }

    @ApiOperation("获取计算结果")
    @GetMapping("/result")
    public CommonResult<List<Result>> result(@RequestParam(value = "resultId") String resultId){
        return null;
    }

}

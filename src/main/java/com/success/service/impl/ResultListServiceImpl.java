package com.success.service.impl;

import com.success.common.constant.CalculationResultEnum;
import com.success.controller.CalculationController;
import com.success.dto.CalculationResult;
import com.success.mbg.mapper.ResultMapper;
import com.success.mbg.model.Result;
import com.success.mbg.model.ResultExample;
import com.success.service.ResultListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhang
 */
public class ResultListServiceImpl implements ResultListService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculationController.class);

    @Resource
    private ResultMapper resultMapper;

    @Override
    public List<Result> getResultList(String parameterId) {
        ResultExample resultExample = new ResultExample();
        resultExample.createCriteria().andParameterIdEqualTo(parameterId);
        List<Result> resultList = resultMapper.selectByExample(resultExample);
        return resultList;
    }

    @Override
    public CalculationResult getResult(String resultId) {
        CalculationResult calculationResult = new CalculationResult();
        List<Result> resultF = getResultByNumber(CalculationResultEnum.ERA_F.getCode(), resultId);
        List<Result> resultGAMMA = getResultByNumber(CalculationResultEnum.ERA_GAMMA.getCode(), resultId);
        List<Result> resultMIU = getResultByNumber(CalculationResultEnum.ERA_MIU.getCode(), resultId);
        List<Result> resultPHI = getResultByNumber(CalculationResultEnum.ERA_PHI.getCode(), resultId);
        List<Result> resultZETA = getResultByNumber(CalculationResultEnum.ERA_ZETA.getCode(), resultId);
        calculationResult.setEraFResult(resultF);
        calculationResult.setEraGammaResult(resultGAMMA);
        calculationResult.setEraMiuResult(resultMIU);
        calculationResult.setEraPhiResult(resultPHI);
        calculationResult.setEraZetaResult(resultZETA);
        return calculationResult;
    }

    private List<Result> getResultByNumber(Integer number,String resultId){
        ResultExample resultExample = new ResultExample();
        resultExample.createCriteria().andResultIdEqualTo(resultId).andResultClassificationNumberEqualTo(number);
        List<Result> resultList = resultMapper.selectByExample(resultExample);
        return resultList;
    }
}

package com.success.service;

import com.success.dto.CalculationResult;
import com.success.mbg.model.Result;

import java.util.List;

/**
 * @author zhang
 */
public interface ResultListService {

    /**
     * 根据参数编号获取结果列表
     * @param parameterId
     * @return
     */
    List<Result> getResultList(String parameterId);

    /**
     * 根据结果编号获取结果
     * @param resultId
     * @return
     */
    CalculationResult getResult(String resultId);
}

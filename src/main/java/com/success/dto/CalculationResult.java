package com.success.dto;

import com.success.mbg.model.Result;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhang
 */
@Data
public class CalculationResult {

    @ApiModelProperty(value = "ERA_f")
    private List<Result> eraFResult;

    @ApiModelProperty(value = "ERA_gamma")
    private List<Result> eraGammaResult;

    @ApiModelProperty(value = "ERA_miu")
    private List<Result> eraMiuResult;

    @ApiModelProperty(value = "ERA_phi")
    private List<Result> eraPhiResult;

    @ApiModelProperty(value = "ERA_zeta")
    private List<Result> eraZetaResult;
}

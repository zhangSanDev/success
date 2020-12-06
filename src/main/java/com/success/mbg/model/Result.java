package com.success.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Result implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "结果编号")
    private String resultId;

    @ApiModelProperty(value = "结果值")
    private BigDecimal resultData;

    @ApiModelProperty(value = "参数编号")
    private String parameterId;

    @ApiModelProperty(value = "结果分类编号")
    private Integer resultClassificationNumber;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public BigDecimal getResultData() {
        return resultData;
    }

    public void setResultData(BigDecimal resultData) {
        this.resultData = resultData;
    }

    public String getParameterId() {
        return parameterId;
    }

    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public Integer getResultClassificationNumber() {
        return resultClassificationNumber;
    }

    public void setResultClassificationNumber(Integer resultClassificationNumber) {
        this.resultClassificationNumber = resultClassificationNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", resultId=").append(resultId);
        sb.append(", resultData=").append(resultData);
        sb.append(", parameterId=").append(parameterId);
        sb.append(", resultClassificationNumber=").append(resultClassificationNumber);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
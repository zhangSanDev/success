package com.success.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(String value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(String value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(String value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(String value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(String value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLike(String value) {
            addCriterion("result_id like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotLike(String value) {
            addCriterion("result_id not like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<String> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<String> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(String value1, String value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(String value1, String value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultDataIsNull() {
            addCriterion("result_data is null");
            return (Criteria) this;
        }

        public Criteria andResultDataIsNotNull() {
            addCriterion("result_data is not null");
            return (Criteria) this;
        }

        public Criteria andResultDataEqualTo(BigDecimal value) {
            addCriterion("result_data =", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataNotEqualTo(BigDecimal value) {
            addCriterion("result_data <>", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataGreaterThan(BigDecimal value) {
            addCriterion("result_data >", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("result_data >=", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataLessThan(BigDecimal value) {
            addCriterion("result_data <", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataLessThanOrEqualTo(BigDecimal value) {
            addCriterion("result_data <=", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataIn(List<BigDecimal> values) {
            addCriterion("result_data in", values, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataNotIn(List<BigDecimal> values) {
            addCriterion("result_data not in", values, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("result_data between", value1, value2, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("result_data not between", value1, value2, "resultData");
            return (Criteria) this;
        }

        public Criteria andParameterIdIsNull() {
            addCriterion("parameter_id is null");
            return (Criteria) this;
        }

        public Criteria andParameterIdIsNotNull() {
            addCriterion("parameter_id is not null");
            return (Criteria) this;
        }

        public Criteria andParameterIdEqualTo(String value) {
            addCriterion("parameter_id =", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotEqualTo(String value) {
            addCriterion("parameter_id <>", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdGreaterThan(String value) {
            addCriterion("parameter_id >", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdGreaterThanOrEqualTo(String value) {
            addCriterion("parameter_id >=", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLessThan(String value) {
            addCriterion("parameter_id <", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLessThanOrEqualTo(String value) {
            addCriterion("parameter_id <=", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLike(String value) {
            addCriterion("parameter_id like", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotLike(String value) {
            addCriterion("parameter_id not like", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdIn(List<String> values) {
            addCriterion("parameter_id in", values, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotIn(List<String> values) {
            addCriterion("parameter_id not in", values, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdBetween(String value1, String value2) {
            addCriterion("parameter_id between", value1, value2, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotBetween(String value1, String value2) {
            addCriterion("parameter_id not between", value1, value2, "parameterId");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberIsNull() {
            addCriterion("result_classification_number is null");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberIsNotNull() {
            addCriterion("result_classification_number is not null");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberEqualTo(Integer value) {
            addCriterion("result_classification_number =", value, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberNotEqualTo(Integer value) {
            addCriterion("result_classification_number <>", value, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberGreaterThan(Integer value) {
            addCriterion("result_classification_number >", value, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_classification_number >=", value, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberLessThan(Integer value) {
            addCriterion("result_classification_number <", value, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberLessThanOrEqualTo(Integer value) {
            addCriterion("result_classification_number <=", value, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberIn(List<Integer> values) {
            addCriterion("result_classification_number in", values, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberNotIn(List<Integer> values) {
            addCriterion("result_classification_number not in", values, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberBetween(Integer value1, Integer value2) {
            addCriterion("result_classification_number between", value1, value2, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andResultClassificationNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("result_classification_number not between", value1, value2, "resultClassificationNumber");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
package com.dimensoft.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KTransExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KTransExample() {
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

        public Criteria andTransIdIsNull() {
            addCriterion("trans_id is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(Integer value) {
            addCriterion("trans_id =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(Integer value) {
            addCriterion("trans_id <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(Integer value) {
            addCriterion("trans_id >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_id >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(Integer value) {
            addCriterion("trans_id <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(Integer value) {
            addCriterion("trans_id <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<Integer> values) {
            addCriterion("trans_id in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<Integer> values) {
            addCriterion("trans_id not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(Integer value1, Integer value2) {
            addCriterion("trans_id between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_id not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andTransNameIsNull() {
            addCriterion("trans_name is null");
            return (Criteria) this;
        }

        public Criteria andTransNameIsNotNull() {
            addCriterion("trans_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransNameEqualTo(String value) {
            addCriterion("trans_name =", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameNotEqualTo(String value) {
            addCriterion("trans_name <>", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameGreaterThan(String value) {
            addCriterion("trans_name >", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameGreaterThanOrEqualTo(String value) {
            addCriterion("trans_name >=", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameLessThan(String value) {
            addCriterion("trans_name <", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameLessThanOrEqualTo(String value) {
            addCriterion("trans_name <=", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameLike(String value) {
            addCriterion("trans_name like", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameNotLike(String value) {
            addCriterion("trans_name not like", value, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameIn(List<String> values) {
            addCriterion("trans_name in", values, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameNotIn(List<String> values) {
            addCriterion("trans_name not in", values, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameBetween(String value1, String value2) {
            addCriterion("trans_name between", value1, value2, "transName");
            return (Criteria) this;
        }

        public Criteria andTransNameNotBetween(String value1, String value2) {
            addCriterion("trans_name not between", value1, value2, "transName");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionIsNull() {
            addCriterion("trans_description is null");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionIsNotNull() {
            addCriterion("trans_description is not null");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionEqualTo(String value) {
            addCriterion("trans_description =", value, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionNotEqualTo(String value) {
            addCriterion("trans_description <>", value, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionGreaterThan(String value) {
            addCriterion("trans_description >", value, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("trans_description >=", value, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionLessThan(String value) {
            addCriterion("trans_description <", value, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionLessThanOrEqualTo(String value) {
            addCriterion("trans_description <=", value, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionLike(String value) {
            addCriterion("trans_description like", value, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionNotLike(String value) {
            addCriterion("trans_description not like", value, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionIn(List<String> values) {
            addCriterion("trans_description in", values, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionNotIn(List<String> values) {
            addCriterion("trans_description not in", values, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionBetween(String value1, String value2) {
            addCriterion("trans_description between", value1, value2, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransDescriptionNotBetween(String value1, String value2) {
            addCriterion("trans_description not between", value1, value2, "transDescription");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("trans_type is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("trans_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(Integer value) {
            addCriterion("trans_type =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(Integer value) {
            addCriterion("trans_type <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(Integer value) {
            addCriterion("trans_type >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_type >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(Integer value) {
            addCriterion("trans_type <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trans_type <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<Integer> values) {
            addCriterion("trans_type in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<Integer> values) {
            addCriterion("trans_type not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(Integer value1, Integer value2) {
            addCriterion("trans_type between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_type not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransPathIsNull() {
            addCriterion("trans_path is null");
            return (Criteria) this;
        }

        public Criteria andTransPathIsNotNull() {
            addCriterion("trans_path is not null");
            return (Criteria) this;
        }

        public Criteria andTransPathEqualTo(String value) {
            addCriterion("trans_path =", value, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathNotEqualTo(String value) {
            addCriterion("trans_path <>", value, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathGreaterThan(String value) {
            addCriterion("trans_path >", value, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathGreaterThanOrEqualTo(String value) {
            addCriterion("trans_path >=", value, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathLessThan(String value) {
            addCriterion("trans_path <", value, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathLessThanOrEqualTo(String value) {
            addCriterion("trans_path <=", value, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathLike(String value) {
            addCriterion("trans_path like", value, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathNotLike(String value) {
            addCriterion("trans_path not like", value, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathIn(List<String> values) {
            addCriterion("trans_path in", values, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathNotIn(List<String> values) {
            addCriterion("trans_path not in", values, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathBetween(String value1, String value2) {
            addCriterion("trans_path between", value1, value2, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransPathNotBetween(String value1, String value2) {
            addCriterion("trans_path not between", value1, value2, "transPath");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdIsNull() {
            addCriterion("trans_repository_id is null");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdIsNotNull() {
            addCriterion("trans_repository_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdEqualTo(Integer value) {
            addCriterion("trans_repository_id =", value, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdNotEqualTo(Integer value) {
            addCriterion("trans_repository_id <>", value, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdGreaterThan(Integer value) {
            addCriterion("trans_repository_id >", value, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_repository_id >=", value, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdLessThan(Integer value) {
            addCriterion("trans_repository_id <", value, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("trans_repository_id <=", value, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdIn(List<Integer> values) {
            addCriterion("trans_repository_id in", values, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdNotIn(List<Integer> values) {
            addCriterion("trans_repository_id not in", values, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdBetween(Integer value1, Integer value2) {
            addCriterion("trans_repository_id between", value1, value2, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransRepositoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_repository_id not between", value1, value2, "transRepositoryId");
            return (Criteria) this;
        }

        public Criteria andTransQuartzIsNull() {
            addCriterion("trans_quartz is null");
            return (Criteria) this;
        }

        public Criteria andTransQuartzIsNotNull() {
            addCriterion("trans_quartz is not null");
            return (Criteria) this;
        }

        public Criteria andTransQuartzEqualTo(Integer value) {
            addCriterion("trans_quartz =", value, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzNotEqualTo(Integer value) {
            addCriterion("trans_quartz <>", value, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzGreaterThan(Integer value) {
            addCriterion("trans_quartz >", value, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_quartz >=", value, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzLessThan(Integer value) {
            addCriterion("trans_quartz <", value, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzLessThanOrEqualTo(Integer value) {
            addCriterion("trans_quartz <=", value, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzIn(List<Integer> values) {
            addCriterion("trans_quartz in", values, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzNotIn(List<Integer> values) {
            addCriterion("trans_quartz not in", values, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzBetween(Integer value1, Integer value2) {
            addCriterion("trans_quartz between", value1, value2, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransQuartzNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_quartz not between", value1, value2, "transQuartz");
            return (Criteria) this;
        }

        public Criteria andTransRecordIsNull() {
            addCriterion("trans_record is null");
            return (Criteria) this;
        }

        public Criteria andTransRecordIsNotNull() {
            addCriterion("trans_record is not null");
            return (Criteria) this;
        }

        public Criteria andTransRecordEqualTo(Integer value) {
            addCriterion("trans_record =", value, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordNotEqualTo(Integer value) {
            addCriterion("trans_record <>", value, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordGreaterThan(Integer value) {
            addCriterion("trans_record >", value, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_record >=", value, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordLessThan(Integer value) {
            addCriterion("trans_record <", value, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordLessThanOrEqualTo(Integer value) {
            addCriterion("trans_record <=", value, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordIn(List<Integer> values) {
            addCriterion("trans_record in", values, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordNotIn(List<Integer> values) {
            addCriterion("trans_record not in", values, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordBetween(Integer value1, Integer value2) {
            addCriterion("trans_record between", value1, value2, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_record not between", value1, value2, "transRecord");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelIsNull() {
            addCriterion("trans_log_level is null");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelIsNotNull() {
            addCriterion("trans_log_level is not null");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelEqualTo(String value) {
            addCriterion("trans_log_level =", value, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelNotEqualTo(String value) {
            addCriterion("trans_log_level <>", value, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelGreaterThan(String value) {
            addCriterion("trans_log_level >", value, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelGreaterThanOrEqualTo(String value) {
            addCriterion("trans_log_level >=", value, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelLessThan(String value) {
            addCriterion("trans_log_level <", value, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelLessThanOrEqualTo(String value) {
            addCriterion("trans_log_level <=", value, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelLike(String value) {
            addCriterion("trans_log_level like", value, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelNotLike(String value) {
            addCriterion("trans_log_level not like", value, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelIn(List<String> values) {
            addCriterion("trans_log_level in", values, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelNotIn(List<String> values) {
            addCriterion("trans_log_level not in", values, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelBetween(String value1, String value2) {
            addCriterion("trans_log_level between", value1, value2, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransLogLevelNotBetween(String value1, String value2) {
            addCriterion("trans_log_level not between", value1, value2, "transLogLevel");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNull() {
            addCriterion("trans_status is null");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNotNull() {
            addCriterion("trans_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransStatusEqualTo(Integer value) {
            addCriterion("trans_status =", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotEqualTo(Integer value) {
            addCriterion("trans_status <>", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThan(Integer value) {
            addCriterion("trans_status >", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_status >=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThan(Integer value) {
            addCriterion("trans_status <", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThanOrEqualTo(Integer value) {
            addCriterion("trans_status <=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusIn(List<Integer> values) {
            addCriterion("trans_status in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotIn(List<Integer> values) {
            addCriterion("trans_status not in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusBetween(Integer value1, Integer value2) {
            addCriterion("trans_status between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_status not between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddUserIsNull() {
            addCriterion("add_user is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIsNotNull() {
            addCriterion("add_user is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserEqualTo(Integer value) {
            addCriterion("add_user =", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotEqualTo(Integer value) {
            addCriterion("add_user <>", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThan(Integer value) {
            addCriterion("add_user >", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_user >=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThan(Integer value) {
            addCriterion("add_user <", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThanOrEqualTo(Integer value) {
            addCriterion("add_user <=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserIn(List<Integer> values) {
            addCriterion("add_user in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotIn(List<Integer> values) {
            addCriterion("add_user not in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserBetween(Integer value1, Integer value2) {
            addCriterion("add_user between", value1, value2, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotBetween(Integer value1, Integer value2) {
            addCriterion("add_user not between", value1, value2, "addUser");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditUserIsNull() {
            addCriterion("edit_user is null");
            return (Criteria) this;
        }

        public Criteria andEditUserIsNotNull() {
            addCriterion("edit_user is not null");
            return (Criteria) this;
        }

        public Criteria andEditUserEqualTo(Integer value) {
            addCriterion("edit_user =", value, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserNotEqualTo(Integer value) {
            addCriterion("edit_user <>", value, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserGreaterThan(Integer value) {
            addCriterion("edit_user >", value, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_user >=", value, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserLessThan(Integer value) {
            addCriterion("edit_user <", value, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserLessThanOrEqualTo(Integer value) {
            addCriterion("edit_user <=", value, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserIn(List<Integer> values) {
            addCriterion("edit_user in", values, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserNotIn(List<Integer> values) {
            addCriterion("edit_user not in", values, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserBetween(Integer value1, Integer value2) {
            addCriterion("edit_user between", value1, value2, "editUser");
            return (Criteria) this;
        }

        public Criteria andEditUserNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_user not between", value1, value2, "editUser");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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
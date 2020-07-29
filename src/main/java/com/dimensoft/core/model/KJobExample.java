package com.dimensoft.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KJobExample() {
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
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

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionIsNull() {
            addCriterion("job_description is null");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionIsNotNull() {
            addCriterion("job_description is not null");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionEqualTo(String value) {
            addCriterion("job_description =", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionNotEqualTo(String value) {
            addCriterion("job_description <>", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionGreaterThan(String value) {
            addCriterion("job_description >", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("job_description >=", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionLessThan(String value) {
            addCriterion("job_description <", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionLessThanOrEqualTo(String value) {
            addCriterion("job_description <=", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionLike(String value) {
            addCriterion("job_description like", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionNotLike(String value) {
            addCriterion("job_description not like", value, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionIn(List<String> values) {
            addCriterion("job_description in", values, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionNotIn(List<String> values) {
            addCriterion("job_description not in", values, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionBetween(String value1, String value2) {
            addCriterion("job_description between", value1, value2, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobDescriptionNotBetween(String value1, String value2) {
            addCriterion("job_description not between", value1, value2, "jobDescription");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNull() {
            addCriterion("job_type is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("job_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(Integer value) {
            addCriterion("job_type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(Integer value) {
            addCriterion("job_type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(Integer value) {
            addCriterion("job_type >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_type >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(Integer value) {
            addCriterion("job_type <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(Integer value) {
            addCriterion("job_type <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<Integer> values) {
            addCriterion("job_type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<Integer> values) {
            addCriterion("job_type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(Integer value1, Integer value2) {
            addCriterion("job_type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("job_type not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobPathIsNull() {
            addCriterion("job_path is null");
            return (Criteria) this;
        }

        public Criteria andJobPathIsNotNull() {
            addCriterion("job_path is not null");
            return (Criteria) this;
        }

        public Criteria andJobPathEqualTo(String value) {
            addCriterion("job_path =", value, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathNotEqualTo(String value) {
            addCriterion("job_path <>", value, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathGreaterThan(String value) {
            addCriterion("job_path >", value, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathGreaterThanOrEqualTo(String value) {
            addCriterion("job_path >=", value, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathLessThan(String value) {
            addCriterion("job_path <", value, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathLessThanOrEqualTo(String value) {
            addCriterion("job_path <=", value, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathLike(String value) {
            addCriterion("job_path like", value, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathNotLike(String value) {
            addCriterion("job_path not like", value, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathIn(List<String> values) {
            addCriterion("job_path in", values, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathNotIn(List<String> values) {
            addCriterion("job_path not in", values, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathBetween(String value1, String value2) {
            addCriterion("job_path between", value1, value2, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobPathNotBetween(String value1, String value2) {
            addCriterion("job_path not between", value1, value2, "jobPath");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdIsNull() {
            addCriterion("job_repository_id is null");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdIsNotNull() {
            addCriterion("job_repository_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdEqualTo(Integer value) {
            addCriterion("job_repository_id =", value, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdNotEqualTo(Integer value) {
            addCriterion("job_repository_id <>", value, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdGreaterThan(Integer value) {
            addCriterion("job_repository_id >", value, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_repository_id >=", value, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdLessThan(Integer value) {
            addCriterion("job_repository_id <", value, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_repository_id <=", value, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdIn(List<Integer> values) {
            addCriterion("job_repository_id in", values, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdNotIn(List<Integer> values) {
            addCriterion("job_repository_id not in", values, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdBetween(Integer value1, Integer value2) {
            addCriterion("job_repository_id between", value1, value2, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobRepositoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_repository_id not between", value1, value2, "jobRepositoryId");
            return (Criteria) this;
        }

        public Criteria andJobQuartzIsNull() {
            addCriterion("job_quartz is null");
            return (Criteria) this;
        }

        public Criteria andJobQuartzIsNotNull() {
            addCriterion("job_quartz is not null");
            return (Criteria) this;
        }

        public Criteria andJobQuartzEqualTo(Integer value) {
            addCriterion("job_quartz =", value, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzNotEqualTo(Integer value) {
            addCriterion("job_quartz <>", value, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzGreaterThan(Integer value) {
            addCriterion("job_quartz >", value, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_quartz >=", value, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzLessThan(Integer value) {
            addCriterion("job_quartz <", value, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzLessThanOrEqualTo(Integer value) {
            addCriterion("job_quartz <=", value, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzIn(List<Integer> values) {
            addCriterion("job_quartz in", values, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzNotIn(List<Integer> values) {
            addCriterion("job_quartz not in", values, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzBetween(Integer value1, Integer value2) {
            addCriterion("job_quartz between", value1, value2, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobQuartzNotBetween(Integer value1, Integer value2) {
            addCriterion("job_quartz not between", value1, value2, "jobQuartz");
            return (Criteria) this;
        }

        public Criteria andJobRecordIsNull() {
            addCriterion("job_record is null");
            return (Criteria) this;
        }

        public Criteria andJobRecordIsNotNull() {
            addCriterion("job_record is not null");
            return (Criteria) this;
        }

        public Criteria andJobRecordEqualTo(Integer value) {
            addCriterion("job_record =", value, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordNotEqualTo(Integer value) {
            addCriterion("job_record <>", value, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordGreaterThan(Integer value) {
            addCriterion("job_record >", value, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_record >=", value, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordLessThan(Integer value) {
            addCriterion("job_record <", value, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordLessThanOrEqualTo(Integer value) {
            addCriterion("job_record <=", value, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordIn(List<Integer> values) {
            addCriterion("job_record in", values, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordNotIn(List<Integer> values) {
            addCriterion("job_record not in", values, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordBetween(Integer value1, Integer value2) {
            addCriterion("job_record between", value1, value2, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("job_record not between", value1, value2, "jobRecord");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelIsNull() {
            addCriterion("job_log_level is null");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelIsNotNull() {
            addCriterion("job_log_level is not null");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelEqualTo(String value) {
            addCriterion("job_log_level =", value, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelNotEqualTo(String value) {
            addCriterion("job_log_level <>", value, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelGreaterThan(String value) {
            addCriterion("job_log_level >", value, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelGreaterThanOrEqualTo(String value) {
            addCriterion("job_log_level >=", value, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelLessThan(String value) {
            addCriterion("job_log_level <", value, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelLessThanOrEqualTo(String value) {
            addCriterion("job_log_level <=", value, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelLike(String value) {
            addCriterion("job_log_level like", value, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelNotLike(String value) {
            addCriterion("job_log_level not like", value, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelIn(List<String> values) {
            addCriterion("job_log_level in", values, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelNotIn(List<String> values) {
            addCriterion("job_log_level not in", values, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelBetween(String value1, String value2) {
            addCriterion("job_log_level between", value1, value2, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobLogLevelNotBetween(String value1, String value2) {
            addCriterion("job_log_level not between", value1, value2, "jobLogLevel");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNull() {
            addCriterion("job_status is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNotNull() {
            addCriterion("job_status is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusEqualTo(Integer value) {
            addCriterion("job_status =", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotEqualTo(Integer value) {
            addCriterion("job_status <>", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThan(Integer value) {
            addCriterion("job_status >", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_status >=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThan(Integer value) {
            addCriterion("job_status <", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThanOrEqualTo(Integer value) {
            addCriterion("job_status <=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusIn(List<Integer> values) {
            addCriterion("job_status in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotIn(List<Integer> values) {
            addCriterion("job_status not in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusBetween(Integer value1, Integer value2) {
            addCriterion("job_status between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("job_status not between", value1, value2, "jobStatus");
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

        public Criteria andJobExecTypeIsNull() {
            addCriterion("job_exec_type is null");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeIsNotNull() {
            addCriterion("job_exec_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeEqualTo(Integer value) {
            addCriterion("job_exec_type =", value, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeNotEqualTo(Integer value) {
            addCriterion("job_exec_type <>", value, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeGreaterThan(Integer value) {
            addCriterion("job_exec_type >", value, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_exec_type >=", value, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeLessThan(Integer value) {
            addCriterion("job_exec_type <", value, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeLessThanOrEqualTo(Integer value) {
            addCriterion("job_exec_type <=", value, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeIn(List<Integer> values) {
            addCriterion("job_exec_type in", values, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeNotIn(List<Integer> values) {
            addCriterion("job_exec_type not in", values, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeBetween(Integer value1, Integer value2) {
            addCriterion("job_exec_type between", value1, value2, "jobExecType");
            return (Criteria) this;
        }

        public Criteria andJobExecTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("job_exec_type not between", value1, value2, "jobExecType");
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
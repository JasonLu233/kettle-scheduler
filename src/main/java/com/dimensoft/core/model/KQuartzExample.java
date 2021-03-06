package com.dimensoft.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KQuartzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KQuartzExample() {
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

        public Criteria andQuartzIdIsNull() {
            addCriterion("quartz_id is null");
            return (Criteria) this;
        }

        public Criteria andQuartzIdIsNotNull() {
            addCriterion("quartz_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuartzIdEqualTo(Integer value) {
            addCriterion("quartz_id =", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdNotEqualTo(Integer value) {
            addCriterion("quartz_id <>", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdGreaterThan(Integer value) {
            addCriterion("quartz_id >", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quartz_id >=", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdLessThan(Integer value) {
            addCriterion("quartz_id <", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdLessThanOrEqualTo(Integer value) {
            addCriterion("quartz_id <=", value, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdIn(List<Integer> values) {
            addCriterion("quartz_id in", values, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdNotIn(List<Integer> values) {
            addCriterion("quartz_id not in", values, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdBetween(Integer value1, Integer value2) {
            addCriterion("quartz_id between", value1, value2, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quartz_id not between", value1, value2, "quartzId");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionIsNull() {
            addCriterion("quartz_description is null");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionIsNotNull() {
            addCriterion("quartz_description is not null");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionEqualTo(String value) {
            addCriterion("quartz_description =", value, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionNotEqualTo(String value) {
            addCriterion("quartz_description <>", value, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionGreaterThan(String value) {
            addCriterion("quartz_description >", value, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("quartz_description >=", value, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionLessThan(String value) {
            addCriterion("quartz_description <", value, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionLessThanOrEqualTo(String value) {
            addCriterion("quartz_description <=", value, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionLike(String value) {
            addCriterion("quartz_description like", value, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionNotLike(String value) {
            addCriterion("quartz_description not like", value, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionIn(List<String> values) {
            addCriterion("quartz_description in", values, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionNotIn(List<String> values) {
            addCriterion("quartz_description not in", values, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionBetween(String value1, String value2) {
            addCriterion("quartz_description between", value1, value2, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzDescriptionNotBetween(String value1, String value2) {
            addCriterion("quartz_description not between", value1, value2, "quartzDescription");
            return (Criteria) this;
        }

        public Criteria andQuartzCronIsNull() {
            addCriterion("quartz_cron is null");
            return (Criteria) this;
        }

        public Criteria andQuartzCronIsNotNull() {
            addCriterion("quartz_cron is not null");
            return (Criteria) this;
        }

        public Criteria andQuartzCronEqualTo(String value) {
            addCriterion("quartz_cron =", value, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronNotEqualTo(String value) {
            addCriterion("quartz_cron <>", value, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronGreaterThan(String value) {
            addCriterion("quartz_cron >", value, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronGreaterThanOrEqualTo(String value) {
            addCriterion("quartz_cron >=", value, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronLessThan(String value) {
            addCriterion("quartz_cron <", value, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronLessThanOrEqualTo(String value) {
            addCriterion("quartz_cron <=", value, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronLike(String value) {
            addCriterion("quartz_cron like", value, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronNotLike(String value) {
            addCriterion("quartz_cron not like", value, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronIn(List<String> values) {
            addCriterion("quartz_cron in", values, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronNotIn(List<String> values) {
            addCriterion("quartz_cron not in", values, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronBetween(String value1, String value2) {
            addCriterion("quartz_cron between", value1, value2, "quartzCron");
            return (Criteria) this;
        }

        public Criteria andQuartzCronNotBetween(String value1, String value2) {
            addCriterion("quartz_cron not between", value1, value2, "quartzCron");
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
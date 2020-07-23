package com.dimensoft.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KTransMonitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KTransMonitorExample() {
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

        public Criteria andMonitorIdIsNull() {
            addCriterion("monitor_id is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIdIsNotNull() {
            addCriterion("monitor_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorIdEqualTo(Integer value) {
            addCriterion("monitor_id =", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotEqualTo(Integer value) {
            addCriterion("monitor_id <>", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdGreaterThan(Integer value) {
            addCriterion("monitor_id >", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_id >=", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdLessThan(Integer value) {
            addCriterion("monitor_id <", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_id <=", value, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdIn(List<Integer> values) {
            addCriterion("monitor_id in", values, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotIn(List<Integer> values) {
            addCriterion("monitor_id not in", values, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdBetween(Integer value1, Integer value2) {
            addCriterion("monitor_id between", value1, value2, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_id not between", value1, value2, "monitorId");
            return (Criteria) this;
        }

        public Criteria andMonitorTransIsNull() {
            addCriterion("monitor_trans is null");
            return (Criteria) this;
        }

        public Criteria andMonitorTransIsNotNull() {
            addCriterion("monitor_trans is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorTransEqualTo(Integer value) {
            addCriterion("monitor_trans =", value, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransNotEqualTo(Integer value) {
            addCriterion("monitor_trans <>", value, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransGreaterThan(Integer value) {
            addCriterion("monitor_trans >", value, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_trans >=", value, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransLessThan(Integer value) {
            addCriterion("monitor_trans <", value, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_trans <=", value, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransIn(List<Integer> values) {
            addCriterion("monitor_trans in", values, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransNotIn(List<Integer> values) {
            addCriterion("monitor_trans not in", values, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransBetween(Integer value1, Integer value2) {
            addCriterion("monitor_trans between", value1, value2, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorTransNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_trans not between", value1, value2, "monitorTrans");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessIsNull() {
            addCriterion("monitor_success is null");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessIsNotNull() {
            addCriterion("monitor_success is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessEqualTo(Integer value) {
            addCriterion("monitor_success =", value, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessNotEqualTo(Integer value) {
            addCriterion("monitor_success <>", value, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessGreaterThan(Integer value) {
            addCriterion("monitor_success >", value, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_success >=", value, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessLessThan(Integer value) {
            addCriterion("monitor_success <", value, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_success <=", value, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessIn(List<Integer> values) {
            addCriterion("monitor_success in", values, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessNotIn(List<Integer> values) {
            addCriterion("monitor_success not in", values, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessBetween(Integer value1, Integer value2) {
            addCriterion("monitor_success between", value1, value2, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_success not between", value1, value2, "monitorSuccess");
            return (Criteria) this;
        }

        public Criteria andMonitorFailIsNull() {
            addCriterion("monitor_fail is null");
            return (Criteria) this;
        }

        public Criteria andMonitorFailIsNotNull() {
            addCriterion("monitor_fail is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorFailEqualTo(Integer value) {
            addCriterion("monitor_fail =", value, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailNotEqualTo(Integer value) {
            addCriterion("monitor_fail <>", value, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailGreaterThan(Integer value) {
            addCriterion("monitor_fail >", value, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_fail >=", value, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailLessThan(Integer value) {
            addCriterion("monitor_fail <", value, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_fail <=", value, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailIn(List<Integer> values) {
            addCriterion("monitor_fail in", values, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailNotIn(List<Integer> values) {
            addCriterion("monitor_fail not in", values, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailBetween(Integer value1, Integer value2) {
            addCriterion("monitor_fail between", value1, value2, "monitorFail");
            return (Criteria) this;
        }

        public Criteria andMonitorFailNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_fail not between", value1, value2, "monitorFail");
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

        public Criteria andMonitorStatusIsNull() {
            addCriterion("monitor_status is null");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusIsNotNull() {
            addCriterion("monitor_status is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusEqualTo(Integer value) {
            addCriterion("monitor_status =", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotEqualTo(Integer value) {
            addCriterion("monitor_status <>", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusGreaterThan(Integer value) {
            addCriterion("monitor_status >", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_status >=", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusLessThan(Integer value) {
            addCriterion("monitor_status <", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_status <=", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusIn(List<Integer> values) {
            addCriterion("monitor_status in", values, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotIn(List<Integer> values) {
            addCriterion("monitor_status not in", values, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusBetween(Integer value1, Integer value2) {
            addCriterion("monitor_status between", value1, value2, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_status not between", value1, value2, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeIsNull() {
            addCriterion("last_execute_time is null");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeIsNotNull() {
            addCriterion("last_execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeEqualTo(Date value) {
            addCriterion("last_execute_time =", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeNotEqualTo(Date value) {
            addCriterion("last_execute_time <>", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeGreaterThan(Date value) {
            addCriterion("last_execute_time >", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_execute_time >=", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeLessThan(Date value) {
            addCriterion("last_execute_time <", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_execute_time <=", value, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeIn(List<Date> values) {
            addCriterion("last_execute_time in", values, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeNotIn(List<Date> values) {
            addCriterion("last_execute_time not in", values, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeBetween(Date value1, Date value2) {
            addCriterion("last_execute_time between", value1, value2, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andLastExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_execute_time not between", value1, value2, "lastExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeIsNull() {
            addCriterion("next_execute_time is null");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeIsNotNull() {
            addCriterion("next_execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeEqualTo(Date value) {
            addCriterion("next_execute_time =", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeNotEqualTo(Date value) {
            addCriterion("next_execute_time <>", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeGreaterThan(Date value) {
            addCriterion("next_execute_time >", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("next_execute_time >=", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeLessThan(Date value) {
            addCriterion("next_execute_time <", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterion("next_execute_time <=", value, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeIn(List<Date> values) {
            addCriterion("next_execute_time in", values, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeNotIn(List<Date> values) {
            addCriterion("next_execute_time not in", values, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeBetween(Date value1, Date value2) {
            addCriterion("next_execute_time between", value1, value2, "nextExecuteTime");
            return (Criteria) this;
        }

        public Criteria andNextExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterion("next_execute_time not between", value1, value2, "nextExecuteTime");
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
package com.dimensoft.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KRepositoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KRepositoryExample() {
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

        public Criteria andRepositoryIdIsNull() {
            addCriterion("repository_id is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdIsNotNull() {
            addCriterion("repository_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdEqualTo(Integer value) {
            addCriterion("repository_id =", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdNotEqualTo(Integer value) {
            addCriterion("repository_id <>", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdGreaterThan(Integer value) {
            addCriterion("repository_id >", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repository_id >=", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdLessThan(Integer value) {
            addCriterion("repository_id <", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("repository_id <=", value, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdIn(List<Integer> values) {
            addCriterion("repository_id in", values, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdNotIn(List<Integer> values) {
            addCriterion("repository_id not in", values, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdBetween(Integer value1, Integer value2) {
            addCriterion("repository_id between", value1, value2, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repository_id not between", value1, value2, "repositoryId");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameIsNull() {
            addCriterion("repository_name is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameIsNotNull() {
            addCriterion("repository_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameEqualTo(String value) {
            addCriterion("repository_name =", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameNotEqualTo(String value) {
            addCriterion("repository_name <>", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameGreaterThan(String value) {
            addCriterion("repository_name >", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("repository_name >=", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameLessThan(String value) {
            addCriterion("repository_name <", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameLessThanOrEqualTo(String value) {
            addCriterion("repository_name <=", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameLike(String value) {
            addCriterion("repository_name like", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameNotLike(String value) {
            addCriterion("repository_name not like", value, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameIn(List<String> values) {
            addCriterion("repository_name in", values, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameNotIn(List<String> values) {
            addCriterion("repository_name not in", values, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameBetween(String value1, String value2) {
            addCriterion("repository_name between", value1, value2, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryNameNotBetween(String value1, String value2) {
            addCriterion("repository_name not between", value1, value2, "repositoryName");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameIsNull() {
            addCriterion("repository_username is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameIsNotNull() {
            addCriterion("repository_username is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameEqualTo(String value) {
            addCriterion("repository_username =", value, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameNotEqualTo(String value) {
            addCriterion("repository_username <>", value, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameGreaterThan(String value) {
            addCriterion("repository_username >", value, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("repository_username >=", value, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameLessThan(String value) {
            addCriterion("repository_username <", value, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameLessThanOrEqualTo(String value) {
            addCriterion("repository_username <=", value, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameLike(String value) {
            addCriterion("repository_username like", value, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameNotLike(String value) {
            addCriterion("repository_username not like", value, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameIn(List<String> values) {
            addCriterion("repository_username in", values, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameNotIn(List<String> values) {
            addCriterion("repository_username not in", values, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameBetween(String value1, String value2) {
            addCriterion("repository_username between", value1, value2, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryUsernameNotBetween(String value1, String value2) {
            addCriterion("repository_username not between", value1, value2, "repositoryUsername");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordIsNull() {
            addCriterion("repository_password is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordIsNotNull() {
            addCriterion("repository_password is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordEqualTo(String value) {
            addCriterion("repository_password =", value, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordNotEqualTo(String value) {
            addCriterion("repository_password <>", value, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordGreaterThan(String value) {
            addCriterion("repository_password >", value, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("repository_password >=", value, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordLessThan(String value) {
            addCriterion("repository_password <", value, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordLessThanOrEqualTo(String value) {
            addCriterion("repository_password <=", value, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordLike(String value) {
            addCriterion("repository_password like", value, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordNotLike(String value) {
            addCriterion("repository_password not like", value, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordIn(List<String> values) {
            addCriterion("repository_password in", values, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordNotIn(List<String> values) {
            addCriterion("repository_password not in", values, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordBetween(String value1, String value2) {
            addCriterion("repository_password between", value1, value2, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryPasswordNotBetween(String value1, String value2) {
            addCriterion("repository_password not between", value1, value2, "repositoryPassword");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeIsNull() {
            addCriterion("repository_type is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeIsNotNull() {
            addCriterion("repository_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeEqualTo(String value) {
            addCriterion("repository_type =", value, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeNotEqualTo(String value) {
            addCriterion("repository_type <>", value, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeGreaterThan(String value) {
            addCriterion("repository_type >", value, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repository_type >=", value, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeLessThan(String value) {
            addCriterion("repository_type <", value, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeLessThanOrEqualTo(String value) {
            addCriterion("repository_type <=", value, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeLike(String value) {
            addCriterion("repository_type like", value, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeNotLike(String value) {
            addCriterion("repository_type not like", value, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeIn(List<String> values) {
            addCriterion("repository_type in", values, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeNotIn(List<String> values) {
            addCriterion("repository_type not in", values, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeBetween(String value1, String value2) {
            addCriterion("repository_type between", value1, value2, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andRepositoryTypeNotBetween(String value1, String value2) {
            addCriterion("repository_type not between", value1, value2, "repositoryType");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessIsNull() {
            addCriterion("database_access is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessIsNotNull() {
            addCriterion("database_access is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessEqualTo(String value) {
            addCriterion("database_access =", value, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessNotEqualTo(String value) {
            addCriterion("database_access <>", value, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessGreaterThan(String value) {
            addCriterion("database_access >", value, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessGreaterThanOrEqualTo(String value) {
            addCriterion("database_access >=", value, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessLessThan(String value) {
            addCriterion("database_access <", value, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessLessThanOrEqualTo(String value) {
            addCriterion("database_access <=", value, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessLike(String value) {
            addCriterion("database_access like", value, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessNotLike(String value) {
            addCriterion("database_access not like", value, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessIn(List<String> values) {
            addCriterion("database_access in", values, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessNotIn(List<String> values) {
            addCriterion("database_access not in", values, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessBetween(String value1, String value2) {
            addCriterion("database_access between", value1, value2, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseAccessNotBetween(String value1, String value2) {
            addCriterion("database_access not between", value1, value2, "databaseAccess");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostIsNull() {
            addCriterion("database_host is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostIsNotNull() {
            addCriterion("database_host is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostEqualTo(String value) {
            addCriterion("database_host =", value, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostNotEqualTo(String value) {
            addCriterion("database_host <>", value, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostGreaterThan(String value) {
            addCriterion("database_host >", value, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostGreaterThanOrEqualTo(String value) {
            addCriterion("database_host >=", value, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostLessThan(String value) {
            addCriterion("database_host <", value, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostLessThanOrEqualTo(String value) {
            addCriterion("database_host <=", value, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostLike(String value) {
            addCriterion("database_host like", value, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostNotLike(String value) {
            addCriterion("database_host not like", value, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostIn(List<String> values) {
            addCriterion("database_host in", values, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostNotIn(List<String> values) {
            addCriterion("database_host not in", values, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostBetween(String value1, String value2) {
            addCriterion("database_host between", value1, value2, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabaseHostNotBetween(String value1, String value2) {
            addCriterion("database_host not between", value1, value2, "databaseHost");
            return (Criteria) this;
        }

        public Criteria andDatabasePortIsNull() {
            addCriterion("database_port is null");
            return (Criteria) this;
        }

        public Criteria andDatabasePortIsNotNull() {
            addCriterion("database_port is not null");
            return (Criteria) this;
        }

        public Criteria andDatabasePortEqualTo(String value) {
            addCriterion("database_port =", value, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNotEqualTo(String value) {
            addCriterion("database_port <>", value, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortGreaterThan(String value) {
            addCriterion("database_port >", value, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortGreaterThanOrEqualTo(String value) {
            addCriterion("database_port >=", value, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortLessThan(String value) {
            addCriterion("database_port <", value, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortLessThanOrEqualTo(String value) {
            addCriterion("database_port <=", value, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortLike(String value) {
            addCriterion("database_port like", value, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNotLike(String value) {
            addCriterion("database_port not like", value, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortIn(List<String> values) {
            addCriterion("database_port in", values, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNotIn(List<String> values) {
            addCriterion("database_port not in", values, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortBetween(String value1, String value2) {
            addCriterion("database_port between", value1, value2, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabasePortNotBetween(String value1, String value2) {
            addCriterion("database_port not between", value1, value2, "databasePort");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIsNull() {
            addCriterion("database_name is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIsNotNull() {
            addCriterion("database_name is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameEqualTo(String value) {
            addCriterion("database_name =", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotEqualTo(String value) {
            addCriterion("database_name <>", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThan(String value) {
            addCriterion("database_name >", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("database_name >=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThan(String value) {
            addCriterion("database_name <", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThanOrEqualTo(String value) {
            addCriterion("database_name <=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLike(String value) {
            addCriterion("database_name like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotLike(String value) {
            addCriterion("database_name not like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIn(List<String> values) {
            addCriterion("database_name in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotIn(List<String> values) {
            addCriterion("database_name not in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameBetween(String value1, String value2) {
            addCriterion("database_name between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotBetween(String value1, String value2) {
            addCriterion("database_name not between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameIsNull() {
            addCriterion("database_username is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameIsNotNull() {
            addCriterion("database_username is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameEqualTo(String value) {
            addCriterion("database_username =", value, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameNotEqualTo(String value) {
            addCriterion("database_username <>", value, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameGreaterThan(String value) {
            addCriterion("database_username >", value, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("database_username >=", value, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameLessThan(String value) {
            addCriterion("database_username <", value, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameLessThanOrEqualTo(String value) {
            addCriterion("database_username <=", value, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameLike(String value) {
            addCriterion("database_username like", value, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameNotLike(String value) {
            addCriterion("database_username not like", value, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameIn(List<String> values) {
            addCriterion("database_username in", values, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameNotIn(List<String> values) {
            addCriterion("database_username not in", values, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameBetween(String value1, String value2) {
            addCriterion("database_username between", value1, value2, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabaseUsernameNotBetween(String value1, String value2) {
            addCriterion("database_username not between", value1, value2, "databaseUsername");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordIsNull() {
            addCriterion("database_password is null");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordIsNotNull() {
            addCriterion("database_password is not null");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordEqualTo(String value) {
            addCriterion("database_password =", value, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordNotEqualTo(String value) {
            addCriterion("database_password <>", value, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordGreaterThan(String value) {
            addCriterion("database_password >", value, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("database_password >=", value, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordLessThan(String value) {
            addCriterion("database_password <", value, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordLessThanOrEqualTo(String value) {
            addCriterion("database_password <=", value, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordLike(String value) {
            addCriterion("database_password like", value, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordNotLike(String value) {
            addCriterion("database_password not like", value, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordIn(List<String> values) {
            addCriterion("database_password in", values, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordNotIn(List<String> values) {
            addCriterion("database_password not in", values, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordBetween(String value1, String value2) {
            addCriterion("database_password between", value1, value2, "databasePassword");
            return (Criteria) this;
        }

        public Criteria andDatabasePasswordNotBetween(String value1, String value2) {
            addCriterion("database_password not between", value1, value2, "databasePassword");
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
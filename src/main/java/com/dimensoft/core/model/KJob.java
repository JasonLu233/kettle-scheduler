package com.dimensoft.core.model;

import java.util.Date;

public class KJob {
    private Integer jobId;

    private Integer categoryId;

    private String jobName;

    private String jobDescription;

    private Integer jobType;

    private String jobPath;

    private Integer jobRepositoryId;

    private Integer jobQuartz;

    private Integer jobRecord;

    private String jobLogLevel;

    private Integer jobStatus;

    private Date addTime;

    private Integer addUser;

    private Date editTime;

    private Integer editUser;

    private Integer delFlag;

    private Integer jobExecType;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription == null ? null : jobDescription.trim();
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public String getJobPath() {
        return jobPath;
    }

    public void setJobPath(String jobPath) {
        this.jobPath = jobPath == null ? null : jobPath.trim();
    }

    public Integer getJobRepositoryId() {
        return jobRepositoryId;
    }

    public void setJobRepositoryId(Integer jobRepositoryId) {
        this.jobRepositoryId = jobRepositoryId;
    }

    public Integer getJobQuartz() {
        return jobQuartz;
    }

    public void setJobQuartz(Integer jobQuartz) {
        this.jobQuartz = jobQuartz;
    }

    public Integer getJobRecord() {
        return jobRecord;
    }

    public void setJobRecord(Integer jobRecord) {
        this.jobRecord = jobRecord;
    }

    public String getJobLogLevel() {
        return jobLogLevel;
    }

    public void setJobLogLevel(String jobLogLevel) {
        this.jobLogLevel = jobLogLevel == null ? null : jobLogLevel.trim();
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getAddUser() {
        return addUser;
    }

    public void setAddUser(Integer addUser) {
        this.addUser = addUser;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getEditUser() {
        return editUser;
    }

    public void setEditUser(Integer editUser) {
        this.editUser = editUser;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getJobExecType() {
        return jobExecType;
    }

    public void setJobExecType(Integer jobExecType) {
        this.jobExecType = jobExecType;
    }
}
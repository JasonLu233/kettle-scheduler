package com.dimensoft.core.model;

import java.util.Date;

public class KTrans {
    private Integer transId;

    private Integer categoryId;

    private String transName;

    private String transDescription;

    private Integer transType;

    private String transPath;

    private Integer transRepositoryId;

    private Integer transQuartz;

    private Integer transRecord;

    private String transLogLevel;

    private Integer transStatus;

    private Date addTime;

    private Integer addUser;

    private Date editTime;

    private Integer editUser;

    private Integer delFlag;

    public Integer getTransId() {
        return transId;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName == null ? null : transName.trim();
    }

    public String getTransDescription() {
        return transDescription;
    }

    public void setTransDescription(String transDescription) {
        this.transDescription = transDescription == null ? null : transDescription.trim();
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public String getTransPath() {
        return transPath;
    }

    public void setTransPath(String transPath) {
        this.transPath = transPath == null ? null : transPath.trim();
    }

    public Integer getTransRepositoryId() {
        return transRepositoryId;
    }

    public void setTransRepositoryId(Integer transRepositoryId) {
        this.transRepositoryId = transRepositoryId;
    }

    public Integer getTransQuartz() {
        return transQuartz;
    }

    public void setTransQuartz(Integer transQuartz) {
        this.transQuartz = transQuartz;
    }

    public Integer getTransRecord() {
        return transRecord;
    }

    public void setTransRecord(Integer transRecord) {
        this.transRecord = transRecord;
    }

    public String getTransLogLevel() {
        return transLogLevel;
    }

    public void setTransLogLevel(String transLogLevel) {
        this.transLogLevel = transLogLevel == null ? null : transLogLevel.trim();
    }

    public Integer getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Integer transStatus) {
        this.transStatus = transStatus;
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
}
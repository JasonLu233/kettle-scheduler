package com.dimensoft.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dimensoft.core.mapper.KQuartzMapper;
import com.dimensoft.core.model.KQuartz;
import com.dimensoft.core.model.KQuartzExample;
import org.pentaho.di.core.exception.KettleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimensoft.core.dto.BootTablePage;

@Service
public class QuartzService {

	
	@Autowired
	private KQuartzMapper kQuartzMapper;
	
	/**
	 * @Title getList
	 * @Description 获取定时策略列表
	 * @return 
	 * @throws KettleException
	 * @return List<KQuartz>
	 */
	public List<KQuartz> getList(Integer uId){
		List<KQuartz> resultList = new ArrayList<KQuartz>();
		KQuartz kQuartz = new KQuartz();
		kQuartz.setDelFlag(1);
		kQuartz.setAddUser(uId);
        KQuartzExample example = new KQuartzExample();
        example.createCriteria().andDelFlagEqualTo(1).andAddUserEqualTo(uId);
		resultList.addAll(kQuartzMapper.selectByExample(example));
		return resultList;
	}
	
	/**
	 * @Title getList
	 * @Description 获取分页列表
	 * @param start 起始行数
	 * @param size 每页行数
	 * @param uId 用户ID
	 * @return
	 * @throws KettleException
	 * @return BootTablePage
	 */
	public BootTablePage getList(Integer start, Integer size, Integer uId){
		KQuartz kQuartz = new KQuartz();
		kQuartz.setDelFlag(1);
		kQuartz.setAddUser(uId);
        KQuartzExample example = new KQuartzExample();
        example.createCriteria().andDelFlagEqualTo(1).andAddUserEqualTo(uId);
		List<KQuartz> kQuartzList = kQuartzMapper.selectByExample(example);
		long allCount = kQuartzMapper.countByExample(example);
		BootTablePage bootTablePage = new BootTablePage();
		bootTablePage.setRows(kQuartzList);
		bootTablePage.setTotal(allCount);
		return bootTablePage;
	}
	/**
	 * @Title getQuartz
	 * @Description 获取定时策略列表
	 * @param quartzId 定时策略ID
	 * @return
	 * @return KQuartz
	 */
	public KQuartz getQuartz(Integer quartzId){
		return kQuartzMapper.selectByPrimaryKey(quartzId);
	}

	/**
	 * @Title insert
	 * @Description 插入定时策略
	 * @param kQuartz 定时策略对象
	 * @param uId 用户ID
	 * @return void
	 */
	public void insert(KQuartz kQuartz, Integer uId){
		kQuartz.setAddTime(new Date());
		kQuartz.setAddUser(uId);
		kQuartz.setEditTime(new Date());
		kQuartz.setEditUser(uId);
		kQuartz.setDelFlag(1);
		kQuartzMapper.insert(kQuartz);
	}
	/**
	 * @Title delete
	 * @Description 删除定时策略
	 * @param quartzId 定时策略ID
	 * @return void
	 */
	public void delete(Integer quartzId){
		KQuartz kQuartz = kQuartzMapper.selectByPrimaryKey(quartzId);
		kQuartz.setDelFlag(0);
		kQuartzMapper.updateByPrimaryKey(kQuartz);
	}

	/**
	 * @Title update
	 * @Description 更新定时策略
	 * @param kQuartz 定时策略对象
	 * @param uId 用户ID
	 * @return void
	 */
	public void update(KQuartz kQuartz, Integer uId){
		kQuartz.setEditTime(new Date());
		kQuartz.setEditUser(uId);
		//只有不为null的字段才参与更新
		kQuartzMapper.updateByPrimaryKey(kQuartz);
	}
}
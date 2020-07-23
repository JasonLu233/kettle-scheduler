package com.dimensoft.web.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.dimensoft.core.mapper.KTransRecordMapper;
import com.dimensoft.core.model.KTransRecord;
import com.dimensoft.core.model.KTransRecordExample;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimensoft.common.toolkit.Constant;
import com.dimensoft.core.dto.BootTablePage;

@Service
public class TransRecordService {

	@Autowired
	private KTransRecordMapper kTransRecordMapper;
	
	/**
	 * @Title getList
	 * @Description 获取列表
	 * @param start 其实行数
	 * @param size 结束行数
	 * @param uId 用户ID
	 * @param transId 转换ID
	 * @return
	 * @return BootTablePage
	 */
	public BootTablePage getList(Integer start, Integer size, Integer uId, Integer transId){
		KTransRecord template = new KTransRecord();
		template.setAddUser(uId);
		if (transId != null){
			template.setRecordTrans(transId);
		}
		KTransRecordExample example = new KTransRecordExample();
		example.createCriteria().andAddUserEqualTo(uId);
		List<KTransRecord> kTransRecordList = kTransRecordMapper.selectByExample(example);
		long totalCount = kTransRecordMapper.countByExample(example);
		BootTablePage bootTablePage = new BootTablePage();
		bootTablePage.setRows(kTransRecordList);
		bootTablePage.setTotal(totalCount);
		return bootTablePage;
	}
	
	/**
	 * @Title getLogContent
	 * @Description 转换日志内容
	 * @param recordId 转换记录ID
	 * @return
	 * @throws IOException
	 * @return String
	 */
	public String getLogContent(Integer recordId) throws IOException{
		KTransRecord kTransRecord = kTransRecordMapper.selectByPrimaryKey(recordId);
		String logFilePath = kTransRecord.getLogFilePath();
		return FileUtils.readFileToString(new File(logFilePath), Constant.DEFAULT_ENCODING);
	}
	
}
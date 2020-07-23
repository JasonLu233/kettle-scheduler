package com.dimensoft.web.service;

import com.dimensoft.core.dto.BootTablePage;
import com.dimensoft.core.mapper.KCategoryMapper;
import com.dimensoft.core.model.KCategory;
import com.dimensoft.core.model.KCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private KCategoryMapper kCategoryMapper;
  
    public List<KCategory> getList(Integer uId){
        List<KCategory> resultList = new ArrayList<KCategory>();
        KCategory kCategory = new KCategory();
        kCategory.setDelFlag(1);
        kCategory.setAddUser(uId);
        KCategoryExample example = new KCategoryExample();
        example.createCriteria().andDelFlagEqualTo(1).andAddUserEqualTo(uId);
        resultList.addAll(kCategoryMapper.selectByExample(example));
        return resultList;
    }
    
    public BootTablePage getList(Integer start, Integer size, Integer uId){
        KCategory kCategory = new KCategory();
        kCategory.setDelFlag(1);
        kCategory.setAddUser(uId);
        KCategoryExample example = new KCategoryExample();
        example.createCriteria().andDelFlagEqualTo(1).andAddUserEqualTo(uId);
        List<KCategory> kQuartzList = kCategoryMapper.selectByExample(example);
        long allCount = kCategoryMapper.countByExample(example);
        BootTablePage bootTablePage = new BootTablePage();
        bootTablePage.setRows(kQuartzList);
        bootTablePage.setTotal(allCount);
        return bootTablePage;
    }
 
    public KCategory getQuartz(Integer categoryId){
        return kCategoryMapper.selectByPrimaryKey(categoryId);
    }
    
    public void insert(KCategory kCategory, Integer uId){
        kCategory.setAddTime(new Date());
        kCategory.setAddUser(uId);
        kCategory.setEditTime(new Date());
        kCategory.setEditUser(uId);
        kCategory.setDelFlag(1);
        kCategoryMapper.insert(kCategory);
    }

    public void delete(Integer categoryId){
        KCategory kCategory = kCategoryMapper.selectByPrimaryKey(categoryId);
        kCategory.setDelFlag(0);
        kCategoryMapper.updateByPrimaryKey(kCategory);
    }

 
    public void update(KCategory kCategory, Integer uId){
        kCategory.setEditTime(new Date());
        kCategory.setEditUser(uId);
        //只有不为null的字段才参与更新
        kCategoryMapper.updateByPrimaryKey(kCategory);
    }

    public boolean IsCategoryExist(Integer categoryId,String categoryName) {
        KCategory template = new KCategory();
        template.setDelFlag(1);
        template.setCategoryName(categoryName);
        KCategoryExample example = new KCategoryExample();
        example.createCriteria().andDelFlagEqualTo(1).andCategoryNameEqualTo(categoryName);
        KCategory category = kCategoryMapper.selectOneByExample(example);
        if (null == category) {
            return false;
        } else if(categoryId!=null&&category.getCategoryId()==categoryId){
            return false;
        }else{
            return true;
        }
    }
}

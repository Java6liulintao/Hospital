package com.aaa.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.dao.ICClipDao;
import com.aaa.entity.Icclip;
@Repository
public class ICClipDaoImpl implements ICClipDao{
@Resource
private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
    //∞Ï¿ÌICø®
	@Override
	public void createICCard(Icclip IC) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.saveOrUpdate(IC);
	}
    //≤È—ØICø®
	@Override
	public List<Icclip> selectICCrad() {
		// TODO Auto-generated method stub
		List<Icclip> list=hibernateTemplate.find("from Icclip");
		return list;
	}
    //…æ≥˝ICø®
	@Override
	public void deleteICCard(Icclip IC) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(IC);
		
	}

}

package com.aaa.bizImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aaa.biz.ICClipBiz;
import com.aaa.dao.ICClipDao;
import com.aaa.entity.Icclip;
@Service
public class ICClipBizImpl implements ICClipBiz {
@Resource
private ICClipDao dao;

	public ICClipDao getDao() {
	return dao;
}

public void setDao(ICClipDao dao) {
	this.dao = dao;
}
    //����IC��
	@Override
	public void createICCard(Icclip IC) {
		// TODO Auto-generated method stub
        dao.createICCard(IC);
	}
    //��ѯIC��
	@Override
	public List<Icclip> selectICCrad() {
		// TODO Auto-generated method stub
		return dao.selectICCrad();
	}
    //ɾ��IC��
	@Override
	public void deleteICCard(Icclip IC) {
		// TODO Auto-generated method stub
        dao.deleteICCard(IC);
	}

}

package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Icclip;

public interface ICClipBiz {
    //����IC��
	public void createICCard(Icclip IC);
	//��ѯIC��
	public List<Icclip> selectICCrad();
	//ɾ��IC��
	public void deleteICCard(Icclip IC);
}

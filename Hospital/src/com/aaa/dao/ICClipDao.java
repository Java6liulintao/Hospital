package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Icclip;

public interface ICClipDao {
    //����IC��
	public void createICCard(Icclip IC);
	//��ѯIC��
	public List<Icclip> selectICCrad();
	//ɾ��IC��
	public void deleteICCard(Icclip IC);
}

package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Icclip;

public interface ICClipDao {
    //∞Ï¿ÌICø®
	public void createICCard(Icclip IC);
	//≤È—ØICø®
	public List<Icclip> selectICCrad();
	//…æ≥˝ICø®
	public void deleteICCard(Icclip IC);
}

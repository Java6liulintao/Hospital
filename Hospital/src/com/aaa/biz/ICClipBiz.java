package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Icclip;

public interface ICClipBiz {
    //∞Ï¿ÌICø®
	public void createICCard(Icclip IC);
	//≤È—ØICø®
	public List<Icclip> selectICCrad();
	//…æ≥˝ICø®
	public void deleteICCard(Icclip IC);
}

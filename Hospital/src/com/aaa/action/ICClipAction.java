package com.aaa.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.aaa.biz.ICClipBiz;
import com.aaa.entity.Icclip;

@Controller
public class ICClipAction extends BaseAction{
@Resource
private ICClipBiz biz;
private Icclip icclip;

public Icclip getIcclip() {
	return icclip;
}

public void setIcclip(Icclip icclip) {
	this.icclip = icclip;
}

public ICClipBiz getBiz() {
	return biz;
}

public void setBiz(ICClipBiz biz) {
	this.biz = biz;
}
//����IC��
public String createIC(){
	biz.createICCard(icclip);
	return "success";
}
//��ѯIC��
public String selectIC(){
	List list=biz.selectICCrad();
	getRequest().put("list", list);
	return "succcess";
}
//ɾ��IC��
public String updateIC(){
	biz.deleteICCard(icclip);
	return "success";
}
}

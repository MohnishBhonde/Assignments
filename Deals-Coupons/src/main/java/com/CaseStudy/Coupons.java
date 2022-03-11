package com.CaseStudy;

import org.springframework.data.annotation.Id;

public class Coupons {
	
	@Override
	public String toString() {
		return "Coupons [id=" + id + ", Cname=" + Cname + ", Info=" + Info + "]";
	}
	public Coupons(String id, String cname, String info) {
		super();
		this.id = id;
		Cname = cname;
		Info = info;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getInfo() {
		return Info;
	}
	public void setInfo(String info) {
		Info = info;
	}
	@Id
	public String id;
	public String Cname;
	public String Info;
	
	


	


	
	
	
	

}

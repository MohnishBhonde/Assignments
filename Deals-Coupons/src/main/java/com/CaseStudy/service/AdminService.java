package com.CaseStudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CaseStudy.Coupons;
import com.CaseStudy.CouponRepository;

@Service
public class AdminService {
	
	@Autowired
	private CouponRepository couponRepository;
	
	// create method
	public Coupons create(String id, String Cname, String Info)
	{
		return couponRepository.save(new Coupons(id,Cname,Info));
	}
	
	
	//retrive
	public List<Coupons> getAll()
	{
		return couponRepository.findAll();
	}
	public Coupons getByCname(String Cname)
	{
		return couponRepository.findByCname(Cname);
	}

	 //Update
	public Coupons update(String id , String Cname , String Info)
	{
		Coupons c = couponRepository.findByCname(Cname);
		c.setInfo(Info);
		c.setId(id);
		return couponRepository.save(c); 
		
	}
	
	//Delete
	public void deleteAll()
	{
		couponRepository.deleteAll();
	}
	public void delete(String Cname)
	{
		Coupons c = couponRepository.findByCname(Cname);
		couponRepository.delete(c);
	}
}

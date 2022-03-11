package com.CaseStudy.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CaseStudy.Coupons;
import com.CaseStudy.service.AdminService;


@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
@RequestMapping("/create")
	public String create(@RequestParam String Id , @RequestParam String Cname , @RequestParam String Info)
	{
		Coupons c = adminService.create(Id, Cname, Info);
		return c.toString();
		
	}
	
	@RequestMapping("/get")
	public Coupons getCoupons(@RequestParam String Cname)
	{
		return adminService.getByCname(Cname);
	}
	
	@RequestMapping("/getAll")
	public List<Coupons> getAll()
	{
		return adminService.getAll();
	}
	
	
	@RequestMapping("/update")
	public String update(@RequestParam String Id , @RequestParam String Cname , @RequestParam String Info)
	{
		Coupons c = adminService.update(Id, Cname, Info);
		return c.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String Cname)
	{
		adminService.delete(Cname);
		return "Deleted"+Cname;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		adminService.deleteAll();
		return "Deleted All Records";
	}
	

	
	
	
		
	
	
	
}
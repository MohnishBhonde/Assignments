package com.CaseStudy.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CaseStudy.Coupons;
import com.CaseStudy.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
/*	@RequestMapping("/create")
	public String create(@RequestParam String Id , @RequestParam String Fname , @RequestParam String Lname)
	{
		Customer c = customerService.create(Id, Fname, Lname);
		return c.toString();
		
	}
	*/
	@RequestMapping("/getOne")
	public Coupons getCoupons(@RequestParam String Cname)
	{
		return customerService.getByCname(Cname);
	}
	
	@RequestMapping("/getIt")
	public List<Coupons> getAll()
	{
		return customerService.getAll();
	}
	
	/*
	@RequestMapping("/update")
	public String update(@RequestParam String Id , @RequestParam String Fname , @RequestParam String Lname)
	{
		Customer c = customerService.update(Id, Fname, Lname);
		return c.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String Fname)
	{
		customerService.delete(Fname);
		return "Deleted"+Fname;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		customerService.deleteAll();
		return "Deleted All Records";
	}
	

	*/
	
	
		
	
	
	
}
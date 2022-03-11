package com.CaseStudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CaseStudy.Coupons;
import com.CaseStudy.CouponRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CouponRepository couponRepository;
	
	/*  // create method
	public Customer create(String id, String Fname, String Lname)
	{
		return customerRepository.save(new Customer(id ,Fname, Lname));
	}
	*/
	
	//retrive
	public List<Coupons> getAll()
	{
		return couponRepository.findAll();
	}
	public Coupons getByCname(String Cname)
	{
		return couponRepository.findByCname(Cname);
	}
}
	 /*//Update
	public Customer update(String id , String Fname , String Lname)
	{
		Customer c = customerRepository.findByFname(Fname);
		c.setLname(Lname);
		c.setId(id);
		return customerRepository.save(c); 
		
	}
	
	//Delete
	public void deleteAll()
	{
		customerRepository.deleteAll();
	}
	public void delete(String Fname)
	{
		Customer c = customerRepository.findByFname(Fname);
		customerRepository.delete(c);
	}
}
*/
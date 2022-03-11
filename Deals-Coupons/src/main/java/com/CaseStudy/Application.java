package com.CaseStudy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private CouponRepository couponRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Coupons c1 = new Coupons("1","Chinese"," 34MDSSCNJD23 -  50% off on Every Chinese cuisine upto 200Rs");
		Coupons c2 = new Coupons("2","Italian"," 35MBHWCNJD22 -  40% off on Every Italian Cuisine upto 150Rs");
		Coupons c3 = new Coupons("3","Indian","  36MDSSWOPD21 -  50% off on Every Indian cuisine upto 200Rs");
		Coupons c4 = new Coupons("4","Chinese"," 34MDSSNTJD23 -  50% off on Manchurian 50Rs");
		Coupons c5 = new Coupons("5","Italian"," 35MBHWPXJD22 -  40% off on Pizza upto 125Rs");
		Coupons c6 = new Coupons("6","Indian","  36MDSSQXND21 -  50% off on Pav Bhaji upto 100Rs");
		
		couponRepository.save(c1);
		couponRepository.save(c2);
		couponRepository.save(c3);
		couponRepository.save(c4);
		couponRepository.save(c5);
		couponRepository.save(c6);
		
		System.out.println("*************************");
		List<Coupons> coupon = couponRepository.findAll();
		for (Coupons c : coupon)
		{
			System.out.println(c.toString());
		}
	}

}

package com.CaseStudy;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface CouponRepository extends MongoRepository<Coupons, String>{

		public Coupons  findByCname(String cname);
		public Optional<Coupons> findById(String id);
	
	
}

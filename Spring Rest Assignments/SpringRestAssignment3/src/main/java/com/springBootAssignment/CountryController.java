package com.springBootAssignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CountryController
{
		@RequestMapping(value="/country/{zipcode}",method= RequestMethod.GET,headers="Accept=application/json")
		public CountryModels getCountryById(@PathVariable int zipcode)
		{
			List<CountryModels> listOfCountries= new ArrayList();
			listOfCountries=createCountryList();
			
			for(CountryModels country:listOfCountries)
			{
				if(country.getZipcode()==zipcode)
					return country;
			}
			return null;
		}

		@RequestMapping("/getInfo")
		public CountryModels getCountry(@RequestParam("code") String zcode)
		{
			long zipcode=Integer.parseInt(zcode);
			List<CountryModels> listOfCountries= new ArrayList();
			listOfCountries=createCountryList();
			
			for(CountryModels country:listOfCountries)
			{
				if(country.getZipcode()==zipcode)
					return country;
			}
			return null;
		}
		
		
		private List createCountryList() 
		{
			CountryModels m1=new CountryModels(440009,"Maharashtra","Nagpur","India");
			CountryModels m2=new CountryModels(534211,"NewYork","Quens","USA");
			CountryModels m3=new CountryModels(534212,"Maharashtra","Mumbai","India");
			CountryModels m4=new CountryModels(534213,"Nevada","vegas","USA");
			
			  List<CountryModels> listOfCountries = new ArrayList();
		        listOfCountries.add(m1);
		        listOfCountries.add(m2);
		        listOfCountries.add(m3);
		        listOfCountries.add(m4);
		        return listOfCountries;
			
		}
	
	
}
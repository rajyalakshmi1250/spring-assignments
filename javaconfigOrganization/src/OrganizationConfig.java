package com.capgemini.spring.configuration;

import com.capgemini.spring.model.*;

import java.util.*;
import java.io.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrganizationConfig
{
	
	public Address getAddress()
	{
		Address address = new Address("Vijayawad", "Andhra Pradesh");	
		return address;
	} 

	public List<String> getDirectors()
	{
		List<String> directors = new ArrayList<String>();
		directors.add("cherry"); 
		directors.add("sonu");
		return directors;
	}

	public Set<String> getBranches()
	{
		Set<String> branches = new HashSet<String>();
		branches.add("Computer");
		branches.add("IT");
		return branches;
	}

	public Map<String, String> getBranchWiseHead()
	{
		Map<String,String> branchWiseHead= new HashMap<>();
		branchWiseHead.put("bangalore","divya");
		branchWiseHead.put("hyderabad","santhi");
		branchWiseHead.put("pune","Premika");
		return branchWiseHead;
	}

	public Properties getIpAddress() 
	{
		FileReader reader=null;
		Properties ipAddress=null;
		try
		{
			reader=new FileReader("src/ip.properties");  
    			ipAddress=new Properties();  
    			ipAddress.load(reader);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ipAddress;
	}

	
	public Properties getDatabaseDetails() 
	{
		FileReader reader=null;
		Properties databaseDetails=null;
		try
		{
			reader=new FileReader("src/databaseDetails.properties"); 
      			databaseDetails=new Properties();  
    			databaseDetails.load(reader);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		 } 
		return databaseDetails;
	}

	@Bean
	public Organization organization()
	{
		Organization organization = new Organization();
		organization.setOrgId(1);
		organization.setOrgName("Samsung");
		organization.setMarketPrice(50000.0);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches(getBranches());
		organization.setBranchWiseHead(getBranchWiseHead());
		organization.setIpAddress(getIpAddress());
		organization.setDatabaseDetails(getDatabaseDetails());
		return organization;
	}
}
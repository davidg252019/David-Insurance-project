package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ClaimDao;
import com.spring.model.Claim;

@Service
public class ClaimServiceImpl implements ClaimService 
{
	@Autowired
	ClaimDao dao;
	
	public int addClaim(Claim c) {
		// TODO Auto-generated method stud
		return dao.addClaim(c);
	}

	public List<Claim> viewClaims() {
		// TODO Auto-generated method stub
		return null;
	}

}
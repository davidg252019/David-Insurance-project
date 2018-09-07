package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ClaimDao;
import com.spring.model.Claim;


/*================================================================================================
 * ClaimServiceImpl
 * -----------------------------------------------------------------------------------------------
 * 
 * This class pretty much just calls the ClaimDao methods. Implements all
 * methods in the ClaimService interface
 *================================================================================================ 
 */


@Service
public class ClaimServiceImpl implements ClaimService 
{
	@Autowired
	ClaimDao dao;
	
	public int addClaim(Claim c) 
	{
		return dao.addClaim(c);
	}

	public List<Claim> viewClaims() 
	{
		return dao.getClaims();
	}

	public List<Claim> viewClaims(String policyNum) 
	{
		return dao.getClaims(policyNum);
	}

	public Claim getClaim(int id) 
	{
		return dao.getClaim(id);
	}

}

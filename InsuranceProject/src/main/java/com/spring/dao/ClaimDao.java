package com.spring.dao;

import java.util.List;

import com.spring.model.Claim;

public interface ClaimDao 
{
	public int addClaim(Claim c);
	public List<Claim> getClaims();
	public List<Claim> getClaims(String policyNum);
	public Claim getClaim(int id);
}

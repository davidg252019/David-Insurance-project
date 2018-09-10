package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.service.*;

import com.spring.model.*;

@Controller
public class CustomerController {

	@Autowired
	ClaimService cs;

	@RequestMapping("/")
	public String index(Model model) 
	{
		Customer c = new Customer();
		model.addAttribute(c);
		return "index";
	}
	
	@RequestMapping("/clientLogin")
	public String clientLogin() {
		return "clientLogin";
	}
	
	@RequestMapping("/overview")
	public String overview() {
		return "customer/overview";
	}

	@RequestMapping("/makeclaim")
	public String makeClaim(Model mod) 
	{
		
		mod.addAttribute(new Claim());
		
		return "customer/makeClaim";
	}
	
	@RequestMapping("/checkClaim")
	public String checkClaim() {
		return "checkClaim";
	}
	
	@RequestMapping("/myClaims")
	public String myClaim() {
		return "myClaims";
	}

	@RequestMapping("/submitClaim")
	public String submitClaim(@ModelAttribute("claim") Claim cl, Model mod) 
	{
		cs.addClaim(cl);
		
		Customer c = new Customer();
		mod.addAttribute(c);
		
		return "index";
	}

}

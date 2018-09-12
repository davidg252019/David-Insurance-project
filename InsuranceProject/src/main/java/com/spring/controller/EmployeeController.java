package com.spring.controller;
import com.spring.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.ClaimService;
import com.spring.service.EmployeeService;
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	ClaimService claimService;

	@RequestMapping("/employeeLogin")
	public String empLogin(	Model model	) 
	{
		Employee e = new Employee();
		model.addAttribute(e);
//		model.addAttribute(employee.getUsername());
//		  model.addAttribute(employee.getPassword());
		  
		return "employee/employeeLogin";
	}
	
	@RequestMapping("/employeeOverview")
	public String employeeOverview(Model model) {
		List<Claim> activeClaims = claimService.getActiveClaims();
		
		model.addAttribute(activeClaims);
		Claim c = activeClaims.get(0);
		model.addAttribute(c);
		return "employee/employeeOverview";
		
	}
	
	@RequestMapping("/viewClaims")
	public String viewClaims() {
		return "employee/viewClaims";
	}

	@RequestMapping("/updateClaim") 
	public String updateClaim() {
		return "employee/updateClaim";
	}

	@RequestMapping("/viewReports")
	public String viewReports() {
		return "employee/viewReports";
	}

	@RequestMapping("/updateReport")
		public String updateReport() {
			return "employee/updateReport";
	}
	
}

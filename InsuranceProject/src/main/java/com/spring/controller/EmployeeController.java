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
import com.spring.service.ReportService;
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	ClaimService claimService;
	
	@Autowired
	ReportService reportService;

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
		
		model.addAttribute("claims", activeClaims);
		Claim c = activeClaims.get(0);
		model.addAttribute(c);
		return "employee/employeeOverview";
		
	}
	
	@RequestMapping("/viewClaims")
	public String viewClaims() {
		return "employee/viewClaims";
	}

	@RequestMapping("/editClaim") 
	public String editClaim(@ModelAttribute("claim") Claim claim,
			@ModelAttribute("assessors") Employee emp, Model model) {
	
		List<Employee> assessor = employeeService.viewEmployee(1);
		
		Claim c = claimService.getClaim(claim.getId());
		Report r = reportService.getReport(c.getReportId());
		
		model.addAttribute("assessors", assessor);
		model.addAttribute("claim", c);
		model.addAttribute("report", r);
		
		return "employee/editClaim";
	}
	
	@RequestMapping("/updateClaim")
	public String updateClaim(@ModelAttribute("claim") Claim claim, @ModelAttribute("report") Report report) {
		updateTheReport(report);
		claimService.updateClaim(claim);

		return "employee/updateClaim";
	}
	
	public int updateTheReport(Report r)
	{
		reportService.editReport(r);
		return 0;
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

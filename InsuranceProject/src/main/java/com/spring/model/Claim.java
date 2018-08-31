package com.spring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*================================================================================================
 * CLAIM CLASS
 * -----------------------------------------------------------------------------------------------
 * 
 * This class contains data regarding a singular claim made by the Insurer. It is created
 * when an Insurer submits a new claim and can be modified by the ClaimOfficer class 
 *================================================================================================ 
 */
@Entity
@Table(name="assinsurance_claim_tbl")
public class Claim 
{
	@Id
	private int claimId;
	
	private int claimPolicyNum;
	private String claimStatus;
	private Date inspectionDate,claimDate;
	private int assessor;
	
	
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public int getClaimPolicyNum() {
		return claimPolicyNum;
	}
	public void setClaimPolicyNum(int claimPolicyNum) {
		this.claimPolicyNum = claimPolicyNum;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	public Date getInspectionDate() {
		return inspectionDate;
	}
	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public Date getClaimDate() {
		return claimDate;
	}
	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}
	public int getAssessor() {
		return assessor;
	}
	public void setAssessor(int assessor) {
		this.assessor = assessor;
	}
	
	
	
}
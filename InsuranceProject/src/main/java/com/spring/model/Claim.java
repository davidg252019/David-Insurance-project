package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*================================================================================================
 * CLAIM CLASS
 * -----------------------------------------------------------------------------------------------
 * 
 * This class is Nothing more than a POJO class for a claim. Does nothing by itself.
 *================================================================================================ 
 */

//TEST!!
@Entity
@Table(name="assinsurance_claim_tbl")
public class Claim 
{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	private String policyNum;
	private int reportId, status, assessorId;
	private String claimDate,claimDescription,remark;
	public Claim(int id, String policyNum, int reportId, int status, int assessorId, String claimDate,
			String claimDescription, String remark) {
		super();
		this.id = id;
		this.policyNum = policyNum;
		this.reportId = reportId;
		this.status = status;
		this.assessorId = assessorId;
		this.claimDate = claimDate;
		this.claimDescription = claimDescription;
		this.remark = remark;
	}
	public Claim() {
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyNum() {
		return policyNum;
	}
	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAssessorId() {
		return assessorId;
	}
	public void setAssessorId(int assessorId) {
		this.assessorId = assessorId;
	}
	public String getClaimDate() {
		return claimDate;
	}
	public void setClaimDate(String claimDate) {
		this.claimDate = claimDate;
	}
	public String getClaimDescription() {
		return claimDescription;
	}
	public void setClaimDescription(String claimDescription) {
		this.claimDescription = claimDescription;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	
	
	
	
}

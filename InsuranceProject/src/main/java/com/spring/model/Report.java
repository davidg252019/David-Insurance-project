package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*================================================================================================
 * REPORT
 * -----------------------------------------------------------------------------------------------
 * 
 * POJO class for Report
 *================================================================================================ 
 */

@Entity
@Table(name="assinsurance_rprt_tbl")
public class Report {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(precision = 5)
	private int id;
	
	private String descr;
	@Column(precision = 5, scale = 2)
	private double repairCost;

	public Report()
	{
		
	}
	public Report(int id, String descr, double repairCost) {
		super();
		this.id = id;
		this.descr = descr;
		this.repairCost = repairCost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public double getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}
	
	
	
	

}

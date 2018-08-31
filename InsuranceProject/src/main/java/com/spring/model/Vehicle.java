package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*================================================================================================
 * VEHICLE
 * -----------------------------------------------------------------------------------------------
 * 
 * Can register account, submit claims (even without an account), view claims
 *================================================================================================ 
 */


@Entity
@Table(name="assinsurance_vehcl_tbl")
public class Vehicle 
{
	@Id
	private int id;
	private int year;
	private String make, model, liscenceId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLiscenceId() {
		return liscenceId;
	}
	public void setLiscenceId(String liscenceId) {
		this.liscenceId = liscenceId;
	}
	
	
	
}
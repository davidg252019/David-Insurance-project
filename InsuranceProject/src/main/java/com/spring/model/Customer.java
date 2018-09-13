package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*================================================================================================
 * CUSTOMER
 * -----------------------------------------------------------------------------------------------
 * 
 * POJO class for Customer
 *================================================================================================ 
 */

@Entity
@Table(name="assinsurance_cust_tbl")
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(precision = 5)
	private int id;
	@Column(length = 10)
	private String policyNum;
	@Column(length = 25)
	private String email,username,password, firstName, lastName;
	@Column(length = 1)
	boolean status;

	public Customer()
	{
		
	}

	public Customer(int id, String policyNum, String email, String username, String password, boolean status) {
		super();
		this.id = id;
		this.policyNum = policyNum;
		this.email = email;
		this.username = username;
		this.password = password;
		this.status = status;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}

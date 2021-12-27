package com.onlineslot.getslots;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(generator = "customer_generator")
	@SequenceGenerator(name = "customer_generator", sequenceName = "customer_sequence", initialValue = 1)
	private  Long customerid;
	

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	private String fname;

	private String lname;

	private String email;

	private Long phno;

	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String username;

	public Customer(String fname, String lname, String email, Long phn_no, String password,String username) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phno = phn_no;
		this.password = password;
		this.username=username;
	}


	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	Customer(){
		
	}
	
}

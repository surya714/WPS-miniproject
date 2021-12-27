package com.onlineslot.getslots;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "bank")
public class Banks {

	@Id
	@GeneratedValue(generator = "bank_generator")
	@SequenceGenerator(name = "bank_generator", sequenceName = "bank_sequence", initialValue = 1)
	private  Long bankid;
	
	private String address;
	
	private String  status;
	private String bank_name;
    
 
 private double lattitude;
 
 private double longitude;
 private Long location;
 private String bankname;
 private String starttime;
 private String endtime;
 private String Service;
public String getService() {
	return Service;
}
public void setService(String service) {
	Service = service;
}
public String getStarttime() {
	return starttime;
}
public void setStarttime(String starttime) {
	this.starttime = starttime;
}
public String getEndtime() {
	return endtime;
}
public void setEndtime(String endtime) {
	this.endtime = endtime;
}
public Long getBankid() {
	return bankid;
}
public void setBankid(Long bankid) {
	this.bankid = bankid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getBank_name() {
	return bank_name;
}
public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}
public double getLattitude() {
	return lattitude;
}
public void setLattitude(double lattitude) {
	this.lattitude = lattitude;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public Long getLocation() {
	return location;
}
public void setLocation(Long location) {
	this.location = location;
}
public String getBankname() {
	return bankname;
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}
}

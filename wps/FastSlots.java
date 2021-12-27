package com.onlineslot.getslots;

import java.sql.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FastSlots")
public class FastSlots{
	
	public FastSlots(Long otp,String type,String slotype,Long locid,Long userid)
	{
		this.otp=otp;
		this.type=type;
		this.slotype=slotype;
		this.locid=locid;
		this.userid=userid;
		
	}
	
	@Id
	@GeneratedValue(generator = "fast_slots_generator")
	@SequenceGenerator(name = "fast_slots_generator", sequenceName = "fast_slots_sequence", initialValue = 1)
	private Long id;
	private Long otp;
	private String type;
	private String slotype;
	private Long locid;
	private double lattitude;
	private double longitude;
	private Long userid;
	private String name;
	private String address;
	private int duration;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	private Date date;
	private String time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOtp() {
		return otp;
	}
	public void setOtp(Long otp) {
		this.otp = otp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSlotype() {
		return slotype;
	}
	public void setSlotype(String slotype) {
		this.slotype = slotype;
	}
	public Long getLocid() {
		return locid;
	}
	public void setLocid(Long locid) {
		this.locid = locid;
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
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	public FastSlots(){
		
	}
	
	
}

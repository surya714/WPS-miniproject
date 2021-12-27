package com.onlineslot.getslots;

public class User {
	Long id;
	String username;
	Long phnno;
	String name;
	String password;
	Long valid;
	public Long getValid() {
		return valid;
	}
	public void setValid(Long valid) {
		this.valid = valid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	User(){
		
	}
	public User(Long id,String name,Long Phno){
		this.id=id;
		this.username=name;
		this.phnno=Phno;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getPhnno() {
		return phnno;
	}
	public void setPhnno(Long phnno) {
		this.phnno = phnno;
	}
	
	
}


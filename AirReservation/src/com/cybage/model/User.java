package com.cybage.model;

public class User {
	private int uid;
	private String uname;
	private String upass;
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String uname, String upass, String email) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.email = email;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", email=" + email + "]";
	}
	
	
}

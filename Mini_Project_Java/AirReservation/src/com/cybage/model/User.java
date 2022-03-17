package com.cybage.model;

public class User {
	private int pid;
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private String contactNo;
	private String address;
	private String emailid;
	private String password;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int pid, String fname, String lname, String gender, int age, String contactNo, String address,
			String emailid, String password) {
		super();
		this.pid = pid;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.contactNo = contactNo;
		this.address = address;
		this.emailid = emailid;
		this.password = password;
	
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age=" + age
				+ ", contactNo=" + contactNo + ", address=" + address + ", emailid=" + emailid + ", password="
				+ password + "]";
	}




	
	
	
}

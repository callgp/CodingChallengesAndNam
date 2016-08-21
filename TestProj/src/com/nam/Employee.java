package com.nam;

public class Employee {

	public Employee(String name, String gender, String birth_date, String phone_number, String email_address,
			String job_position, String department) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth_date = birth_date;
		this.phone_number = phone_number;
		this.email_address = email_address;
		this.job_position = job_position;
		this.department = department;
	}
	public Employee(String name, String gender, String job_position, String department) {
		super();
		this.name = name;
		this.gender = gender;
		this.job_position = job_position;
		this.department = department;
	}
	public Employee(String name, String gender, String birth_date, String phone_number) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth_date = birth_date;
		this.phone_number = phone_number;
	}
	private String name;
	private  String gender;
	private String birth_date;
	private String phone_number;
	private String email_address;
	private String job_position;
	private String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getJob_position() {
		return job_position;
	}
	public void setJob_position(String job_position) {
		this.job_position = job_position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String work(){
		return null;
		
	}
	
	public String introduce(){
		return null;
		
	}
}

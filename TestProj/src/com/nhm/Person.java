package com.nam;

public class Person {
	private String name;	
	private  String sex;
	private String joinDate;
	private String ssn_number;
	private String address;
	private String job;
	private String shift;
	public Person(String name, String sex, String joinDate, String ssn_number, String address, String job,
			String shift) {
		super();
		this.name = name;
		this.sex = sex;
		this.joinDate = joinDate;
		this.ssn_number = ssn_number;
		this.address = address;
		this.job = job;
		this.shift = shift;
	}
	public Person(String name, String sex, String joinDate) {
		super();
		this.name = name;
		this.sex = sex;
		this.joinDate = joinDate;
	}
	public Person(String address, String job, String shift) {
		super();
		this.address = address;
		this.job = job;
		this.shift = shift;
	}
}

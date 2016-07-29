package com.missionsky.ipp.entity;

public class User {
	
	private String id;
	
	private String userName;
	
	private String description;
	
	private String password;

	private Integer age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(String id, String userName,Integer age,String password)
	{
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.password = password;
	}

	public User(String id, String userName,Integer age)
	{
		this.id = id;
		this.userName = userName;
		this.age = age;
	}
}

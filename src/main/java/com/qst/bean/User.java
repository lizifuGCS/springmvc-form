package com.qst.bean;

import java.util.List;
import java.util.Map;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String description;
	private List<String> myHobbies;
	private List<Integer> posts;
	private Integer origin;//籍贯
	private String sex;


	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Integer> getPosts() {
		return posts;
	}

	public void setPosts(List<Integer> posts) {
		this.posts = posts;
	}

	public Integer getId() {
		return id;
	}
	public List<String> getMyHobbies() {
		return myHobbies;
	}
	public void setMyHobbies(List<String> myHobbies) {
		this.myHobbies = myHobbies;
	}
	public Integer getOrigin() {
		return origin;
	}
	public void setOrigin(Integer origin) {
		this.origin = origin;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

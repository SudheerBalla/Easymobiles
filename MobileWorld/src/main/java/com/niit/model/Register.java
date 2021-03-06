package com.niit.model;


import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Register implements Serializable {
	@Id
	
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "mobile")
	private String mobile;
	
	
	@Column(name = "email")
	private String email;
	@Column
	public String role="user";
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
	
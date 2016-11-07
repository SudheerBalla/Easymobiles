package com.niit.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Register implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "uId")
	private int uId;
	
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuname() {
		return uname;
	}
	public void setuname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUmobno() {
		return umobno;
	}
	public void setUmobno(String umobno) {
		this.umobno = umobno;
	}
	public String getUemailid() {
		return uemailid;
	}
	public void setUemailid(String uemailid) {
		this.uemailid = uemailid;
	}
	@Column(name = "uname")
	private String uname;
	
	@Column(name = "upassword")
	private String upassword;
	
	@Column(name = "umobno")
	private String umobno;
	
	@Column(name="uadd")
	private String uadd;
	
	public String getUadd() {
		return uadd;
	}
	public void setUadd(String uadd) {
		this.uadd = uadd;
	}
	@Column(name = "uemailid")
	private String uemailid;
	
	
	@Transient
	private String role;
	@Transient
	private boolean enabled;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
	
	
	
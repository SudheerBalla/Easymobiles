package com.niit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="cid")
	
	private String cid;
	private String cname;
	private String cdescription;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		System.out.println("setttttttttttttttttttttttter catidddddddddddddddddddddd");
		this.cid = cid;
	}
	@Column (name="cname")
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Column(name="cdescription")
	public String getCdescription() {
		return cdescription;
	}
	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	} 
}

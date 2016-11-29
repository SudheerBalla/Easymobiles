package com.niit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Entity
@Table
@Component
public class Product implements Serializable {
	@Id
	@GeneratedValue
	@Column
	private String pid;
	@Column
	private String pname;
	@Column
	private String pdes;
	@Column
	private int pprice;
	@Column
	private int pstock;
	@Column
	private String supId;
	@Column
	private String catId;
	@Transient
	private MultipartFile pimage;
	
	public MultipartFile getPimage() {
		return pimage;
	}
	public void setPimage(MultipartFile pimage) {
		System.out.println("setter of imageeeeeeeeeeeeeeeeeeeeeeee ");
		System.out.println(pimage);
		this.pimage = pimage;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		System.out.println("setter of iidddddddddddddddddddddd ");
		
		
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdes() {
		return pdes;
	}
	public void setPdes(String pdes) {
		this.pdes = pdes;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getPstock() {
		return pstock;
	}
	public void setPstock(int pstock) {
		this.pstock = pstock;
	}
	public String getSupId() {
		return supId;
	}
	public void setSupId(String supId) {
		this.supId = supId;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}

}
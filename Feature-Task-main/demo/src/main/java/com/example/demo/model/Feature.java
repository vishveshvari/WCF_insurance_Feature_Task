package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Feature")
public class Feature {

	@Id
	@Column(name = "title")
    private String title;
	
	@Column(name = "Description")
    private String desc;

	@Column(name = "ClientList")
    private String clientList;
    
	@Column(name = "Priority")
    private Integer priority;
    
	@Column(name = "TargetDate")
    private Date targetDate;
    
	@Column(name = "ProductArea")
    private String productArea;
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getClientList() {
		return clientList;
	}

	public void setClientList(String clientList) {
		this.clientList = clientList;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

}

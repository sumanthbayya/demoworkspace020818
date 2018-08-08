package com.sumanthbayya.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Master_Category")
public class Master_Category implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	
	public Master_Category() {
	
	}

	@Id
	@Column(name="Master_Category_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long masterCategoryId;
	
	@Column(name="Master_Category_NAME")
	private String masterCategoryName;
	
	@ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="Master_Department_ID")
	private Master_Department department;
	
	@Column(name="Master_ACTV_F")
	private String masterDepActiveFlag;
	
	@Column(name="Master_Category_DESC")
	private String masterCategoryDesc;


	public Long getMasterCategoryId() {
		return masterCategoryId;
	}

	public void setMasterCategoryId(Long masterCategoryId) {
		this.masterCategoryId = masterCategoryId;
	}

	public String getMasterCategoryName() {
		return masterCategoryName;
	}

	public void setMasterCategoryName(String masterCategoryName) {
		this.masterCategoryName = masterCategoryName;
	}

	public Master_Department getDepartment() {
		return department;
	}

	public void setDepartment(Master_Department department) {
		this.department = department;
	}

	public String getMasterDepActiveFlag() {
		return masterDepActiveFlag;
	}

	public void setMasterDepActiveFlag(String masterDepActiveFlag) {
		this.masterDepActiveFlag = masterDepActiveFlag;
	}

	public String getMasterCategoryDesc() {
		return masterCategoryDesc;
	}

	public void setMasterCategoryDesc(String masterCategoryDesc) {
		this.masterCategoryDesc = masterCategoryDesc;
	}


	

	
}

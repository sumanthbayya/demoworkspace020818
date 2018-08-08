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
@Table(name="Master_Department")
public class Master_Department implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public Master_Department() {
	
	}

	@Id
	@Column(name="Master_Department_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long masterDepartmentId;
	
	@Column(name="Master_Department_NAME")
	private String masterDepartmentName;
	
	@ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="Master_Location_ID")
	private Master_Location location;
	
	@Column(name="Master_ACTV_F")
	private String masterDepActiveFlag;
	
	@Column(name="Master_Department_DESC")
	private String masterDepartmentDesc;


	public Long getMasterDepartmentId() {
		return masterDepartmentId;
	}

	public void setMasterDepartmentId(Long masterDepartmentId) {
		this.masterDepartmentId = masterDepartmentId;
	}

	public String getMasterDepartmentName() {
		return masterDepartmentName;
	}

	public void setMasterDepartmentName(String masterDepartmentName) {
		this.masterDepartmentName = masterDepartmentName;
	}

	public Master_Location getLocation() {
		return location;
	}

	public void setLocation(Master_Location location) {
		this.location = location;
	}

	public String getMasterDepActiveFlag() {
		return masterDepActiveFlag;
	}

	public void setMasterDepActiveFlag(String masterDepActiveFlag) {
		this.masterDepActiveFlag = masterDepActiveFlag;
	}

	public String getMasterDepartmentDesc() {
		return masterDepartmentDesc;
	}

	public void setMasterDepartmentDesc(String masterDepartmentDesc) {
		this.masterDepartmentDesc = masterDepartmentDesc;
	}

	
	
	

}

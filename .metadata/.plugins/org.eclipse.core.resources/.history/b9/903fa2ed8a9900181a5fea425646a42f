package com.vinay.entities;

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
@Table(name="SKU002_DEPARTMENT")
public class Department_SKU002 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public Department_SKU002() {
	
	}

	@Id
	@Column(name="SKU002_DEPARTMENT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long sku002DepartmentId;
	
	@Column(name="SKU002_DEPARTMENT_NAME")
	private String sku002DepartmentName;
	
	@ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="SKU001_LOCATION_ID")
	private Location_SKU001 location;
	
	@Column(name="SKU002_ACTV_F")
	private String sku002ActiveFlag;
	
	@Column(name="SKU002_DEPARTMENT_DESC")
	private String sku002DepartmentDesc;

	public Long getSku002DepartmentId() {
		return sku002DepartmentId;
	}

	public void setSku002DepartmentId(Long sku002DepartmentId) {
		this.sku002DepartmentId = sku002DepartmentId;
	}

	public String getSku002DepartmentName() {
		return sku002DepartmentName;
	}

	public void setSku002DepartmentName(String sku002DepartmentName) {
		this.sku002DepartmentName = sku002DepartmentName;
	}

	public Location_SKU001 getLocation() {
		return location;
	}

	public void setLocation(Location_SKU001 location) {
		this.location = location;
	}

	public String getSku002ActiveFlag() {
		return sku002ActiveFlag;
	}

	public void setSku002ActiveFlag(String sku002ActiveFlag) {
		this.sku002ActiveFlag = sku002ActiveFlag;
	}

	public String getSku002DepartmentDesc() {
		return sku002DepartmentDesc;
	}

	public void setSku002DepartmentDesc(String sku002DepartmentDesc) {
		this.sku002DepartmentDesc = sku002DepartmentDesc;
	}
	
	

}

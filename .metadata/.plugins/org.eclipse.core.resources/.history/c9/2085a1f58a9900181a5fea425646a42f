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
@Table(name="SKU003_CATEGORY")
public class Category_SKU003 implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	
	public Category_SKU003() {
	
	}

	@Id
	@Column(name="SKU003_CATEGORY_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long sku003CategoryId;
	
	@Column(name="SKU003_CATEGORY_NAME")
	private String sku003CategoryName;
	
	@ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="SKU002_DEPARTMENT_ID")
	private Department_SKU002 department;
	
	@Column(name="SKU003_ACTV_F")
	private String sku003ActiveFlag;
	
	@Column(name="SKU003_CATEGORY_DESC")
	private String sku003CategoryDesc;


	public Long getSku003CategoryId() {
		return sku003CategoryId;
	}

	public void setSku003CategoryId(Long sku003CategoryId) {
		this.sku003CategoryId = sku003CategoryId;
	}

	public String getSku003CategoryName() {
		return sku003CategoryName;
	}

	public void setSku003CategoryName(String sku003CategoryName) {
		this.sku003CategoryName = sku003CategoryName;
	}

	public Department_SKU002 getDepartment() {
		return department;
	}

	public void setDepartment(Department_SKU002 department) {
		this.department = department;
	}

	public String getSku003ActiveFlag() {
		return sku003ActiveFlag;
	}

	public void setSku003ActiveFlag(String sku003ActiveFlag) {
		this.sku003ActiveFlag = sku003ActiveFlag;
	}

	public String getSku003CategoryDesc() {
		return sku003CategoryDesc;
	}

	public void setSku003CategoryDesc(String sku003CategoryDesc) {
		this.sku003CategoryDesc = sku003CategoryDesc;
	}

	
}

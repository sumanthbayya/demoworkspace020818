package com.sumanthbayya.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Master_Location")
public class Master_Location implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Master_Location() {
		
	}

	@Id
	@Column(name="Master_Location_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long masterLocationId;
	
	@Column(name="Master_Location_NAME")
	private String masterLocationName;
	
	@Column(name="Master_Location_DESC")
	private String masterLocationDesc;
	
	@Column(name="Master_ACTV_F")
	private String masterActiveFlag;

	public Long getMasterLocationId() {
		return masterLocationId;
	}

	public void setMasterLocationId(Long masterLocationId) {
		this.masterLocationId = masterLocationId;
	}

	public String getMasterLocationName() {
		return masterLocationName;
	}

	public void setMasterLocationName(String masterLocationName) {
		this.masterLocationName = masterLocationName;
	}

	public String getMasterLocationDesc() {
		return masterLocationDesc;
	}

	public void setMasterLocationDesc(String masterLocationDesc) {
		this.masterLocationDesc = masterLocationDesc;
	}

	public String getMasterActiveFlag() {
		return masterActiveFlag;
	}

	public void setMasterActiveFlag(String masterActiveFlag) {
		this.masterActiveFlag = masterActiveFlag;
	}

	

	
	
	
	
}

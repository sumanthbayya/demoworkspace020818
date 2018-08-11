package com.sumanthbayya.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User_Profiles implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name="username")
	private String userName;
	
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_active")
	private String userActiveFlag;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getUserActiveFlag() {
		return userActiveFlag;
	}

	public void setUserActiveFlag(String userActiveFlag) {
		this.userActiveFlag = userActiveFlag;
	}

	public User_Profiles() {
		
	}
}

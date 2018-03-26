package com.entity;

import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userPicture;
	private String password;
	private String sex;
	private String userPhone;
	private String userBlogAddress;
	private Date userBirth;
	private String userInfo;
	private String bkImage;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	/** full constructor */
	public User(String userName, String userPicture, String password, String sex, String userPhone,
			String userBlogAddress, Date userBirth, String userInfo, String bkImage) {
		this.userName = userName;
		this.userPicture = userPicture;
		this.password = password;
		this.sex = sex;
		this.userPhone = userPhone;
		this.userBlogAddress = userBlogAddress;
		this.userBirth = userBirth;
		this.userInfo = userInfo;
		this.bkImage = bkImage;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPicture() {
		return this.userPicture;
	}

	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserBlogAddress() {
		return this.userBlogAddress;
	}

	public void setUserBlogAddress(String userBlogAddress) {
		this.userBlogAddress = userBlogAddress;
	}

	public Date getUserBirth() {
		return this.userBirth;
	}

	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public String getBkImage() {
		return this.bkImage;
	}

	public void setBkImage(String bkImage) {
		this.bkImage = bkImage;
	}

}
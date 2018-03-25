package com.entity;

import java.sql.Timestamp;

/**
 * Fans entity. @author MyEclipse Persistence Tools
 */

public class Fans implements java.io.Serializable {

	// Fields

	private Integer focusId;
	private Integer fansId;
	private Timestamp focusTime;
	private Integer userId;

	// Constructors

	/** default constructor */
	public Fans() {
	}

	/** minimal constructor */
	public Fans(Integer fansId, Integer userId) {
		this.fansId = fansId;
		this.userId = userId;
	}

	/** full constructor */
	public Fans(Integer fansId, Timestamp focusTime, Integer userId) {
		this.fansId = fansId;
		this.focusTime = focusTime;
		this.userId = userId;
	}

	// Property accessors

	public Integer getFocusId() {
		return this.focusId;
	}

	public void setFocusId(Integer focusId) {
		this.focusId = focusId;
	}

	public Integer getFansId() {
		return this.fansId;
	}

	public void setFansId(Integer fansId) {
		this.fansId = fansId;
	}

	public Timestamp getFocusTime() {
		return this.focusTime;
	}

	public void setFocusTime(Timestamp focusTime) {
		this.focusTime = focusTime;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
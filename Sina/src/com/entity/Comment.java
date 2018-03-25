package com.entity;

import java.sql.Timestamp;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Msg msg;
	private String commentContent;
	private Timestamp commentTime;
	private Integer userId;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Integer userId) {
		this.userId = userId;
	}

	/** full constructor */
	public Comment(Msg msg, String commentContent, Timestamp commentTime, Integer userId) {
		this.msg = msg;
		this.commentContent = commentContent;
		this.commentTime = commentTime;
		this.userId = userId;
	}

	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Msg getMsg() {
		return this.msg;
	}

	public void setMsg(Msg msg) {
		this.msg = msg;
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Timestamp getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Timestamp commentTime) {
		this.commentTime = commentTime;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
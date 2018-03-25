package com.entity;

import java.sql.Timestamp;

/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply implements java.io.Serializable {

	// Fields

	private Integer replyId;
	private Integer userId;
	private Integer repliedMsgId;
	private String replyContent;
	private Timestamp replyTime;

	// Constructors

	/** default constructor */
	public Reply() {
	}

	/** minimal constructor */
	public Reply(Integer userId, Integer repliedMsgId) {
		this.userId = userId;
		this.repliedMsgId = repliedMsgId;
	}

	/** full constructor */
	public Reply(Integer userId, Integer repliedMsgId, String replyContent, Timestamp replyTime) {
		this.userId = userId;
		this.repliedMsgId = repliedMsgId;
		this.replyContent = replyContent;
		this.replyTime = replyTime;
	}

	// Property accessors

	public Integer getReplyId() {
		return this.replyId;
	}

	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRepliedMsgId() {
		return this.repliedMsgId;
	}

	public void setRepliedMsgId(Integer repliedMsgId) {
		this.repliedMsgId = repliedMsgId;
	}

	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Timestamp getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Timestamp replyTime) {
		this.replyTime = replyTime;
	}

}
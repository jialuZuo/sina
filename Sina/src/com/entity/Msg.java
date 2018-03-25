package com.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Msg entity. @author MyEclipse Persistence Tools
 */

public class Msg implements java.io.Serializable {

	// Fields

	private Integer msgId;
	private String msgContent;
	private Integer msgCollectNum;
	private Integer msgForward;
	private Integer msgReplyNum;
	private Timestamp msgDate;
	private String msgIsForward;
	private Integer msgForwardId;
	private String masgLink;
	private Integer msgZanNum;
	private Integer userId;
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Msg() {
	}

	/** minimal constructor */
	public Msg(Integer userId) {
		this.userId = userId;
	}

	/** full constructor */
	public Msg(String msgContent, Integer msgCollectNum, Integer msgForward, Integer msgReplyNum, Timestamp msgDate,
			String msgIsForward, Integer msgForwardId, String masgLink, Integer msgZanNum, Integer userId,
			Set comments) {
		this.msgContent = msgContent;
		this.msgCollectNum = msgCollectNum;
		this.msgForward = msgForward;
		this.msgReplyNum = msgReplyNum;
		this.msgDate = msgDate;
		this.msgIsForward = msgIsForward;
		this.msgForwardId = msgForwardId;
		this.masgLink = masgLink;
		this.msgZanNum = msgZanNum;
		this.userId = userId;
		this.comments = comments;
	}

	// Property accessors

	public Integer getMsgId() {
		return this.msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public String getMsgContent() {
		return this.msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public Integer getMsgCollectNum() {
		return this.msgCollectNum;
	}

	public void setMsgCollectNum(Integer msgCollectNum) {
		this.msgCollectNum = msgCollectNum;
	}

	public Integer getMsgForward() {
		return this.msgForward;
	}

	public void setMsgForward(Integer msgForward) {
		this.msgForward = msgForward;
	}

	public Integer getMsgReplyNum() {
		return this.msgReplyNum;
	}

	public void setMsgReplyNum(Integer msgReplyNum) {
		this.msgReplyNum = msgReplyNum;
	}

	public Timestamp getMsgDate() {
		return this.msgDate;
	}

	public void setMsgDate(Timestamp msgDate) {
		this.msgDate = msgDate;
	}

	public String getMsgIsForward() {
		return this.msgIsForward;
	}

	public void setMsgIsForward(String msgIsForward) {
		this.msgIsForward = msgIsForward;
	}

	public Integer getMsgForwardId() {
		return this.msgForwardId;
	}

	public void setMsgForwardId(Integer msgForwardId) {
		this.msgForwardId = msgForwardId;
	}

	public String getMasgLink() {
		return this.masgLink;
	}

	public void setMasgLink(String masgLink) {
		this.masgLink = masgLink;
	}

	public Integer getMsgZanNum() {
		return this.msgZanNum;
	}

	public void setMsgZanNum(Integer msgZanNum) {
		this.msgZanNum = msgZanNum;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}
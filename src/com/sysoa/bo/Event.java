package com.sysoa.bo;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	protected int id;
	protected String title;
	protected Date start;
	protected Date end;
	protected String color;
	protected String backgroundColor;
	protected boolean editable;
	
	
	//custom
	protected int isExpire;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public int getIsExpire() {
		return isExpire;
	}
	public void setIsExpire(int isExpire) {
		this.isExpire = isExpire;
	}
	
	public String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		//this.status = status;
		if("0".equals(status)){
			this.status="未审批";
		}else if("1".equals(status)){
			this.status="审批通过";
		}else if("2".equals(status)){
			this.status="审批失败";
		}else{
			this.status="";
		}
	}
	
}

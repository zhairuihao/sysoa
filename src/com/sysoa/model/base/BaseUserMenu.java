package com.sysoa.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserMenu<M extends BaseUserMenu<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserid(java.lang.Integer userid) {
		set("userid", userid);
	}

	public java.lang.Integer getUserid() {
		return get("userid");
	}

	public void setMenuid(java.lang.Integer menuid) {
		set("menuid", menuid);
	}

	public java.lang.Integer getMenuid() {
		return get("menuid");
	}

	public void setState(java.lang.Integer state) {
		set("state", state);
	}

	public java.lang.Integer getState() {
		return get("state");
	}

	public void setOrderDate(java.util.Date orderDate) {
		set("order_date", orderDate);
	}

	public java.util.Date getOrderDate() {
		return get("order_date");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

}

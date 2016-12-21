package com.sysoa.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserOrganizUser<M extends BaseUserOrganizUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserOrganizId(java.lang.Integer userOrganizId) {
		set("user_organiz_id", userOrganizId);
	}

	public java.lang.Integer getUserOrganizId() {
		return get("user_organiz_id");
	}

	public void setUserUserId(java.lang.Integer userUserId) {
		set("user_user_id", userUserId);
	}

	public java.lang.Integer getUserUserId() {
		return get("user_user_id");
	}

	public void setUserUserName(java.lang.String userUserName) {
		set("user_user_name", userUserName);
	}

	public java.lang.String getUserUserName() {
		return get("user_user_name");
	}

	public void setCdate(java.util.Date cdate) {
		set("cdate", cdate);
	}

	public java.util.Date getCdate() {
		return get("cdate");
	}

	public void setCuserId(java.lang.Integer cuserId) {
		set("cuser_id", cuserId);
	}

	public java.lang.Integer getCuserId() {
		return get("cuser_id");
	}

	public void setCuserName(java.lang.String cuserName) {
		set("cuser_name", cuserName);
	}

	public java.lang.String getCuserName() {
		return get("cuser_name");
	}

}

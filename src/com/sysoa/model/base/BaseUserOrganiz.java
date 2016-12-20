package com.sysoa.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserOrganiz<M extends BaseUserOrganiz<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserOrganizName(java.lang.String userOrganizName) {
		set("user_organiz_name", userOrganizName);
	}

	public java.lang.String getUserOrganizName() {
		return get("user_organiz_name");
	}

	public void setUserOrganizType(java.lang.String userOrganizType) {
		set("user_organiz_type", userOrganizType);
	}

	public java.lang.String getUserOrganizType() {
		return get("user_organiz_type");
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

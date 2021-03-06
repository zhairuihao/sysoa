package com.sysoa.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseIntegratedHandling<M extends BaseIntegratedHandling<M>> extends Model<M> implements IBean {

	public void setHandlId(java.lang.Integer handlId) {
		set("handl_id", handlId);
	}

	public java.lang.Integer getHandlId() {
		return get("handl_id");
	}

	public void setIntegratedInfoId(java.lang.Integer integratedInfoId) {
		set("integrated_info_id", integratedInfoId);
	}

	public java.lang.Integer getIntegratedInfoId() {
		return get("integrated_info_id");
	}

	public void setHandlStatus(java.lang.String handlStatus) {
		set("handl_status", handlStatus);
	}

	public java.lang.String getHandlStatus() {
		return get("handl_status");
	}

	public void setHandlCon(java.lang.String handlCon) {
		set("handl_con", handlCon);
	}

	public java.lang.String getHandlCon() {
		return get("handl_con");
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

	public void setCuserOrganizId(java.lang.Integer cuserOrganizId) {
		set("cuser_organiz_id", cuserOrganizId);
	}

	public java.lang.Integer getCuserOrganizId() {
		return get("cuser_organiz_id");
	}

	public void setCuserOrganizName(java.lang.String cuserOrganizName) {
		set("cuser_organiz_name", cuserOrganizName);
	}

	public java.lang.String getCuserOrganizName() {
		return get("cuser_organiz_name");
	}

}

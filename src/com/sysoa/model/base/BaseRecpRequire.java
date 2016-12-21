package com.sysoa.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRecpRequire<M extends BaseRecpRequire<M>> extends Model<M> implements IBean {

	public void setRequireId(java.lang.Integer requireId) {
		set("require_id", requireId);
	}

	public java.lang.Integer getRequireId() {
		return get("require_id");
	}

	public void setRequireTrip(java.lang.String requireTrip) {
		set("require_trip", requireTrip);
	}

	public java.lang.String getRequireTrip() {
		return get("require_trip");
	}

	public void setRequireUsers(java.lang.String requireUsers) {
		set("require_users", requireUsers);
	}

	public java.lang.String getRequireUsers() {
		return get("require_users");
	}

	public void setRequireCars(java.lang.String requireCars) {
		set("require_cars", requireCars);
	}

	public java.lang.String getRequireCars() {
		return get("require_cars");
	}

	public void setRequireLive(java.lang.String requireLive) {
		set("require_live", requireLive);
	}

	public java.lang.String getRequireLive() {
		return get("require_live");
	}

	public void setRequireRoute(java.lang.String requireRoute) {
		set("require_route", requireRoute);
	}

	public java.lang.String getRequireRoute() {
		return get("require_route");
	}

	public void setConfirmFlag(java.lang.String confirmFlag) {
		set("confirm_flag", confirmFlag);
	}

	public java.lang.String getConfirmFlag() {
		return get("confirm_flag");
	}

	public void setRequireUserOrganiz(java.lang.String requireUserOrganiz) {
		set("require_user_organiz", requireUserOrganiz);
	}

	public java.lang.String getRequireUserOrganiz() {
		return get("require_user_organiz");
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

	public void setRecpApplyId(java.lang.Integer recpApplyId) {
		set("recp_apply_id", recpApplyId);
	}

	public java.lang.Integer getRecpApplyId() {
		return get("recp_apply_id");
	}

}

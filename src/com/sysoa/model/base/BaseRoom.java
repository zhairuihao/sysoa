package com.sysoa.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRoom<M extends BaseRoom<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setRoomSize(java.lang.String roomSize) {
		set("room_size", roomSize);
	}

	public java.lang.String getRoomSize() {
		return get("room_size");
	}

	public void setRoomPosition(java.lang.String roomPosition) {
		set("room_position", roomPosition);
	}

	public java.lang.String getRoomPosition() {
		return get("room_position");
	}

	public void setIsdelete(java.lang.String isdelete) {
		set("isdelete", isdelete);
	}

	public java.lang.String getIsdelete() {
		return get("isdelete");
	}

}

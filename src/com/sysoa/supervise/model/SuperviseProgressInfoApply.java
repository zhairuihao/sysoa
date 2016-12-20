package com.sysoa.supervise.model;

import com.sysoa.model.base.BaseSuperviseProgressInfoApply;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class SuperviseProgressInfoApply extends BaseSuperviseProgressInfoApply<SuperviseProgressInfoApply> {
	public static final SuperviseProgressInfoApply dao = new SuperviseProgressInfoApply();
	
	
    public SuperviseProgressInfoApply findbyinfoid(Integer infoid){
    	
    	return dao.find("select * from t_supervise_progress_info_apply spa where spa.supervise_progress_info_id = ?", infoid).get(0);
    }
}

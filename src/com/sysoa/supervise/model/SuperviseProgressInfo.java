package com.sysoa.supervise.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Page;
import com.sysoa.model.base.BaseSuperviseProgressInfo;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class SuperviseProgressInfo extends BaseSuperviseProgressInfo<SuperviseProgressInfo> {
	public static final SuperviseProgressInfo dao = new SuperviseProgressInfo();
	
	public Page<SuperviseProgressInfo> fingbyProId(Integer pageNumber, Integer pageSize, Integer proid){
		
		
		String select = "SELECT tspi.*,tspia.apply_status,tspia.apply_con,tspia.apply_date,tspia.apply_user_id,tspia.apply_user_name,tspia.apply_user_organiz_name,tspia.apply_user_organiz_id ";
		
		String sqlExceptSelect = " FROM t_supervise_progress_info tspi "
				
				+ " LEFT JOIN t_supervise_progress_info_apply tspia ON tspi.progress_info_id = tspia.supervise_progress_info_id "
				
				+ " WHERE tspi.supervise_progress_id = ? "
				
				+ " ORDER BY tspi.cdate desc";	
		
		return dao.paginate(pageNumber, pageSize, select, sqlExceptSelect, proid);
	}
	public SuperviseProgressInfo findbyinfoid(Integer infoid){
		String select = "SELECT tspi.*,tspia.apply_status, tspia.apply_con, tspia.apply_date,tspia.apply_user_id,tspia.apply_user_name,tspia.apply_user_organiz_name,tspia.apply_user_organiz_id ";
		
		String sqlExceptSelect = " FROM t_supervise_progress_info tspi "
				
				+ " LEFT JOIN t_supervise_progress_info_apply tspia ON tspi.progress_info_id = tspia.supervise_progress_info_id "
				
				+ " WHERE tspi.progress_info_id = ? ";
				
		return dao.find(select+sqlExceptSelect, infoid).size()>0 ? dao.find(select+sqlExceptSelect, infoid).get(0):null;
	}
	
	public SuperviseProgressInfo findbyProOrg(Integer proid, Integer orgid){
		
		String ssql = "SELECT * FROM t_supervise_progress_info sp WHERE sp.supervise_progress_id=?  AND sp.cuser_organiz_id=? ";
		
		return dao.find(ssql, proid, orgid).size()>0 ? dao.find(ssql, proid, orgid).get(0):null;
	}
	
	public List<SuperviseProgressInfo> findbyPro(Integer proid){
		
		String ssql = "SELECT * FROM t_supervise_progress_info sp WHERE sp.supervise_progress_id=? ";
		
		return dao.find(ssql, proid);
	}
}
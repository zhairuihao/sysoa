package com.sysoa.integrate.model;

import com.jfinal.plugin.activerecord.Page;
import com.sysoa.model.base.BaseIntegratedInfo;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class IntegratedInfo extends BaseIntegratedInfo<IntegratedInfo> {
	public static final IntegratedInfo dao = new IntegratedInfo();
	
	/**
	 * 查询申请单
	 * @param pageNumber
	 * @param pageSize
	 * @param organizid
	 * @return
	 */
	public Page<IntegratedInfo> queryByOrganizid(Integer pageNumber, Integer pageSize, Integer organizid){
		
		String select = " SELECT tii.*, tia.approval_status, tih.handl_status ";
		
		String sqlExceptSelect = " FROM t_integrated_info tii "
								+" LEFT JOIN t_integrated_approval tia ON tia.integrated_info_id = tii.info_id "
								+" LEFT JOIN t_integrated_handling tih ON tih.integrated_info_id = tii.info_id "
								+" WHERE tii.isdelete ='0' AND tii.isfinish = '0' ";
		if(organizid != 0){
			sqlExceptSelect		+=" AND tii.cuser_organiz_id = "+organizid;
		}
		sqlExceptSelect		+= " ORDER BY tii.cdate DESC ";		 
		
		return dao.paginate(pageNumber, pageSize, select, sqlExceptSelect);
	}
	
	public IntegratedInfo querybyid(Integer id){
		
		String ssql = "SELECT tii.*, tia.approval_id, tia.approval_status, tia.approval_idea, tia.cdate AS c_cdate, tih.handl_status, tih.handl_con "
					+" FROM t_integrated_info tii "
					+" LEFT JOIN t_integrated_approval tia ON tia.integrated_info_id = tii.info_id "
					+" LEFT JOIN t_integrated_handling tih ON tih.integrated_info_id = tii.info_id "
					+" WHERE tii.isdelete ='0' AND tii.info_id=? AND tii.isfinish = '0' ";
		
		return dao.find(ssql, id).get(0);
	}
	
}

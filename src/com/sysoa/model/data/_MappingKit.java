package com.sysoa.model.data;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("leader_info", "leaderid", LeaderInfo.class);
		arp.addMapping("leader_schedule", "id", LeaderSchedule.class);
		arp.addMapping("menu", "id", Menu.class);
		arp.addMapping("room", "id", Room.class);
		arp.addMapping("room_schedule", "id", RoomSchedule.class);
		arp.addMapping("t_integrated_approval", "approval_id", IntegratedApproval.class);
		arp.addMapping("t_integrated_handling", "handl_id", IntegratedHandling.class);
		arp.addMapping("t_integrated_info", "info_id", IntegratedInfo.class);
		arp.addMapping("t_news_app", "app_id", NewsApp.class);
		arp.addMapping("t_news_approval", "approval_id", NewsApproval.class);
		arp.addMapping("t_recp_apply", "apply_id", RecpApply.class);
		arp.addMapping("t_recp_feed", "feed_id", RecpFeed.class);
		arp.addMapping("t_recp_require", "require_id", RecpRequire.class);
		arp.addMapping("t_supervise_info", "info_id", SuperviseInfo.class);
		arp.addMapping("t_supervise_progress", "progress_id", SuperviseProgress.class);
		arp.addMapping("t_supervise_progress_info", "progress_info_id", SuperviseProgressInfo.class);
		arp.addMapping("t_supervise_progress_info_apply", "progress_info_apply_id", SuperviseProgressInfoApply.class);
		arp.addMapping("t_supervise_require", "dbrequire_id", SuperviseRequire.class);
		arp.addMapping("t_user_employer", "id", UserEmployer.class);
		arp.addMapping("t_user_menu", "id", UserMenu.class);
		arp.addMapping("t_user_message", "message_id", UserMessage.class);
		arp.addMapping("t_user_organiz", "id", UserOrganiz.class);
		arp.addMapping("t_user_organiz_employer", "id", UserOrganizEmployer.class);
		arp.addMapping("t_user_organiz_user", "id", UserOrganizUser.class);
		arp.addMapping("t_user_role", "id", UserRole.class);
		arp.addMapping("t_user_role_menu", "id", UserRoleMenu.class);
		arp.addMapping("t_user_role_user", "id", UserRoleUser.class);
		arp.addMapping("user", "id", User.class);
		arp.addMapping("user_menu", "id", UserMenu.class);
	}
}


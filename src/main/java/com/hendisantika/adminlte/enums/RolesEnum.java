package com.hendisantika.adminlte.enums;

import com.hendisantika.adminlte.common.Constant;;

public enum RolesEnum {

	ADMIN(1, Constant.ADMIN_ROLE_PREFIX, "ADMIN", "SUPER USER", ""),

	CSO(2, Constant.USER_ROLE, "CSO", "CLIENT SERVICE OFFICER",
			Constant.TERMINATED_REF + ":1 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":0 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	TL(3, Constant.USER_ROLE, "CSTL", "CLIENT SERVICE TEAM LEAD",
			Constant.TERMINATED_REF + ":1 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	CSM(4, Constant.USER_ROLE, "CSM", "CLIENT SERVICE MANAGER",
			Constant.TERMINATED_REF + ":1 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	TR(5, Constant.USER_ROLE, "TR", "TRADE REPRESENTATIVE",
			Constant.TERMINATED_REF + ":0 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":0 | " + Constant.UNCLAIM_REF + ":0 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	DCO(6, Constant.USER_ROLE, "DCO", "DESIGNATED CREDIT OFFICER",
			Constant.TERMINATED_REF + ":0 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	CO(7, Constant.USER_ROLE, "CO", "CREDIT OFFICER",
			Constant.TERMINATED_REF + ":0 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	SCO(8, Constant.USER_ROLE, "SCO", "SENIOR CREDIT OFFICER",
			Constant.TERMINATED_REF + ":0 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	AM(9, Constant.USER_ROLE, "AM", "ASSISTANT MANAGER",
			Constant.TERMINATED_REF + ":0 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	MGR(10, Constant.USER_ROLE, "MGR", "MANAGER",
			Constant.TERMINATED_REF + ":0 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	AD(10, Constant.USER_ROLE, "AD", "ASSISTANT DIRECTOR",
			Constant.TERMINATED_REF + ":0 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1"),

	DIR(11, Constant.USER_ROLE, "DIR", "DIRECTOR",
			Constant.TERMINATED_REF + ":0 | " + Constant.APPROVE_REF + ":1 | " + Constant.REJECT_REF
					+ ":1 | " + Constant.CLAIM_REF + ":1 | " + Constant.UNCLAIM_REF + ":1 | " + Constant.SAVE_REF
					+ ":1 | " + Constant.CANCEL_REF + ":1");

	private final int id;

	private final String roleName;
	private final String roleNamePrefix;
	private final String roleDescription;
	private final String roleAccessFunctionalties;

	private RolesEnum(int id, String roleNamePrefix, String roleName, String roleDescription,
			String roleAccessFunctionalties) {
		this.id = id;
		this.roleName = roleName;
		this.roleNamePrefix = roleNamePrefix;
		this.roleDescription = roleDescription;
		this.roleAccessFunctionalties = roleAccessFunctionalties;
	}

	public int getId() {
		return id;
	}

	public String getRoleName() {
		return roleName;
	}

	public String getRoleNamePrefix() {
		return roleNamePrefix;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public String getRoleAccessFunctionalties() {
		return roleAccessFunctionalties;
	}
}

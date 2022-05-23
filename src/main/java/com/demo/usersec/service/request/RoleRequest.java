package com.demo.usersec.service.request;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleRequest {

	@JsonProperty("roleUID")
	Long roleUID;

	@JsonProperty("roleName")
	String roleName;

	@JsonProperty("defaultScreenUID")
	String defaultScreenUID;

	@JsonProperty("active")
	int active;

	public Long getRoleUID() {
		return roleUID;
	}

	public void setRoleUID(Long roleUID) {
		this.roleUID = roleUID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDefaultScreenUID() {
		return defaultScreenUID;
	}

	public void setDefaultScreenUID(String defaultScreenUID) {
		this.defaultScreenUID = defaultScreenUID;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

}

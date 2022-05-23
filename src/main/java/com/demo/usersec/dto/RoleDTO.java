package com.demo.usersec.dto;

import lombok.Data;

@Data
public class RoleDTO {

	private Long roleUID;
	private String roleName;
	private String defaultScreenUID;
	private int active;


}

package com.demo.usersec.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class UserDTO {

	private Long userUid;
	private String fullName;
	private String userName;
	private String password;
	private String email;
	private Long contactNumber;
	private Long faxNumber;
	private int passcodeVerify;
	private Set<RoleDTO	> roles = new HashSet<>();

}

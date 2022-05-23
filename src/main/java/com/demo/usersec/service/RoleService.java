package com.demo.usersec.service;

import java.util.List;

import com.demo.usersec.dto.RoleDTO;
import com.demo.usersec.model.Role;
import com.demo.usersec.service.request.RoleRequest;

public interface RoleService {
	public Role addRole(RoleRequest request, Role role);

	public List<Role> getAllRole();

	Role createUpdate(RoleDTO role);

}

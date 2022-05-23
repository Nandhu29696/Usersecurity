package com.demo.usersec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.usersec.dto.RoleDTO;
import com.demo.usersec.model.Role;
import com.demo.usersec.service.RoleService;
import com.demo.usersec.service.request.RoleRequest;

@RestController
@RequestMapping(path = "v1/role")
public class RolesController {

	@Autowired
	RoleService roleService;

	@GetMapping(path = "/getAll")
	public List<Role> getAllRoles(Long id) {
		List<Role> roleList = roleService.getAllRole();

		return roleList;
	}

	@PutMapping(path = "/save")
	public Role saveRoleData(@RequestBody RoleDTO data) {
		Role role = roleService.createUpdate(data);

		return role;
	}

}

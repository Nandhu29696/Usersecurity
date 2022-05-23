package com.demo.usersec.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.usersec.dto.RoleDTO;
import com.demo.usersec.model.Role;
import com.demo.usersec.repository.RoleRepository;
import com.demo.usersec.service.RoleService;
import com.demo.usersec.service.request.RoleRequest;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepo;

	@Override
	public Role addRole(RoleRequest request, Role role) {
		role.setRoleName(request.getRoleName());
		role.setActive(request.getActive());
		role.setDefaultScreenUID(request.getDefaultScreenUID());

		role = roleRepo.save(role);

		return role;
	}

	@Override
	public List<Role> getAllRole() {
		return roleRepo.findAll();
	}

	@Override
	public Role createUpdate(RoleDTO roleDTO) {

		Role role = roleRepo.save(roleDTO);
		return role;
	}

}

package com.demo.usersec.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.usersec.dto.UserDTO;
import com.demo.usersec.jwt.JwtUserDetails;
import com.demo.usersec.model.User;
import com.demo.usersec.model.UserRoleMap;
import com.demo.usersec.repository.UserRepository;
import com.demo.usersec.service.request.UserRequest;

@Service
public interface JwtUserDetailsService extends UserDetailsService {

	// @Autowired
	// private JwtUserDetails jwtUserDetails;

	/*
	 * static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();
	 * 
	 * static { inMemoryUserList.add(new JwtUserDetails(1L, "user",
	 * "$2a$10$KZ6PbidkqRx1MdUw8yey0O2Z9l523wYRE5Ld71zVQZGwCOFqDEHCi",
	 * "ROLE_USER_2")); }
	 */

	@Override
	public UserDetails loadUserByUsername(String username);

	public String getFullName();

	public User save(UserRequest userReq);

	/*
	 * @Override public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException { Optional<JwtUserDetails> findFirst =
	 * inMemoryUserList.stream() .filter(user ->
	 * user.getUsername().equals(username)).findFirst();
	 * 
	 * if (!findFirst.isPresent()) { throw new
	 * UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username)); }
	 * 
	 * return findFirst.get(); }
	 */
}

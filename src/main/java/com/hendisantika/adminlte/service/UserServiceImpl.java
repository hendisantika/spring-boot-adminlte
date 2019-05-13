package com.hendisantika.adminlte.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.Role;
import com.hendisantika.adminlte.model.User;
import com.hendisantika.adminlte.model.UserRole;
import com.hendisantika.adminlte.repository.UserRepository;
import com.hendisantika.adminlte.repository.UserRoleRepository;

@Service
public class UserServiceImpl extends AbstractService<User, Long> {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRoleRepository userRoleRepository;
	

	@Override
	protected JpaRepository<User, Long> getRepository() {
		return userRepository;
	}

	@SuppressWarnings("unused")
	public User saveUser(User user) {
		Set<UserRole> userRoleSet = new HashSet<>();
		long userId=user.getId();


		long[] roleIds = new long[user.getRoleIds().length];

		if (user.getId() > 0) 
		{
			userRoleRepository.deleteByUserId(userId);
		}
		for (int i = 0; i < user.getRoleIds().length; i++) {

			Role tmpRole = new Role();
			roleIds[i] = user.getRoleIds()[i];
			
			tmpRole.setId(user.getRoleIds()[i]);

			UserRole newTmpUserRole = new UserRole(user, tmpRole);
			userRoleSet.add(newTmpUserRole);

			user.setUserRoles(userRoleSet);
			

		}
		User savedUser = save(user);

		return savedUser;

		

	}

	public void deleteUser(Long id) {
		userRoleRepository.deleteByUserId(id);
		delete(id);

	}

	@Override
	public User update(User entity, Long id) {
		return super.update(entity, id);
	}

}

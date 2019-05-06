package com.hendisantika.adminlte.service;

import com.hendisantika.adminlte.model.Role;
import com.hendisantika.adminlte.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService<Role, Long> {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	protected JpaRepository<Role, Long> getRepository() {
		return roleRepository;
	}

}

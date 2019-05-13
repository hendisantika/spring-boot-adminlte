package com.hendisantika.adminlte.service;

import com.hendisantika.adminlte.model.User;


public interface UserService {

	
	void deleteUser(Long id);
	User saveUser(User user);
}

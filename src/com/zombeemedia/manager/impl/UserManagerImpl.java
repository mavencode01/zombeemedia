package com.zombeemedia.manager.impl;

import org.springframework.stereotype.Component;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.User;
import com.zombeemedia.manager.UserManager;

@Component("userManager")
public class UserManagerImpl extends ManagerImpl implements UserManager {

	@Override
	public AppResponse signUp(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse auth(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}

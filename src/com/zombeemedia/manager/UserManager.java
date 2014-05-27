package com.zombeemedia.manager;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.User;

public interface UserManager {
	public AppResponse signUp(User user);

	public AppResponse auth(String email, String password);
}

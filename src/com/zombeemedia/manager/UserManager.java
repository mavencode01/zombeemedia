package com.zombeemedia.manager;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.User;
import com.zombeemedia.exception.UserException;

public interface UserManager {
	public AppResponse signUp(User user) throws UserException;

}

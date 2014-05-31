package com.zombeemedia.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.base.Strings;
import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.User;
import com.zombeemedia.exception.UserException;
import com.zombeemedia.manager.UserManager;
import com.zombeemedia.repository.UserRepository;
import com.zombeemedia.utils.Constants;

@Component("userManager")
public class UserManagerImpl extends ManagerImpl implements UserManager {

	@Autowired
	UserRepository userRepository;

	@Override
	public AppResponse signUp(User user) throws UserException {

		StringBuilder sbError = new StringBuilder("User signup failed\n");

		if (!validateUser(user, sbError)) {
			throw new UserException(sbError.toString(), Constants.MISSING_REQUIRED_FIELDS);
		}

		userRepository.save(user);
		return new AppResponse(Constants.SUCCESS);
	}

	private boolean validateUser(User user, StringBuilder sbError) {
		boolean isValid = true;

		if (user == null) {
			sbError.append("Missing required fileds");
			isValid = false;
			return isValid;
		} else {
			if (Strings.isNullOrEmpty(user.getFirstname())) {
				sbError.append("First name required\n");
				isValid = false;
			}

			if (Strings.isNullOrEmpty(user.getLastname())) {
				sbError.append("Last name required\n");
				isValid = false;
			}

			if (Strings.isNullOrEmpty(user.getAge())) {
				sbError.append("Age required\n");
				isValid = false;
			}

			if (Strings.isNullOrEmpty(user.getEmail())) {
				sbError.append("Email required\n");
				isValid = false;
			}
			if (Strings.isNullOrEmpty(user.getPassword())) {
				sbError.append("Age required\n");
				isValid = false;
			}

			if (Strings.isNullOrEmpty(user.getPassword())) {
				sbError.append("Gender required\n");
				isValid = false;
			}

			return isValid;
		}
	}
}

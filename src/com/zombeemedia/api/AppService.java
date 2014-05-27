package com.zombeemedia.api;

import com.zombeemedia.manager.impl.ManagerFactory;

public abstract class AppService {

	protected ManagerFactory getInstance() {
		return ManagerFactory.getInstance();
	}

}

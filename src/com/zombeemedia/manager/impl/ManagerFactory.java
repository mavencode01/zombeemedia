package com.zombeemedia.manager.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zombeemedia.manager.ContentManager;
import com.zombeemedia.manager.MerchantManager;
import com.zombeemedia.manager.StatsManager;
import com.zombeemedia.manager.UserManager;
import com.zombeemedia.manager.ZombeeManager;

public class ManagerFactory implements ApplicationContextAware {

	private static ManagerFactory instance = new ManagerFactory();
	private static ApplicationContext applicationContext;

	private ManagerFactory() {
	}

	public static ManagerFactory getInstance() {
		return instance;
	}

	public UserManager getUserManager() {
		return applicationContext.getBean("userManager", UserManager.class);
	}

	public MerchantManager getMerchantManager() {
		return applicationContext.getBean("merchantManager", MerchantManager.class);
	}

	public ContentManager getContentManager() {
		return applicationContext.getBean("contentManager", ContentManager.class);
	}

	public StatsManager getStaManager() {
		return applicationContext.getBean("statsManager", StatsManager.class);
	}

	public ZombeeManager getZombeeManager() {
		return applicationContext.getBean("zombeeManager", ZombeeManager.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ManagerFactory.applicationContext = applicationContext;
	}
}
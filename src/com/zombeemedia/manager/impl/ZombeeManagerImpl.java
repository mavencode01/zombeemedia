package com.zombeemedia.manager.impl;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.AppResponseList;
import com.zombeemedia.entity.Zombee;
import com.zombeemedia.manager.ZombeeManager;

@Component("zombeeManager")
public class ZombeeManagerImpl extends ManagerImpl implements ZombeeManager {

	@Override
	public AppResponse addZombee(Zombee zombee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse updateZombee(Zombee zombee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse getZombee(String zombeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse removeZombee(String zombeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponseList<Zombee> listZombees(Page<?> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse listZombees(String merchantId) {
		// TODO Auto-generated method stub
		return null;
	}

}

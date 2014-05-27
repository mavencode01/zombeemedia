package com.zombeemedia.manager.impl;

import org.springframework.stereotype.Component;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.Merchant;
import com.zombeemedia.manager.MerchantManager;

@Component("merchantManager")
public class MerchantManagerImpl extends ManagerImpl implements MerchantManager {

	@Override
	public AppResponse addMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse removeMerchant(String merchantId) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.zombeemedia.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.base.Strings;
import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.Merchant;
import com.zombeemedia.exception.MerchantException;
import com.zombeemedia.manager.MerchantManager;
import com.zombeemedia.repository.MerchantRepository;
import com.zombeemedia.utils.Constants;

@Component("merchantManager")
public class MerchantManagerImpl extends ManagerImpl implements MerchantManager {

	@Autowired
	MerchantRepository merchantRepository;

	@Override
	public AppResponse addMerchant(Merchant merchant) throws MerchantException {
		if (merchant == null || Strings.isNullOrEmpty(merchant.getName())) {
			throw new MerchantException("Failed to save merchant - required fields missing", Constants.MISSING_REQUIRED_FIELDS);
		}
		merchantRepository.save(merchant);
		return new AppResponse(Constants.SUCCESS);
	}

	@Override
	public AppResponse removeMerchant(String merchantId) throws MerchantException {
		Merchant merchant = merchantRepository.findOne(merchantId);
		if (merchant == null) {
			throw new MerchantException("Merchant does not exist", Constants.NO_SUCH_MERCHANT);
		}

		merchant.setMarkDelete(true);
		merchantRepository.save(merchant);

		return new AppResponse(Constants.SUCCESS);
	}

}

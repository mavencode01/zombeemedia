package com.zombeemedia.manager;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.Merchant;
import com.zombeemedia.exception.MerchantException;

public interface MerchantManager {

	public AppResponse addMerchant(Merchant merchant) throws MerchantException;

	public AppResponse removeMerchant(String merchantId) throws MerchantException;
}

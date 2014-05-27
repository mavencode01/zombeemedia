package com.zombeemedia.manager;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.Merchant;

public interface MerchantManager {

	public AppResponse addMerchant(Merchant merchant);

	public AppResponse removeMerchant(String merchantId);
}

package com.zombeemedia.manager;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.AppResponseList;
import com.zombeemedia.entity.Zombee;
import com.zombeemedia.exception.ZombeeException;

public interface ZombeeManager {

	public AppResponse addZombee(Zombee zombee) throws ZombeeException;

	public AppResponse updateZombee(Zombee zombee) throws ZombeeException;

	public Zombee getZombee(String zombeeId) throws ZombeeException;

	public AppResponse removeZombee(String zombeeId) throws ZombeeException;;

	public AppResponseList<List<Zombee>> listZombees(Pageable page) throws ZombeeException;

	/**
	 * List all Zombees that carries a particular merchant content
	 * 
	 * @param merchantId
	 * @return
	 * @throws ZombeeException
	 */
	public AppResponseList<List<Zombee>> listMerchantZombees(String merchantId) throws ZombeeException;
}

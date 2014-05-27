package com.zombeemedia.manager;

import org.springframework.data.domain.Page;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.AppResponseList;
import com.zombeemedia.entity.Zombee;

public interface ZombeeManager {

	public AppResponse addZombee(Zombee zombee);

	public AppResponse updateZombee(Zombee zombee);

	public AppResponse getZombee(String zombeeId);

	public AppResponse removeZombee(String zombeeId);

	public AppResponseList<Zombee> listZombees(Page<?> page);

	public AppResponse listZombees(String merchantId);
}

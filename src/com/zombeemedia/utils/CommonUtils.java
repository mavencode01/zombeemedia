package com.zombeemedia.utils;

import org.springframework.data.domain.PageRequest;

public class CommonUtils {

	public static PageRequest pageRequest(int page, int size) {
		if (size == 0)
			size = 10;
		return new PageRequest(page, size);
	}
}

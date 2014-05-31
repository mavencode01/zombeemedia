package com.zombeemedia.predicates;

import com.zombeemedia.entity.Content;

public interface Predicate {
	public boolean isValid(Content content);
}

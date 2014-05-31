package com.zombeemedia.predicates;

import com.zombeemedia.entity.Content;

public abstract class PredicateFactory {

	protected Content content;
	protected Predicate precate;

	public abstract Content getContent();
}

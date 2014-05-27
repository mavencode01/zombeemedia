package com.zombeemedia.event;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;

import com.mongodb.DBObject;
import com.zombeemedia.entity.BaseEntity;

public class BaseModelEventListner extends AbstractMongoEventListener<BaseEntity> {

	@Autowired
	private Validator validator;

	@Override
	public void onBeforeSave(BaseEntity source, DBObject dbo) {
		Set<ConstraintViolation<BaseEntity>> violations = validator.validate(source);

		if (violations.size() > 0) {
			throw new ConstraintViolationException(violations);
		}
	}

	@Override
	public void onBeforeConvert(BaseEntity source) {
		if (source.getCreationTime() == null) {
			source.setCreationTime(new DateTime());
			source.setLastUpdate(new DateTime());
		} else {
			source.setLastUpdate(new DateTime());
		}
		super.onBeforeConvert(source);

	}

}

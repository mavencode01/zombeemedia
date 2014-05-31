package com.zombeemedia.exception;

import java.util.logging.Logger;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.zombeemedia.utils.Constants;

@Provider
public class AppExceptionMapper implements ExceptionMapper<Exception> {

	private static final Logger LOGGER = Logger.getLogger(AppExceptionMapper.class.getName());
	
	@Context
	private HttpHeaders headers;

	@Override
	public Response toResponse(Exception fEx) {
		LOGGER.severe(fEx.getMessage());
		return Response.status(Response.Status.BAD_REQUEST).entity(new ErrorResponseConverter("Technical Error: " + fEx.getMessage(), Constants.TECHINICAL_ERORR)).type(headers.getMediaType()).build();
	}

}

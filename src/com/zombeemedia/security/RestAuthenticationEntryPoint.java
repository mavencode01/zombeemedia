package com.zombeemedia.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component("restAuthenticationEntryPoint")
public class RestAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
		// response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.getOutputStream().println("{ \"error\": \"" + authException.getMessage() + "\" }");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		setRealmName("beaconinside");
		super.afterPropertiesSet();
	}
}
package io.github.leonilsouza.apipedido.services;

import org.springframework.security.core.context.SecurityContextHolder;

import io.github.leonilsouza.apipedido.security.UserSS;

public class UserService {

	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
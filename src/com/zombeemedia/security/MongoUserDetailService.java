package com.zombeemedia.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.google.common.collect.Sets;
import com.zombeemedia.repository.UserRepository;

@Service("userDetailsService")
public class MongoUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		com.zombeemedia.entity.User user = userRepository.findByEmail(email);
		if (user == null) {
			return null;
		}

		Collection<SimpleGrantedAuthority> authorities = Sets.newHashSet();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		return new User(user.getId(), user.getPassword(), true, true, true, true, authorities);
	}
}

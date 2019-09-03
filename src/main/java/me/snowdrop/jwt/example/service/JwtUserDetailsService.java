package me.snowdrop.jwt.example.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("snowdrop".equals(username)) {
			return new User("snowdrop", "password",
					new ArrayList<>());
			//$2a$10$3Leht.7eClhs5wXwLVNZqeFsSsUUrbCyuzSPmP/1hqdBgqGkVSS1C
			//$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
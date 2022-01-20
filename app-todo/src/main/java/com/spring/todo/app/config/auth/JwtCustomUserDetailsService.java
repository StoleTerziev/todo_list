package com.spring.todo.app.config.auth;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.todo.app.model.User;
import com.spring.todo.app.repository.UserRepository;

@Service
public class JwtCustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> user = userRepository.findByUsername(username);

		if (!user.isPresent()) {
			throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}

		return UserPrincipal.create(user.get());
	}

	@Transactional
	public UserDetails loadUserById(Long id) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with id : " + id));

		return UserPrincipal.create(user);
	}

}

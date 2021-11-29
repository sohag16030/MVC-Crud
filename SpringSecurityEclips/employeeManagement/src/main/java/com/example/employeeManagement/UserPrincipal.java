package com.example.employeeManagement;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserPrincipal implements UserDetails {

	private String username;
	private String password;
	private List<GrantedAuthority> grantedAuthorities;

	public UserPrincipal(User user) {
		this.username = user.getUsername();
		this.password = user.getPassword();

		/*
		 * this.grantedAuthorities = Arrays.stream(user.getRoles().split(","))
		 * .map(SimpleGrantedAuthority::new).collect(Collectors.toList());
		 */

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.getAuthorities();
	}

	@Override
	public String getPassword() {
		return this.getPassword();
	}

	@Override
	public String getUsername() {
		return this.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}

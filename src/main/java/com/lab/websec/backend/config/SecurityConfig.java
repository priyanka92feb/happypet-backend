package com.lab.websec.backend.config;

import org.springframework.context.annotation.Configuration;

public class SecurityConfig {

	/*
	 * @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
	 * Exception { http.cors() .and() .authorizeRequests()
	 * .antMatchers(HttpMethod.GET, "/user/info", "/happypet/newPetItems/**")
	 * .hasAuthority("SCOPE_read") .antMatchers(HttpMethod.POST,
	 * "/happypet/newPetItems") .hasAuthority("SCOPE_write") .anyRequest()
	 * .authenticated() .and() .oauth2ResourceServer() .jwt(); return http.build();
	 * }
	 */
}
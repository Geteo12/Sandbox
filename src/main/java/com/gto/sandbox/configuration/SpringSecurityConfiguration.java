package com.gto.sandbox.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity; 

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http)throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/users").hasRole("ADMIN")
			.antMatchers("/users/limited").hasRole("USER")
			.anyRequest().authenticated()
			.and()
			.formLogin();
	}
	
}

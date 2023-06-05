package com.mindtree.departmentmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	      .authorizeRequests()
	      .antMatchers("/Dept/*").authenticated()
	      .antMatchers("/").permitAll()
	      .and().oauth2Login()
	      .failureUrl("/login?error")
	      .defaultSuccessUrl("/");
	    }
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}

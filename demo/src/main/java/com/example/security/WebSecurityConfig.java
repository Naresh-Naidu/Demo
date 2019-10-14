
package com.example.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override protected void configure(HttpSecurity http) throws Exception { 
		//  TODO Auto-generated method stub //super.configure(http);
  
  
	  http .authorizeRequests() .antMatchers("/h2").permitAll()
	  .antMatchers("/hello").hasRole("USER").and().formLogin().failureUrl("/login").failureForwardUrl("/login");
		/*
		 * http.headers().frameOptions().disable(); http.csrf().disable();
		 */
	  
  
	  //http .authorizeRequests() .anyRequest() .authenticated() .and()
	  //.httpBasic().and().headers().frameOptions().disable();
	  
  }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
		// TODO Auto-generated method stub
		// //super.configure(auth);
		auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER");
	}
}

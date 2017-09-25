package com.aboo.vzoo.authcenter.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
/*		http.formLogin().permitAll().successHandler(authenticationSuccessHandler())
		.and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		.and().headers().frameOptions().disable()
		.and().authorizeRequests()
		.antMatchers("/regist","/toregist").permitAll().anyRequest().authenticated()
		.and()
		.logout()
		.deleteCookies("remove")
		.invalidateHttpSession(false)
		.logoutUrl("/logout")
		.logoutSuccessUrl("/logoutsuccess")
		.and().rememberMe()
		.and()
		.httpBasic()
		.and()
		.sessionManagement()
        .maximumSessions(1)
        .expiredUrl("/login?expired");*/
		
		
	      http.csrf().disable().formLogin().permitAll()
	      .and()
	      .csrf().disable()
        .authorizeRequests().antMatchers("/me","/user","/oauth/token","/oauth/authorize").permitAll()
            .anyRequest().permitAll();
		
	}
	
}

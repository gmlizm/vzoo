package com.aboo.vzoo.authcenter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

//@Configuration
//@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	private static final String RESOURCE_ID = "restservice";

	@Autowired
	private TokenStore tokenStore;

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.tokenStore(tokenStore).resourceId(RESOURCE_ID);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
//		http.formLogin().loginPage("/login").permitAll()
//				.permitAll() /*.successHandler(loginSuccessHandler())*/
//				.and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and()
//				.authorizeRequests().antMatchers("/regist", "/toregist").permitAll().and().authorizeRequests()
//				.anyRequest().authenticated();
//		http.logout().deleteCookies("remove").invalidateHttpSession(false).logoutUrl("/logout")
//				.logoutSuccessUrl("/logoutsuccess").and().rememberMe().and().httpBasic().and().sessionManagement()
//				.maximumSessions(1).expiredUrl("/login?expired");
		
//		http
//		.authorizeRequests()
//			.anyRequest().permitAll()//.authenticated()
//			.and()
//		.formLogin().and()
//		.httpBasic();
		
	      http.formLogin().permitAll()
	      .and()
//	      .authorizeRequests().antMatchers("/main").hasAnyRole("USER","ADMIN").anyRequest().permitAll().and()
      // default protection for all resources (including /oauth/authorize)
          .authorizeRequests()
              .anyRequest().authenticated();
	}

}

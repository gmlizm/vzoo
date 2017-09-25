package com.aboo.vzoo.authcenter.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	/** JDBC TOKEN STORE */
	@Bean
	public TokenStore tokenStore() {
		return new JdbcTokenStore(dataSource);
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("testid").secret("testsecret")
				.authorizedGrantTypes("authorization_code", "refresh_token", "password").authorities("ROLE_ADMIN","ROLE_USER").scopes("app");
	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//		security.tokenKeyAccess("permitAll()").checkTokenAccess("permitAll()")
//				.allowFormAuthenticationForClients();
		security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
	}

//	@Override
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//		// JdbcUserDetailsManager userDetailsManager = new
//		// JdbcUserDetailsManager();
//		// userDetailsManager.setDataSource(dataSource);
//		// userDetailsManager.setAuthenticationManager(authenticationManager);
//
//		// endpoints.authenticationManager(authenticationManager);
////		endpoints.tokenStore(tokenStore());
//		// endpoints.userDetailsService(userDetailsManager);
//	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("root").password("root").roles("USER","ADMIN");
//  		auth.jdbcAuthentication().dataSource(dataSource);
		// .withDefaultSchema()
		// .withUser("user").password("password").roles("USER").and()
		// .withUser("admin").password("password").roles("USER", "ADMIN");
	}

}

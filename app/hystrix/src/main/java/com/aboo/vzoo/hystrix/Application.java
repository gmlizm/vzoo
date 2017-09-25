package com.aboo.vzoo.hystrix;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ApplicationContext;

@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class Application {
	
	private final static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(Application.class);
		app.setAddCommandLineProperties(false);
		app.setBannerMode(Banner.Mode.OFF);
		ApplicationContext context = app.run(args);
		logger.error("【{}】 started at {}", context.getId(), new Date(context.getStartupDate()));
	}

}

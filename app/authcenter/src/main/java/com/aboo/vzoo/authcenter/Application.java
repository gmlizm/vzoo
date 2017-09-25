package com.aboo.vzoo.authcenter;

import java.util.Date;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(Application.class);
		app.setAddCommandLineProperties(false);
		app.setBannerMode(Banner.Mode.OFF);
		ApplicationContext context = app.run(args);
		System.out.println(String.format("app [%s] started at %s", context.getId(), new Date(context.getStartupDate())));
	}

}

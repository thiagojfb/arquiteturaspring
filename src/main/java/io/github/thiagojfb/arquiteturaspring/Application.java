package io.github.thiagojfb.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.run(args);

		ConfigurableApplicationContext context = builder.context();
		ConfigurableEnvironment environment = context.getEnvironment();
		String property = environment.getProperty("spring.application.name");
		System.out.println("NOME DA APLICAÇÃO: " + property);


	}

}

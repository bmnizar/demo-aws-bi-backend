package com.neoxiontechnologies.demo.backend;

import java.util.Properties;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 ** @BMN 2021
 **
 **/
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.neoxiontechnologies.demo")
@org.springframework.data.jpa.repository.config.EnableJpaRepositories({ "com.neoxiontechnologies.demo.dao" })
@EntityScan("com.neoxiontechnologies.demo.entities")
public class MainDemoBackend {
	public static void main(String[] args) {
		SpringApplicationBuilder managerApplicationBuilder = new SpringApplicationBuilder(MainDemoBackend.class);
		managerApplicationBuilder.properties(getProperties());
		managerApplicationBuilder.run(args);
	}

	private static Properties getProperties() {
		Properties managerProperties = new Properties();
		managerProperties.put("spring.config.name", "application");
		return managerProperties;
	}
}

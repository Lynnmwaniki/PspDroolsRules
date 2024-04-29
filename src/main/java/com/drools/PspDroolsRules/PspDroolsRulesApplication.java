package com.drools.PspDroolsRules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PspDroolsRulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PspDroolsRulesApplication.class, args);
	}

}

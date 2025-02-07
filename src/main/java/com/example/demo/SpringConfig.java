package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SpringConfig {
  
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(auth -> auth.anyRequest().authenticated()) //Rrq restrict to accessing the resource & mustbe authenticated
				.oauth2Login(Customizer.withDefaults())
				.build();
	}
}

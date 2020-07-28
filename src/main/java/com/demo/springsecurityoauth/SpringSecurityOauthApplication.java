package com.demo.springsecurityoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso //used for single sign on
public class SpringSecurityOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauthApplication.class, args);
	}

}

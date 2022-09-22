/*
package com.boardtospring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration     //환경설정 파일임을 명시하는 어노테이션
@EnableWebSecurity //모든 요청이 스프링 세큐리티의 제어를 받도록 만드는 어노테이션
public class SecurityConfig {
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)
			throws Exception {
		http.authorizeRequests().antMatchers("/**").permitAll();
		return http.build();
	}
}
*/
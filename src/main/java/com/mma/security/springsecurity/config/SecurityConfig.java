package com.mma.security.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests(
                authorizationConfig -> {
                    authorizationConfig.requestMatchers("/public").permitAll();
                    authorizationConfig.requestMatchers("/logout").permitAll();
                    authorizationConfig.anyRequest().authenticated();
                }
        ).formLogin(Customizer.withDefaults()).build();
    }
}

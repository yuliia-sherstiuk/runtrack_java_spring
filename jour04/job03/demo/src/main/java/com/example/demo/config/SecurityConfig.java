package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // Создаём пользователей в памяти
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withUsername("user")
                .password("{noop}password") // {noop} = без шифрования
                .roles("USER")
                .build();
        UserDetails admin = User.withUsername("admin")
                .password("{noop}admin")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }

    // Конфигурация безопасности
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")   // указываем наш HTML
                .permitAll()           // страница доступна всем
            )
            .logout(logout -> logout.permitAll());

        return http.build();
    }
}

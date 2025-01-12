package com.example.To_Do_List.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Define URL authorization rules
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/register", "/css/**", "/js/**").permitAll() // Allow public access to registration and static resources
                        .anyRequest().authenticated() // All other requests require authentication
                )
                // Form-based login configuration
                .formLogin(form -> form
                        .loginPage("/login") // Custom login page
                        .defaultSuccessUrl("/dashboard", true) // Redirect after successful login
                        .permitAll()
                )
                // Logout configuration
                .logout(logout -> logout
                        .logoutSuccessUrl("/login?logout") // Redirect after logout
                        .permitAll()
                )
                // CSRF protection (enabled by default but customizable)
                .csrf(csrf -> csrf
                        .disable() // Disable if you're using a REST API; otherwise, remove this line
                );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Password encryption for secure storage
    }
}

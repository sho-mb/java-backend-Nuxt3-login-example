// package com.example.loginService.auth;

// import java.time.Duration;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
// import org.springframework.web.filter.CorsFilter;


// @Configuration
// public class SecurityConfig {
  
//   @Value("${apikey.header}")
//   private String apiKeyHeaderName;

//   @Bean
//   public CorsFilter corsFilter() {
//       UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//       CorsConfiguration config = new CorsConfiguration();
//       config.setAllowCredentials(true);
//       config.setAllowedOriginPatterns(List.of("*"));
//       config.setAllowedHeaders(List.of("Origin", "Content-Type", "Accept", "Authorization", apiKeyHeaderName));
//       config.setAllowedMethods(List.of("GET", "POST", "PUT", "PATCH", "DELETE"));
//       config.setMaxAge(Duration.ofMinutes(10));
//       source.registerCorsConfiguration("/**", config);
//       return new CorsFilter(source);
//   }
// }

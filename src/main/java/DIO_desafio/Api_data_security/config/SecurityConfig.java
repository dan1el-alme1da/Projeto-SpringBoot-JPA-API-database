package DIO_desafio.Api_data_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

//CSRF Protection: Por padrão, o Spring Security habilita proteção CSRF para requisições que modificam estado (como POST).
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // Nova forma de desabilitar CSRF
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/usuarios").permitAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(basic -> basic.init(http)); // Nova forma de habilitar httpBasic

        return http.build();
    }
}

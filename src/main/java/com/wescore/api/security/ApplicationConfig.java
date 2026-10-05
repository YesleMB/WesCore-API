package com.wescore.api.security;

import com.wescore.api.repository.PromotorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final PromotorRepository promotorRepository;

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> {
            try {
                Long id = Long.parseLong(username);
                return promotorRepository.findById(id)
                        .map(promotor -> org.springframework.security.core.userdetails.User
                                .builder()
                                .username(String.valueOf(promotor.getId()))
                                .password(promotor.getSenha())
                                .roles("USER")
                                .build()
                        )
                        .orElseThrow(() -> new UsernameNotFoundException("Promotor não encontrado com o id: " + username));
            } catch (NumberFormatException e) {
                throw new UsernameNotFoundException("Formato de ID inválido: " + username);
            }
        };
    }

    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailsService userDetailsService) {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}
}
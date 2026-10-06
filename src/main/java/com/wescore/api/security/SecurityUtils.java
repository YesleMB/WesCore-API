package com.wescore.api.security;

import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils {
    public static Long getUsuarioLogadoId() {
        String idString = SecurityContextHolder.getContext().getAuthentication().getName();
        return Long.valueOf(idString);
    }
}
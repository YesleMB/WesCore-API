package com.wescore.api.security;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TokenBlacklistService {

    private final Map<String, LocalDateTime> blacklist = new ConcurrentHashMap<>();

    public void addToBlacklist(String token) {
        blacklist.put(token, LocalDateTime.now().plusHours(5));
    }

    public boolean isBlacklisted(String token) {
        return blacklist.containsKey(token);
    }

    @Scheduled(fixedRate = 3600000)
    public void removeExpiredTokens() {
        LocalDateTime now = LocalDateTime.now();
        blacklist.entrySet().removeIf(entry -> entry.getValue().isBefore(now));
    }
}

package com.fsd.identifyserver.service;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.fsd.identifyserver.entity.TokenEntity;


@Component
public class RedisTokenService {

    @Autowired
    private RedisTemplate<String, TokenEntity> redisTemplate;

    public TokenEntity createToken(String userName) {
        String token =JwtTokenUtils.createToken(userName, false);
        TokenEntity tokenEntity = new TokenEntity(userName, token);
        redisTemplate.opsForValue().set(userName, tokenEntity, JwtTokenUtils.EXPIRATION, TimeUnit.SECONDS);
        return tokenEntity;
    }

    public boolean checkToken(String inputToken) {
        if (inputToken == null) {
            return false;
        }
        String userName = JwtTokenUtils.getUsername(inputToken);
        TokenEntity token = redisTemplate.opsForValue().get(userName);
        if (token == null || StringUtils.isEmpty(token.getToken())) {
            return false;
        }
        return token.getToken().equals(inputToken);
    }

    public void deleteToken(String userName) {
        redisTemplate.delete(userName);
    }
}
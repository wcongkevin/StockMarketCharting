package com.fsd.identifyserver.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.fsd.identifyserver.entity.TokenEntity;



@EnableAutoConfiguration
@Configuration
public class RedisConfig {
	
    @Bean
    public RedisTemplate<String, TokenEntity> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, TokenEntity> redisTemplate = new RedisTemplate<String, TokenEntity>();
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }
}

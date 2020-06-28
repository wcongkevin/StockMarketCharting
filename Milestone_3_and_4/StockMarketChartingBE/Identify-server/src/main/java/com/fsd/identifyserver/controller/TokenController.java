package com.fsd.identifyserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.identifyserver.entity.UserEntity;
import com.fsd.identifyserver.service.RedisTokenService;


@RestController
@RequestMapping("/token")
public class TokenController {
	
    @Autowired
	private RedisTokenService redisService;

	@PostMapping("/checkToken")
	public boolean checkToken(@RequestBody String token) {
		return redisService.checkToken(token);
	}

	@PostMapping("/login")
	public String login(@RequestBody UserEntity entity) {
		return redisService.createToken(entity.getUserName()).getToken();
	}

	@PostMapping("/logout")
    public void logout(@RequestBody UserEntity entity){
        redisService.deleteToken(entity.getUserName());
    }

	@GetMapping("/	")
	public String test() {
		return "test";
	}

}

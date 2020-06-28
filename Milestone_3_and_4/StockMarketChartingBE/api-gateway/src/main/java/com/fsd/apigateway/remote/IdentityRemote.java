package com.fsd.apigateway.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "identity-service", fallback = IdentityRemoteHystrix.class)
public interface IdentityRemote {
    @RequestMapping(value = "/token/checkToken", method = RequestMethod.POST)
    boolean checkToken(@RequestBody String token);
    
    @GetMapping("/token/token")
    String test();

}

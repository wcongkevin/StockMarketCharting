package com.fsd.apigateway.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class IdentityRemoteHystrix implements IdentityRemote {
	
	private static final Logger log = LoggerFactory.getLogger(IdentityRemoteHystrix.class);
    @Override
	public boolean checkToken(String token) {
    	log.warn("checkToken connect identity-service:5300 failed");
    	return false;
    }
    
    @Override
	public String test() {
    	log.warn("test connect identity-service:5300 failed");
    	return null;
    }


}

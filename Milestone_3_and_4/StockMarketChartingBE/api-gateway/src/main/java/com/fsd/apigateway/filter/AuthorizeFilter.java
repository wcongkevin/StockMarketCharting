package com.fsd.apigateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;

import com.fsd.apigateway.remote.IdentityRemote;

import reactor.core.publisher.Mono;

@Component
public class AuthorizeFilter implements GlobalFilter, Ordered {
	private static final Logger log = LoggerFactory.getLogger(AuthorizeFilter.class);
    private static final String AUTHORIZE_TOKEN = "token";
    //private static final String AUTHORIZE_UID = "uid";

    @Autowired
    private IdentityRemote identityRemote;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        if(request.getPath().value().contains("/login")|| request.getPath().value().contains("/logout")) {
            return chain.filter(exchange);
        }
        HttpHeaders headers = request.getHeaders();
        String token = headers.getFirst("Authorization");
        //String uid = headers.getFirst(AUTHORIZE_UID);
        if (token == null) {
            token = request.getQueryParams().getFirst(AUTHORIZE_TOKEN);
        }
//        if (uid == null) {
//            uid = request.getQueryParams().getFirst(AUTHORIZE_UID);
//        }

        ServerHttpResponse response = exchange.getResponse();
        if (StringUtils.isEmpty(token)) {
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        }
        token = token.replace("Bearer", "").trim();
        log.info(token);
        boolean checkResult = identityRemote.checkToken(token);
        
        log.info("check token result" + checkResult);
        if (!checkResult) {
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        }

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
package com.webitalkie.springmvc.handler;

import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;

import reactor.core.publisher.Mono;

public class MyHttpHandler implements HttpHandler {

	@Override
	public Mono<Void> handle(ServerHttpRequest arg0, ServerHttpResponse arg1) {

		return null;
	}

}

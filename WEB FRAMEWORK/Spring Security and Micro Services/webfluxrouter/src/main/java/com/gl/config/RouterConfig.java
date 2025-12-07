package com.gl.config;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.gl.handler.PersonHandler;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> personRoutes(PersonHandler handler) {
        return route()
                .path("/persons", builder -> builder
                        .GET("", accept(MediaType.APPLICATION_JSON), handler::getAllPersons)
                        .GET("/{id}", accept(MediaType.APPLICATION_JSON), handler::getPerson)
                        .POST("", accept(MediaType.APPLICATION_JSON), handler::createPerson)
                        .PUT("/{id}", accept(MediaType.APPLICATION_JSON), handler::updatePerson)
                        .DELETE("/{id}", handler::deletePerson)
                )
                .build();
    }
}

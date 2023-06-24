package com.example.incode.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI obminyashkaOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Test Task for Java Developer Position")
                        .description("Simple RESTful API in Java using Spring Boot, which supports operations on a `User` entity.")
                        .version("v0.1.0")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Simple RESTful API in Java using Spring Boot, which supports operations on a `User` entity.")
                        .url("https://github.com/ennnbaev/incode_task"));
    }
}
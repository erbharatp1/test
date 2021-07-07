package com.iht.fbs.util;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    private static final String BASIC_AUTH = "basicAuth";
    private static final String BEARER_AUTH = "Bearer";
 
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.iht.fbs")).paths(PathSelectors.any()).build()
                .securitySchemes(securitySchemes()).securityContexts(Arrays.asList(securityContext()));
    }
 
   
    private List<SecurityScheme> securitySchemes() {
        return Arrays.asList(new BasicAuth(BASIC_AUTH), new ApiKey(BEARER_AUTH, "Authorization", "header"));
    }
 
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(Arrays.asList(basicAuthReference(), bearerAuthReference())).forPaths(PathSelectors.ant("/**")).build();
    }
 
    private SecurityReference basicAuthReference() {
        return new SecurityReference(BASIC_AUTH, new AuthorizationScope[0]);
    }
 
    private SecurityReference bearerAuthReference() {
        return new SecurityReference(BEARER_AUTH, new AuthorizationScope[0]);
    }
}
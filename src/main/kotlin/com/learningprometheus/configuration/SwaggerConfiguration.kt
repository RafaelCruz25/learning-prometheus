package com.learningprometheus.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import javax.servlet.ServletContext

@Controller
@Configuration
@EnableSwagger2
class SwaggerConfiguration {

    @Bean
    fun swaggerSettings(servletContext: ServletContext): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.learningprometheus.controller"))
            .paths(PathSelectors.ant("/**"))
            .build()
    }

    @GetMapping("/")
    fun index(): String {
        return "redirect:swagger-ui.html"
    }
}
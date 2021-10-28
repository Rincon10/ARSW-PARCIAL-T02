package edu.eci.arsw.coronavirus.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
/**
 * @author Iván Camilo Rincón Saavedra
 * @version 10/28/2021
 * Para acceder a swagger http://localhost:8080/your-app-root/swagger-ui/
 * Para  Generear un proyecto con springboot usar https://start.spring.io/
 */
@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {

    public Docket documentation(){
        return new Docket( DocumentationType.SWAGGER_2 )
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
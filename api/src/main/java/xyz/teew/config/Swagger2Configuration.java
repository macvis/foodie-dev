package xyz.teew.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author youchao.wen
 * @date 2020/5/3.
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    /**
     * swagger2核心配置
     */
    @Bean
    public Docket init(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder().title("吃货电商平台接口api").description("吃货电商接口api")
                        .contact(new Contact("jane doe", "10086", "mail@mail.com"))
                        .version("1.0.0").termsOfServiceUrl("teew.xyz").build())
                .select().apis(RequestHandlerSelectors.basePackage("xyz.teew.controller"))
                .paths(PathSelectors.any()).build();
    }
}

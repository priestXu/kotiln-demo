package com.goodsogood.ows.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * @author goodsogood
 * @date 07/02/2018
 * @description class Swagger2UiConfiguration
 */
@Configuration
@EnableSwagger2
class Swagger2UiConfiguration : WebMvcConfigurerAdapter() {
    @Value("\${swagger.show}")
    private val swaggerShow = false

    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
            .enable(swaggerShow)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.goodsogood"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo())

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
                .title("kt-demo")
                .description("kt & springboot demo")
                .version("0.0.0.1")
                .build()
    }

}